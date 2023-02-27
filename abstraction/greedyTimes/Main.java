
package workingWithAbstraction.greedyTimes;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long input = Long.parseLong(scanner.nextLine());
        String[] safe = scanner.nextLine().split("\\s+");

        Map<String, LinkedHashMap<String, Long>> bag = new LinkedHashMap<>();
        long gold = 0;
        long gems = 0;
        long money = 0;

        for (int i = 0; i < safe.length; i += 2) {
            String name = safe[i];
            long numElements = Long.parseLong(safe[i + 1]);

            String item = "";

            item = getItem(name, item);

            if (item.equals("")) {
                continue;
            } else if (input < bag.values().stream().
                    map(Map::values).flatMap(Collection::stream).
                    mapToLong(e -> e).sum() + numElements) {
                continue;
            }

            switch (item) {
                case "Gem":
                    if (!bag.containsKey(item)) {
                        if (bag.containsKey("Gold")) {
                            if (numElements > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(item).values().stream()
                            .mapToLong(e -> e).sum() + numElements > bag.get("Gold").
                            values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;

                case "Cash":
                    if (!bag.containsKey(item)) {
                        if (bag.containsKey("Gem")) {
                            if (numElements > bag.get("Gold").values().stream().mapToLong(e -> e).sum()) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else if (bag.get(item).values().stream().mapToLong(e -> e).sum() + numElements > bag.get("Gem").values().stream().mapToLong(e -> e).sum()) {
                        continue;
                    }
                    break;
            }

            addInBag(bag, name, numElements, item);

            if (item.equals("Gold")) {
                gold += numElements;
            } else if (item.equals("Gem")) {
                gems += numElements;
            } else if (item.equals("Cash")) {
                money += numElements;
            }
        }

        bag.forEach((key, value) -> {
            sumKey(key, value);
            sortBag(value);
        });
    }

    private static void sortBag(LinkedHashMap<String, Long> value) {
        value.entrySet().stream().sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey())).forEach(i -> System.out.println("##" + i.getKey() + " - " + i.getValue()));
    }

    private static void sumKey(String key, LinkedHashMap<String, Long> value) {
        Long sumValues = value.values().stream().mapToLong(l -> l).sum();

        System.out.println(String.format("<%s> $%s", key, sumValues));
    }

    private static void addInBag(Map<String, LinkedHashMap<String, Long>> bag, String name, long numElements, String item) {
        if (!bag.containsKey(item)) {
            bag.put(item, new LinkedHashMap<String, Long>());
        }

        if (!bag.get(item).containsKey(name)) {
            bag.get(item).put(name, 0L);
        }

        bag.get(item).put(name, bag.get(item).get(name) + numElements);
    }

    private static String getItem(String name, String item) {
        if (name.length() == 3) {
            item = "Cash";
        } else if (name.toLowerCase().endsWith("gem")) {
            item = "Gem";
        } else if (name.toLowerCase().equals("gold")) {
            item = "Gold";
        }
        return item;
    }
}
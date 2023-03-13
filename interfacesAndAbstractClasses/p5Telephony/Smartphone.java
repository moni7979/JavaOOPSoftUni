package p5Telephony;

import java.util.LinkedList;
import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List <String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {

        StringBuilder sb = new StringBuilder();
        for (String url : urls) {

            boolean isValid = true;
            for (char c : url.toCharArray()) {

                if (Character.isDigit(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                sb.append("Browsing: ").append(url).append("!");
                sb.append(System.lineSeparator());
            } else {
                sb.append("Invalid URL!");
                sb.append(System.lineSeparator());
            }
        }
        return String.valueOf(sb);
    }

    @Override
    public String call() {

        StringBuilder sb = new StringBuilder();
        for (String number : numbers) {

            boolean isValid = true;
            for (char c : number.toCharArray()) {
                if (!Character.isDigit(c)) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                sb.append("Calling... ").append(number);
                sb.append(System.lineSeparator());
            } else {
                sb.append("Invalid number!");
            }

        }
        return String.valueOf(sb);
    }
}

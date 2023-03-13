package encapsulation.shoppingSpree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new LinkedList<>();
        List<Product> productList = new LinkedList<>();

        String[] personInput = scanner.nextLine().split(";");
        createPerson(personList, personInput);

        String[] productInput = scanner.nextLine().split(";");
        createProduct(productList, productInput);


        String command = scanner.nextLine();
        while (!command.equals("END")) {
            String nameCommand = command.split(" ")[0];
            String productCommand = command.split(" ")[1];

            for (Person person : personList) {
                if (person.getName().equals(nameCommand)) {
                    for (Product product : productList) {
                        if (product.getName().equals(productCommand)) {
                            try {
                                person.buyProduct(product);

                            } catch (Exception e) {
                                System.out.println(person.getName() + " can't afford " + product.getName());
                            }
                        }
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (Person person : personList) {
            if (!person.getProducts().isEmpty()) {
                System.out.print(person.getName() + " - ");

                int index = 0;
                for (Product product : person.getProducts()) {
                    if (index <= person.getProducts().size() - 2) {
                        index += 1;
                        System.out.print(product.getName() + ", ");
                    } else {
                        System.out.println(product.getName());
                    }
                }

            } else {
                System.out.println(person.getName() + " – Nothing bought");
            }
        }


    }

    private static void createProduct(List<Product> productList, String[] productInput) {
        if (productInput.length == 1) {
            createOneProduct(productList, productInput);

        } else if (productInput.length == 2) {
            createTwoProducts(productList, productInput);

        }
    }

    private static void createTwoProducts(List<Product> productList, String[] productInput) {
        String firstProduct = productInput[0];
        String secondProduct = productInput[1];

        String firstProductName = firstProduct.split("=")[0];
        double firstProductCost = Double.parseDouble(firstProduct.split("=")[1]);
        Product firstProductObj = new Product(firstProductName, firstProductCost);
        productList.add(firstProductObj);

        String secondProductName = secondProduct.split("=")[0];
        double secondProductCost = Double.parseDouble(secondProduct.split("=")[1]);
        Product secondProductObj = new Product(secondProductName, secondProductCost);
        productList.add(secondProductObj);
    }

    private static void createOneProduct(List<Product> productList, String[] productInput) {
        String name = productInput[0].split("=")[0];
        double cost = Double.parseDouble(productInput[0].split("=")[1]);

        Product product = new Product(name, cost);
        productList.add(product);
    }

    private static void createPerson(List<Person> personList, String[] personInput) {
        if (personInput.length == 1) {
            createOnePerson(personList, personInput);

        } else if (personInput.length == 2) {
            createTwoPersons(personList, personInput);
        }
    }

    private static void createTwoPersons(List<Person> personList, String[] personInput) {
        String firstPerson = personInput[0];
        String secondPerson = personInput[1];

        String firstPersonName = firstPerson.split("=")[0];
        double firstPersonMoney = Double.parseDouble(firstPerson.split("=")[1]);
        Person firstPersonObj = new Person(firstPersonName, firstPersonMoney);
        personList.add(firstPersonObj);

        String secondPersonName = secondPerson.split("=")[0];
        double secondPersonMoney = Double.parseDouble(secondPerson.split("=")[1]);
        Person secondPersonObj = new Person(secondPersonName, secondPersonMoney);
        personList.add(secondPersonObj);
    }

    private static void createOnePerson(List<Person> personList, String[] personInput) {
        String name = personInput[0].split("=")[0];
        double money = Double.parseDouble(personInput[0].split("=")[1]);

        Person person = new Person(name, money);
        personList.add(person);

    }
}

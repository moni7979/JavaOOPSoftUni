package abstraction.p4TrafficLight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] lightsAsStrings = scanner.nextLine().split("\\s+");

        TrafficLight[] trafficLights = new TrafficLight[lightsAsStrings.length];
        for (int i = 0; i < lightsAsStrings.length; i++) {
            String s = lightsAsStrings[i];
            TrafficLight.Signal signal = TrafficLight.Signal.valueOf(s);
            trafficLights[i] = new TrafficLight(signal);
        }
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            udateTrafficLights(trafficLights);
            printTrafficLights(trafficLights);
        }


    }

    private static void printTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            System.out.print(trafficLight.getSignal() + " ");
        }
        System.out.println();
    }

    private static void udateTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.update();
        }
    }
}

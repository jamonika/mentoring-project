package mathematician.runner;

import dtos.Mathematician;

import java.util.Scanner;

public class MathematicianRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj działanie");
        String operation = scanner.nextLine();

        Integer result = CalculateResult.getResult(operation);

        System.out.println("Wynik: " + result);
    }


}

package mathematician.runner;

import dtos.Mathematician;

public class CalculateResult {
    public static Integer getResult(String operation) {
        String[] splittedOperation = operation.split(" ");
        Mathematician mathematician = Mathematician.getInstance();
        int a = Integer.valueOf(splittedOperation[0]);
        int b = Integer.valueOf(splittedOperation[2]);
        Integer result = null;

        switch(splittedOperation[1]) {
            case "+":
                result = mathematician.add(a, b);
                break;
            case "-":
                result = mathematician.subtract(a, b);
                break;
            case "*":
                result = mathematician.multiply(a, b);
                break;
            case "/":
                result = mathematician.divide(a, b);
                break;
        }
        return result;
    }
}

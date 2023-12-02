public class Main {
    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();
        System.out.println(calculatorService.calculate(1, 1, '+'));
    }

}

public class CalculatorService {
    public int calculate(int a, int b, char operator) {
        if (operator == '+') {
            return a + b;
        } else if (operator == '-') {
            return a - b;
        } else {
            throw new
        }

    }

}

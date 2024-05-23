package Seminars.Lesson_4;

public class HomeWork_3 {
    /*
import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    private Deque<Double> results = new ArrayDeque<>();

    public double calculate(char op, int a, int b) {
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0) {
                    result = (double) a / b;
                } else {
                    System.out.println("Error: Division by zero");
                    return 0;
                }
                break;
            case '<':
                if (!results.isEmpty()) {
                    results.removeLast();
                    result = results.isEmpty() ? 0 : results.getLast();
                } else {
                    result = 0;
                }
                break;
            default:
                System.out.println("Error: Unknown operator");
                return 0;
        }
        results.add(result);
        return result;
    }
}

public class Printer {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            a = 3;
            op = '+';
            b = 7;
            c = 4;
            op2 = '+';
            d = 7;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
     */
}

package lesson_2_3.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char operation;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public char getOperation() {
        return operation;
    }

    public int calculate() {
        switch(operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                int result = 1;
                for (int i = 1; i <= num2 ; i++) {
                    result *= num1;
                }
                return result;
            default:
                System.out.println("Математическая операция не поддерживается");
                return 0;
       }
    }
}
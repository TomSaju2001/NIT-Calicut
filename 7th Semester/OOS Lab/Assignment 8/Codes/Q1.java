import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            char operator = input.nextLine().trim().charAt(0);
            int operand1, operand2;
            switch (operator){
                case '+':
                    operand1 = Integer.parseInt(input.nextLine().trim());
                    operand2 = Integer.parseInt(input.nextLine().trim());
                    System.out.println(operand1+operand2);
                    break;
                case '-':
                    operand1 = Integer.parseInt(input.nextLine().trim());
                    operand2 = Integer.parseInt(input.nextLine().trim());
                    System.out.println(operand1-operand2);
                    break;
                case '*':
                    operand1 = Integer.parseInt(input.nextLine().trim());
                    operand2 = Integer.parseInt(input.nextLine().trim());
                    System.out.println(operand1*operand2);
                    break;
                case '/':
                    operand1 = Integer.parseInt(input.nextLine().trim());
                    operand2 = Integer.parseInt(input.nextLine().trim());
                    if(operand2==0){
                        throw new ArithmeticException("Division by zero");
                    }else{
                        System.out.println(operand1 / operand2);
                    }
                    break;
                case '%':
                    operand1 = Integer.parseInt(input.nextLine().trim());
                    operand2 = Integer.parseInt(input.nextLine().trim());
                    if(operand2==0){
                        throw new ArithmeticException("Division by zero");
                    }else{
                        System.out.println(operand1 % operand2);
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Enter a valid operator.");
                    break;
            }
            input.close();
        }catch (Exception e){
            System.out.println(e + " handled. Enter a valid argument.");
        }
    }
}

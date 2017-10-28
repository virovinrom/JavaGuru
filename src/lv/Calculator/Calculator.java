package lv.Calculator;
import java.util.Scanner;

public class Calculator {
    private String[] userInputSting = new String[3];

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.userInput();
        System.out.println("Answer: "  + calc.operation());
    }

    private double operation(){
        Operation operation;
        if (userInputSting[1].equals("+")){
            operation = new Summa();
        }else if (userInputSting[1].equals("-")){
            operation = new Subtraction();
        }else  if (userInputSting[1].equals("/")){
            operation = new Division();
        }else{
            operation = new Multiplication();
        }
        return operation.calc(Double.valueOf(userInputSting[0]), Double.valueOf(userInputSting[2]));
    }
    private void userInput(){
        String[] countInput = {"first number: ", "sign: ", "second number; "};
        for (int i = 0; i < 3; i++){
            System.out.println("Please enter " + countInput[i]);
            Scanner scanner = new Scanner(System.in);
            userInputSting[i] = scanner.nextLine();
            if (userInputSting[i].isEmpty()){ // Можно было всунуть проверку на значение, но не это было целью
                System.out.println("Wrong input. Repeat");
                i--;
            }
        }
    }
}
/*
Please enter first number:
4
Please enter sign:
+
Please enter second number;
2
+
Answer: 6.0

Process finished with exit code 0
 */

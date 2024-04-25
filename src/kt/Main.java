package kt;


import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* EXERCISE 3 - Calculator with Classes
         *
         * Create the same Calculator application that we had before!
         *
         * This time however, make classes for each operation. Make a custom Interface that all of them implement!
         * Also make a Calculator class which deals with the calculation itself.
         *
         *
         */

        // スキャナの準備
        Scanner scanner = new Scanner(System.in);

        // 継続フラグの初期化
        boolean continueCalculation = true;

        // 継続フラグがtrueならループ
        while (continueCalculation) {

            // 演算子の入力
            System.out.println("write the operator (+, -, *, /): ");
            String operator = scanner.next();

            // 数値１の入力
            System.out.println("write the first number: ");
            double num1 = scanner.nextInt();

            // 数値２の入力
            System.out.println("write the second number: ");
            double num2 = scanner.nextInt();

            // 演算処理
            Calculator calc = new Calculator(operator, num1, num2);
            double answer = calc.performOperation();

            // 演算結果出力
            System.out.println("the answer is: " + answer);

            // 継続するか選択
            continueCalculation = isContinuing();
        }
    }

    public static boolean isContinuing() {
        while (true) {
            System.out.println("do you want to continue? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.next();

            // 継続しない場合
            if (Objects.equals(choice, "y")) {
                return true;
            } else if (Objects.equals(choice, "n")) {
                return false;
            }
        }
    }
}
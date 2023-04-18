package kadai2;

import java.util.Scanner;

public class IfPractice02 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        var num = new Scanner(System.in);
        int input = num.nextInt();

        if (input >= 80 && input <= 100) {
            System.out.print("A評価です");
        } else if (input >= 60 && input < 80) {
            System.out.println("B評価です");
        } else if (input >= 40 && input < 60) {
            System.out.println("C評価です");
        } else if (input >= 20 && input < 40) {
            System.out.println("D評価です");
        } else {
            System.out.println("E評価です");
        }
    }
}
package kadai2;

import java.util.Scanner;

public class IfPractice03 {
    public static void main(String[] args) {
        System.out.print("数値を入力してください：");
        var sc = new Scanner(System.in);
        int input = sc.nextInt();

        if (input >= 60 && input % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

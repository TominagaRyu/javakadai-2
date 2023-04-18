package kadai2;

import java.util.Scanner;

public class IfPractice04 {
    public static void main(String[] args){
        System.out.print("数値を入力してください：");
        var num = new Scanner(System.in);
        int input = num.nextInt();

        if(input % 4 == 0){
            if(input % 100 == 0) {
                if (input % 400 == 0) {
                    System.out.println("うるう年です");
                }else{
                    System.out.println("うるう年ではありません");
                }
            }else{
                System.out.println("うるう年です");
            }
        }else{
            System.out.println("うるう年ではありません");
        }
    }
}

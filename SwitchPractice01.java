package kadai2;

import java.util.Scanner;

public class SwitchPractice01 {
    public static void main(String[] args){
        var str = new Scanner(System.in);
        System.out.print("文字列を入力してください：");
        String st1 = str.nextLine();

        switch (st1) {
            case "赤" -> System.out.println("赤ですね。進んではいけません。");
            case "黄" -> System.out.println("黄ですね。止まってください。");
            case "青" -> System.out.println("青ですね。進んでください。");
            default -> System.out.println("赤、青、黄のいずれかを選択してください。");
        }

        }
    }


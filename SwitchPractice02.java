package kadai2;

import java.util.Scanner;

public class SwitchPractice02 {
    public static void main(String[] args){
        var str = new Scanner(System.in);
        System.out.print("文字列を入力してください：");
        String st = str.nextLine();

        switch (st) {
            case "品川" -> System.out.println("東京まで 田町 浜松町 新橋 有楽町 を通過します");
            case "田町" -> System.out.println("東京まで 浜松町 新橋 有楽町 を通過します");
            case "浜松町" -> System.out.println("東京まで 新橋 有楽町 を通過します");
            case "新橋" -> System.out.println("東京まで 有楽町 を追加します");
        }
    }
}

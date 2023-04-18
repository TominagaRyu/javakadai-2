package kadai2;

import java.util.Scanner;

public class StringCompare01 {
    public static void main(String[] args){
        var str = new Scanner(System.in);
        System.out.print("文字列を入力してください：");
        String st1 = str.nextLine();
        String st2 = str.nextLine();

        if(st1.equals(st2)){
            System.out.println("入力値が一致しました");
        }else{
            System.out.println("入力値が一致しません");
        }
    }
}

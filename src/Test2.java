package src;

import java.util.Scanner;

/**
*功能:计算某字符出现的次数
*作者:houjianxin
*时间:2022/3/14  16:46
*/
public class Test2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input1= s.nextLine();
        String input2 = s.nextLine();
        String split3 = input1.toUpperCase().replaceAll(input2.toUpperCase(),"");
        System.out.println(input1.length() - split3.length());
    }
}

package src;

import java.util.Scanner;

/**
 *功能:字符串最后一个单词的长度
 *作者:houjianxin
 *时间:
 */
public class Test1 {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] s1 =s.split(" ");
        int i = s1.length - 1;
        System.out.println(i);
        System.out.println(s1[s1.length-1].length());

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();


        System.out.println(s.length());//位数15
       System.out.println(s.lastIndexOf(" "));//
       System.out.println(s.lastIndexOf(" ") + 1);// 空格索引s.lastIndexOf(" ") 空格位数 +1 n的位数加+1
        int i =  s.length() - (s.lastIndexOf(" ")+1) +1 -1 ;
        System.out.println(i);

    }
}

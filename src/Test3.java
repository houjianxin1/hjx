package src;

import java.util.Scanner;
import java.util.TreeSet;

/**
*功能:随机数(较难)
*作者:houjianxin
*时间:2022/3/15  11:24
*/
public class Test3 {
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);
        //hasNext() 判断输入（文件，字符串，键盘等输入流）是否还有下一个输入项，若有返回true，若没有，返回false
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            System.out.println("请输入"+num+"个数");
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i <num ; i++) {
                 int ccur = scanner.nextInt();//碰到 空格 或者回车 都算 输过一次
                 set.add(ccur);
            }
            for (int i :set) {
                //输入函数放在hastnext()里，因为一直要求有输入
                //一直是true，所以将for循环的输出函数放在while之后，就会一直运行不到，一直要求有输入
                System.out.println(i);
            }

            }
        }

    }


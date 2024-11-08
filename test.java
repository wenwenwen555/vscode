import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "abc.jpg", "d.gif", "ef.png", "hijk.jpg", "lmn.gif", "opqrst.jpg");
        Scanner sc = new Scanner(System.in);
        System.out.println("1-.jpg,2-.gif,3-.png");
        System.out.println("请输入你想查询的文件格式:");
        int num = sc.nextInt();
        if (num==1) {
            list.stream()
                .filter(s -> "jpg".equals(s.split("\\.")[1]))
                .forEach(s -> System.out.println(s));
        }else if (num ==2) {
            list.stream()
                .filter(s -> "gif".equals(s.split("\\.")[1]))
                .forEach(s -> System.out.println(s));
        }else if (num == 3) {
            list.stream()
                .filter(s -> "png".equals(s.split("\\.")[1]))
                .forEach(s -> System.out.println(s));
        }
        sc.close();
    }
}
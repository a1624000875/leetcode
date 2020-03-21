package IO;


import java.io.FileInputStream;
import java.util.Scanner;

public class IOTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(new FileInputStream("e://Inputfile.txt"));
            int sum = 0;
            while (scanner.hasNext()){
                String str = scanner.next();
                // 利用正则表达式判断是数字或后面有没有标点
                if (str.matches("\\d+,") ||str.matches("\\d+.")){
                    if (str.contains(",")||str.contains(".")){
                        str = str.substring(0, str.length() - 1);
                    }
                    sum += Integer.parseInt(str);
                }
            }
            System.out.println(sum);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

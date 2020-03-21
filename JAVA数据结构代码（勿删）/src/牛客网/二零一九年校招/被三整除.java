package 牛客网.二零一九年校招;

import java.util.Scanner;
public class 被三整除{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int start = s.nextInt();
        int end = s.nextInt();
        if(start>end){
            System.out.println(0);
            return;
        }
        int count = 0;
        for(long i = start;i<=end;i++){
            long r = ((1+i)*i/2)%3;
            if(r==0)
                count++;
        }
        System.out.println(count);
    }
}
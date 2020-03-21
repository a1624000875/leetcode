package 牛客网.二零一九年校招;

import java.util.Scanner;

/**
 * 题目描述
 * 牛牛去犇犇老师家补课，出门的时候面向北方，但是现在他迷路了。虽然他手里有一张地图，但是他需要知道自己面向哪个方向，请你帮帮他。
 * 输入描述:
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含一个正整数，表示转方向的次数N(N<=1000)。
 * 接下来的一行包含一个长度为N的字符串，由L和R组成，L表示向左转，R表示向右转。
 * 输出描述:
 * 输出牛牛最后面向的方向，N表示北，S表示南，E表示东，W表示西。
 * <p>
 * 示例1
 * 输入
 * 3
 * LRR
 * <p>
 * 输出
 * E
 */
public class 迷路的牛牛 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();      //n表示转向方向次数
        char face = 'N';        //face表示牛牛的朝向，起始是N
        String str = scanner.next();    //输入拐弯次数
        for (int j = 0; j < str.length(); j++) {
            switch (str.charAt(j)) {
                case 'L':
                    if (face == 'N') {
                        face = 'W';
                    } else if (face == 'W') {
                        face = 'S';
                    } else if (face == 'S') {
                        face = 'E';
                    } else {
                        face = 'N';
                    }
                    break;
                case 'R':
                    if (face == 'N') {
                        face = 'E';
                    } else if (face == 'E') {
                        face = 'S';
                    } else if (face == 'S') {
                        face = 'W';
                    } else {
                        face = 'N';
                    }
                    break;
                default:
                    break;
            }
        }
        System.out.println(face);
    }
}

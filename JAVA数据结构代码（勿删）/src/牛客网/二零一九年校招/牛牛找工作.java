package 牛客网.二零一九年校招;

import java.util.*;

/**
 * 题目描述
 * 为了找到自己满意的工作，牛牛收集了每种工作的难度和报酬。
 * 牛牛选工作的标准是在难度不超过自身能力值的情况下，牛牛选择报酬最高的工作。
 * 在牛牛选定了自己的工作后，牛牛的小伙伴们来找牛牛帮忙选工作，牛牛依然使用自己的标准来帮助小伙伴们。
 * 牛牛的小伙伴太多了，于是他只好把这个任务交给了你。
 * <p>
 * 输入描述:
 * <p>
 * 每个输入包含一个测试用例。
 * 每个测试用例的第一行包含两个正整数，分别表示工作的数量N(N<=100000)和小伙伴的数量M(M<=100000)。
 * 接下来的N行每行包含两个正整数，分别表示该项工作的难度Di(Di<=1000000000)和报酬Pi(Pi<=1000000000)。
 * 接下来的一行包含M个正整数，分别表示M个小伙伴的能力值Ai(Ai<=1000000000)。
 * 保证不存在两项工作的报酬相同。
 * <p>
 * 输出描述:
 * 对于每个小伙伴，在单独的一行输出一个正整数表示他能得到的最高报酬。一个工作可以被多个人选择。
 * 示例1
 * 输入
 * 3 3
 * 1 100
 * 10 1000
 * 1000000000 1001
 * 9 10 1000000000
 * 输出
 * 100
 * 1000
 * 1001
 */
public class 牛牛找工作 {
    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //输入工作数量
        int m = scanner.nextInt();  //输入小伙伴数量
        int[] array = new int[m];   //声明一个数组用来存小伙伴们的能力
        Map<Integer, Integer> map = new TreeMap();       //设置一个map存储工作难度和报酬的键队
        for (int i = 0; i < n; i++) {      //输入难度和报酬的键值对
            int di = scanner.nextInt();
            int pi = scanner.nextInt();
            if (map.containsKey(di)) {      //相同工作难度，报酬高的键值对替换掉报酬低的
                if (pi > map.get(di)) {
                    map.put(di, pi);
                } else {
                    continue;
                }
            }
            map.put(di, pi);
        }
        for (int i = 0; i < m; i++) {      //输入小伙伴的能力
            array[i] = scanner.nextInt();
        }

        int index = 0;
        int[] money = new int[m];  //money表示小伙伴能得到的报酬

*//*        //枚举发现超时,所以我们必须用其他的算法
        for (int i = 0; i < m; i++) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {      //遍历map
                if (array[index] >= entry.getKey()) {        //如果小伙伴的能力值大于等于难度
                    if (money[index] < entry.getValue()) {
                        money[index] = entry.getValue();    // 且存储的这项工作的报酬比原有的大就将其更新
                    }
                } else {
                    index++;
                    break;
                }
            }
        }
        *//*
        for (int i : money) {   //打印结果
            System.out.println(i);
        }
    }
    */
}

/**
 *上一个解题思路导致出现时间复杂度过高，想了一个方法也没有解决，其主要问题是map只能遍历
 * 先用数组进行排序，然后在放到map中
 */
class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();  //输入工作数量
        int m = scanner.nextInt();  //输入小伙伴数量
        int[] array = new int[m];   //声明一个数组用来存小伙伴们的能力
        int[][] works = new int[n][2];  //定义一个works数组存储工作难度和报酬

        Map<Integer, Integer> map = new TreeMap();       //设置一个map存储工作难度和报酬的键队

        for (int i = 0; i < n; i++) {      //输入难度和报酬的键值对
            works[i][0] = scanner.nextInt();    //输入工作难度
            works[i][1] = scanner.nextInt();    //输入工作报酬
        }
        Arrays.sort(works, (e1, e2) -> (int)(e1[0] - e2[0]));   //Lambada表达式，二维数组中，第一个元素按升序排列，如果第一个元素相等，按照第二个元素的升序排列

        map.put(works[0][0],works[0][1]);       //工作难度最低的只有一种
        for(int i = 1; i < works.length; i++) {
            works[i][1] = Math.max(works[i-1][1], works[i][1]);     //从第一个到最后一个将报酬最高的值赋给难度最高的，（防止出现难度低报酬高的情况）
            map.put(works[i][0],works[i][1]);       //将排好的数组放入map中
        }

        for (int i = 0; i < m; i++) {      //输入小伙伴的能力
            array[i] = scanner.nextInt();
        }

        int index = 0;
        int[] money = new int[m];  //money表示小伙伴能得到的报酬

        //经查阅资料后发现treeMap.floorKey方法可以返回与小于或等于给定键的最大键相关联的键值映射，如果没有此键，则 null 。
        for(int i=0;i<m;i++){
            Integer abilityKey = ((TreeMap<Integer, Integer>) map).floorKey(array[i]);
            if (abilityKey==null){
                money[i] = 0;
            }else{
                money[i] = map.get(abilityKey);
            }
        }

        for (int i : money) {   //打印结果
            System.out.println(i);
        }
    }
}
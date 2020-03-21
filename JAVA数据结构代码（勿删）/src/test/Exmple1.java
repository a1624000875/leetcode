package test;

import java.util.Scanner;

public class Exmple1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SeqList<Integer> seqList1 = new SeqList<>();
        for (int i = 0; i < n; i++) {
            int temp = scanner.nextInt();
            seqList1.insert(temp);
        }
        int m = scanner.nextInt();
        SeqList<Integer> seqList2 = new SeqList<>();
        for (int i = 0; i < m; i++) {
            int temp = scanner.nextInt();
            seqList2.insert(temp);
        }

        String str = scanner.next();
        SeqList seqList = operation(str, seqList1, seqList2);

        for (int i = 0; i < seqList.size(); i++) {
            String string = seqList.get(i) + " ";
            System.out.print(string);
        }


    }

    public static SeqList<Integer> operation(String str, SeqList<Integer> seqList1, SeqList<Integer> seqList2) {
        SeqList<Integer> seqList;
        if (str.equals("Union")) {
            seqList = union(seqList1, seqList2);
        } else {
            seqList = Intersection(seqList1, seqList2);
        }
        return seqList;
    }


    public static SeqList<Integer> union(SeqList<Integer> seqList1, SeqList<Integer> seqList2) {
        SeqList<Integer> seqList = seqList1;
        for (int i = 0; i < seqList2.size(); i++) {
            if (!seqList.contains(seqList2.get(i))) {
                seqList.insert(seqList2.get(i));
            }
        }
        return seqList;
    }

    public static SeqList<Integer> Intersection(SeqList<Integer> seqList1, SeqList<Integer> seqList2) {
        SeqList<Integer> seqList = new SeqList<>();
        for (int i = 0; i < seqList2.size(); i++) {
            if (seqList1.contains(seqList2.get(i))) {
                seqList.insert(seqList2.get(i));
            }
        }
        return seqList;
    }
}

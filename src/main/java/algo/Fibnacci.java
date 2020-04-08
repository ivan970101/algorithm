package algo;

import java.util.ArrayList;
import java.util.List;

/*
 * 1,1,2,3,5,8,13
 * */
public class Fibnacci {
    private int recur(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return recur(i - 1) + recur(i - 2);
    }

    private int traverseList(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(1);
        for (int j = 2; j < i; j++) {
            list.add(list.get(j - 1) + list.get(j - 2));
        }
        return list.get(i-1);
    }

    private int traverseArr(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        int[] arr = new int[i + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int j = 2; j < i; j++) {
            arr[j] = arr[j - 1] + arr[j - 2];
        }
        return arr[i-1];
    }

    private int optimize(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        int last = 1;
        int n = 1;
        for (int j = 2; j < i; j++) {
            int sum = n + last;
            n = last;
            last = sum;
        }
        return last;
    }

    public static void main(String[] args) {
        Fibnacci fibnacci = new Fibnacci();
        System.out.println(fibnacci.recur(10));
        System.out.println(fibnacci.traverseList(10));
        System.out.println(fibnacci.traverseArr(10));
        System.out.println(fibnacci.optimize(10));
    }

}

package structure;

public class ArrayOpt {
    private void traverse(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private void traverse1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        ArrayOpt arrayOpt = new ArrayOpt();
        int[] i = new int[]{1,2,3,4};
        arrayOpt.traverse(i);
        arrayOpt.traverse1(i);
    }

}

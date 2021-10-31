public class HomeWork3 {
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
        System.out.println();

    }

    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void plusArray() {
        int[] a = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void fillDiagonal() {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();

        }
    }

    public static int[] methodLen(int len, int value) {
        final int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = value;
        }
        return arr;

    }







    public static void main(String[] args) {
        invertArray();
        fillArray();
        plusArray();
        fillDiagonal();
        int arr[] = methodLen(10,30);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
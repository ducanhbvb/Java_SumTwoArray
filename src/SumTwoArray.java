public class SumTwoArray {
    public static void print(int[][]arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]==0){
                    System.out.print(" ");
                    continue;
                }
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void randomArr(int[][]arr) {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                arr[i][j] = (int)(Math.random()*90+10);
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        int[][] arr2 = new int[6][9];
        int[][] arr3 = new int[11][9];
        randomArr(arr1);
        randomArr(arr2);
        System.out.println("\nprint arr one:");
        print(arr1);
        System.out.println("\nprint arr two:");
        print(arr2);
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i < arr1.length&&j<arr1[0].length) {
                    arr3[i][j] = arr1[i][j];

                } else if(i>=arr1.length&&j<arr2[0].length){
                    arr3[i][j] = arr2[i-arr1.length][j];
                }
            }
        }
        System.out.println("\nprint arr there : ");
        print(arr3);
    }
}

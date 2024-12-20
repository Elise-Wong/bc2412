import java.util.Arrays;

public class Demo2DArray {
  public static void main(String[] args){

    int[] arr = new int[3];
    arr[0] = 1;
    arr[1] = 2;
    arr[2] = 3;

    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    System.out.println(Arrays.toString(arr));



    int[] [] arr2d = new int[2][3]; //2 rows x 3 columns
    arr2d[0][0] = 100;
    arr2d[1][2] = 100;

    for (int i = 0; i < arr2d.length; i++){
      for (int j = 0; j <arr2d[i].length; j++){
        System.out.println(arr2d[i][j]);
      }
    }


    int[][] arr2d2 = new int[][]{{100, 0, 0},{0, 0, 100}};
    System.out.println(Arrays.deepToString(arr2d2));
    int rowLength = arr2d2[1].length; //3


    int[][] arr2d3 = new int[][]{{100, 7, 9}, {101, -9, 100}};
    int[] rowMaxs = new int[arr2d3.length];
    int idx = 0; 
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr2d2.length; i++){
      max = Integer.MIN_VALUE;
      for (int j = 0; j < arr2d3[i].length; j++){
        max = Math.max(arr2d3[i][j], max);
      }
      rowMaxs[idx++] = max;
    }
    System.out.println(Arrays.toString(rowMaxs));





  }
}

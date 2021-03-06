import java.util.Arrays;
public class Sorts {

  /**Bubble sort of an int array.
    *Upon completion, the elements of the array will be in increasing order.
    *@param data  the elements to be sorted.
    */

  public static void bubbleSort(int[] data) {
    int swap;
    boolean swapped = false;
    for (int i = 0; i < data.length-1; i++) {
      for (int j = 0; j < data.length-1-i; j++) {
        if (data[j] > data[j+1]) {
          swap = data[j];
          data[j] = data[j+1];
          data[j+1] = swap;
          swapped = true; //swap happened at least once this time through the array
        }
      }
      //System.out.println(Arrays.toString(data));
      if (!swapped) i = data.length; //swap did not happen on the last time through the array = in order
      else swapped = false; //reseting false;
    }
  }

  public static void selectionSort(int[] data) {
    int smallest;
    int swap;
    for (int i = 0; i < data.length-1; i++) {
      smallest = i;
      for (int j = i; j < data.length; j++) {
        if (data[j] < data[smallest]) {
          smallest = j;
        }
      }
      swap = data[i];
      data[i] = data[smallest];
      data[smallest] = swap;
      //System.out.println(Arrays.toString(data));
    }
  }

  public static void insertionSort(int[] data) {
    int move;
    for (int i = 1; i < data.length; i++) {
      move = data[i];
      for (int j = 0; j <= i; j++) {
        if (data[i] < data[j]) {
          for (int k = i; k > j; k--) {
            data[k] = data[k-1];
          }
          data[j] = move;
        }
      }
      //System.out.println(Arrays.toString(data));
    }
  }

}

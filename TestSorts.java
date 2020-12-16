import java.util.*;
public class TestSorts {

  public static void main(String[] args) {
    int[] mantest1 = new int[5];
    mantest1[0] = 5;
    mantest1[1] = 1;
    mantest1[2] = 12;
    mantest1[3] = -5;
    mantest1[4] = 16;
    Sorts.bubbleSort(mantest1);
    System.out.println();

    int[] mantest2 = new int[5];
    mantest2[0] = 2;
    mantest2[1] = 3;
    mantest2[2] = 4;
    mantest2[3] = 5;
    mantest2[4] = 1;
    Sorts.bubbleSort(mantest2);
    System.out.println();

    int[] mantest3 = new int[6];
    mantest3[0] = 6;
    mantest3[1] = 1;
    mantest3[2] = 2;
    mantest3[3] = 3;
    mantest3[4] = 4;
    mantest3[5] = 5;
    Sorts.bubbleSort(mantest3);
    System.out.println();

    Random ranSeed = new Random();
    int ranInt = ranSeed.nextInt();
    System.out.println("Random Seed: " + ranInt);
    Random ranT = new Random(ranInt);
    int[] randomTest = new int[10];
    for (int i = 0; i < randomTest.length; i++){
      randomTest[i] = ranT.nextInt() % 1000;
    }
    Sorts.bubbleSort(randomTest);
  }

}

import java.util.*;
class Main {
  public static void main(String[] args) {
   int[] arr = new int[18];
   arr = new int[]{18 ,20, 9, 3, 73, 56, 85, 89, 90, 82, 54, 34, 55, 37, 77, 62, 58, 88};
   Sorts Bob = new Sorts();
   System.out.println("Original: " + Arrays.toString(arr));
   System.out.println("Bubble: " + Arrays.toString(Bob.bubble(arr)));
   System.out.println("Selection: " + Arrays.toString(Bob.selection(arr)));
   System.out.println("Insertion: " + Arrays.toString(Bob.insertion(arr)));
  }
}
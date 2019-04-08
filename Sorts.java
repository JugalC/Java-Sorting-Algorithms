import java.util.*;
public class Sorts{
  public static int[] bubble(int[] arr){
    for(int j = arr.length-1; j > 0; j--){
      for(int i = 0; i < j; i++){
        if(arr[i]>arr[i+1]){
          int temp = arr[i];
          arr[i] = arr[i+1];
          arr[i+1] = temp;
        }
      }
    }
    return arr;
  }

  public static int[] selection(int[] arr){
    for(int j = 0; j < arr.length; j++){
      int lowest = arr[j];
      for(int i = j; i < arr.length; i++){
        if(arr[i]<lowest)
          lowest = arr[i];         
      }
      int temp = arr[Arrays.binarySearch(arr, lowest)];
      arr[Arrays.binarySearch(arr, lowest)] = arr[j];
      arr[j] = temp;
    }
    return arr;
  }

  public static int[] insertion(int[] arr){
    for(int j = 1; j < arr.length; j++){
      int temp = arr[j];
      for(int i = j;i > 0; i--){
        if(arr[i]<arr[i-1]);
        
      }
    }
	return arr;
  }
}
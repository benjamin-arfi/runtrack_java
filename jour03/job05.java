import java.util.ArrayList;

public class job05 {
   public static void main(String[] args) {
      int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 1};
      ArrayList<Integer> uniqueList = new ArrayList<Integer>();
      
      for(int i = 0; i < arr.length; i++){
         if(!uniqueList.contains(arr[i])){
            uniqueList.add(arr[i]);
         }
      }
      
      System.out.println("Les valeurs uniques dans le tableau sont :  " + uniqueList);
      for(int i : uniqueList){
         System.out.print(i + " ");
      }
   }
}


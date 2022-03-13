import java.util.*;

public class RearrangeArray {
    public static void main(String[] args) {
        int ar[] = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        rearrange_array(ar);
        int item = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++){
                if(i == ar[j]){
                    item = ar[j];
                    ar[j] = ar[i];
                    ar[i] = item;
                }
            }
        }
    
        for (int i = 0; i < ar.length; i++){
            if (ar[i] != i)
            {
                ar[i] = -1;
            }
        }
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }

   public static void rearrange_array(int ar[]){
       Set<Integer> set = new HashSet<Integer>();

       for (int i = 0; i < ar.length; i++){
           set.add(ar[i]);
       }
       for (int i = 0; i < ar.length; i++){
           if(set.contains(i)){
               ar[i] = i;
           }else{
               ar[i] = -1;
           }
       }

       for (int i = 0; i < ar.length; i++){
           System.out.print(ar[i]+" ");
       }
   }
    
}

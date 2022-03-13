import java.util.*;

class ArrayRotation {
    public static void main(String[] args){
        int ar[] = new int[]{1,2,3,4,5,6,7};
        int d = 2;
        int n = ar.length;

        System.out.println("This is left Rotate one by one");
        leftRotation(ar, d, n);
        printArray(ar, n);

        System.out.println("");

        System.out.println("This is Right Rotate one by one");
        rightRotation(ar, d, n);
        printArray(ar,n);

    }
    public static void leftRotation(int ar[],int d,int n){
        for(int i = 0; i < d; i++){
            lrotation(ar,n);
        }
    }
    public static void rightRotation(int ar[],int d,int n){
        for(int i = 0; i < d; i++){
            lrotation(ar,n);
        }
    }
    public static void rrotation(int ar[],int n){
        int temp = ar[n-1];
        for(int i = n-1; i > 0; i--){
            ar[i] = ar[i-1];
        }
        ar[0] = temp;
    }
    public static void lrotation(int ar[],int n){
        int temp = ar[0];
        for(int i = 0; i < n-1; i++){
            ar[i] = ar[i+1];
        }
        ar[n-1] = temp;
    }
    public static void printArray(int ar[],int n){
        for(int i = 0; i < ar.length; i++){
            System.out.print(ar[i]+" ");
        }
    }
}

public class ArrayRotation2 {
    public static void main(String[] args) throws Exception {
        int ar[] = new int[] {1, 2, 3, 4, 5, 6, 7};
        int n = ar.length;
        int d = 2;

        // leftRotate(ar,d,n);
        // printArray(ar,n);

        rightRotate(ar,d,n);
        printArray(ar,n);

    }

    public static void leftRotate(int ar[],int d,int n){
        reverse(ar,0,d-1);
        reverse(ar,d,n-1);
        reverse(ar,0,n-1);
    }
    public static void reverse(int ar[],int start,int end){
        while(start < end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end --;
        }
    }
    public static void rightRotate(int ar[],int d,int n){
        reversel(ar,0,n-1);
        reversel(ar,0,d-1);
        reversel(ar,d,n-1);
    }
    public static void reversel(int ar[],int start,int end){
        while(start < end){
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;
            start++;
            end --;
        }
    }
    public static void printArray(int[] ar,int n){
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}

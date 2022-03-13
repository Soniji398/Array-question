import java.util.*;

public class SpiralRotaion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();
        int ar[][] = new int[row][column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                ar[i][j] = scanner.nextInt();
            }
        }

        spiralRotaion(ar,row,column);
    }
    public static void spiralRotaion(int[][] ar,int end_row,int end_column){
        int i ;
        int start_row = 0;
        int start_column = 0;

        while(end_row > start_column && end_column > start_column){
            for(i = start_row;i<end_column;i++){
                System.out.print(ar[start_row][i]+" ");
            }
            start_row = start_row + 1;

            for(i = start_row;i<end_row;i++){
                System.out.print(ar[i][end_column-1]+" ");
            }

            end_column = end_column - 1;
            if(start_row < end_row){
                for(i = end_column-1;i>=start_column;i--){
                    System.out.print(ar[end_row-1][i]+" ");
                }
                end_row = end_row - 1;
            }

            if(start_column < end_column){
                for(i = end_row -1;i>= start_row;i--){
                    System.out.print(ar[i][start_column]+" ");
                }
            }
            start_column = start_column + 1;
        }
    }
}

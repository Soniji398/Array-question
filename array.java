import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numArray[] = new int[size];
        int check = 0;

		for(int i=0; i<size; i++)
		{
            numArray[i]=sc.nextInt();
        }
		for(int i = 0; i < numArray.length; i++)
    {
        for(int j = 0; j < numArray.length; j++)
        {
            if((numArray[i] == (numArray[j])) && (i != j))
            {
               check++;
               break;
            }
        }
    }
        if(check== 3){
            System.out.print("Yes");  
        }
        else{
            System.out.print("no");
	    }
	}
}
package array2ddemo;
import java.util.Scanner;

public class Array2DInput
{
    
    public static void main(String args[]){
        
       System.out.print("Enter 2D array size : ");
       Scanner s=new Scanner(System.in);
       int rows=s.nextInt();
       int columns=s.nextInt();
       
       System.out.println("Enter array elements : ");    
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=0; i<rows;i++)
         {            
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=s.nextInt();
            }
         }
        System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
            System.out.print(y+"        ");
            }
            System.out.println();
        }
        
    }  
    
}
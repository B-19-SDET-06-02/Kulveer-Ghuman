package arraydemo;
import java.util.Scanner;
public class ArrayPosition {
     Scanner s=new Scanner(System.in);
     int []arr= {20,30,78,56,67};
     int i,n,c;
     public void position()
     {
    	 System.out.println("Enter the numbers");
    	 n=s.nextInt();
    	 for(i=0;i<arr.length;i++)
    	 {
    		 if (arr[i]==n)
         {
        	System.out.print(i);
        	c=i;
         }

    	 }
    	 if(arr[c]!=n)
    	 {
    		 System.out.println("Number is not present");
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayPosition oo=new ArrayPosition();
        oo.position();
	}

}

package arraydemo;
import java.util.Scanner;
public class ArraySort 
{
  Scanner s=new Scanner(System.in);
  int[] num=new int[5];
  int counter, max, c, i;
  public void arraysort()
  {
	  System.out.println("Enter the numbers");
	  for(counter=0;counter<5;counter++)
	  {
		  num[counter]=s.nextInt();
	  }
	  for(i=1;i<=num.length;i++)
	  {
		  for(counter=0;counter<4;counter++)
		  {
			  if(num[counter+1]<num[counter])
			  { 
				  c=num[counter+1];
				  num[counter+1]=num[counter];
				  num[counter]=c;
			  }
					 
		  }
	  }
        for(counter=0;counter<5;counter++)
        {
        	System.out.println(num[counter]);
        }
        
      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArraySort oo=new ArraySort();
       oo.arraysort();
	}

}

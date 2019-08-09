package arraydemo;
import java.util.Scanner;
public class Singled 
{
  int[] rollno=new int[5];
  int counter;
  Scanner s=new Scanner(System.in);
  public void acceptDet()
 {   
	 System.out.println("Enter 5 elements");
	 for(counter=0;counter<rollno.length;counter++)
	 { 
	  rollno[counter]=s.nextInt();
	 }
	 for(int n=0;n<5;n++)
	 {
		 System.out.println(rollno[n]);
	 }
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Singled oo=new Singled();
      oo.acceptDet();
 }

}

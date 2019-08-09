package conditionaldemo;

import java.util.Scanner;

public class Switchcasedemo {
	int num1,num2,res,choice;
	Scanner sc=new Scanner(System.in);
  public void enter()
{
	  System.out.println("Enter value for Num1");
	  num1=sc.nextInt();
	  
	  System.out.println("Enter value for Num2");
	  num2=sc.nextInt();
	  
}
  public void check()
  {
	  System.out.println("1.Add\t\t2.Subtract\t3.Multiply\t4.Divide");
	  System.out.println("Enter your choice");
	  choice=sc.nextInt();
	  
	  switch(choice)
	  {
	  case 1:
		  enter();
		  res=num1+num2;
	      System.out.println("Result of addition is:"+res);
		  break;
		  
	  case 2:
		  enter();
		  res=num1-num2;
	      System.out.println("Result of subtraction is:"+res);
		  break;
		  
	  case 3:
		  enter();
		  res=num1*num2;
	      System.out.println("Result of multiplication is:"+res);
		  break;
		  
	  case 4:
		  enter();
		  res=num1/num2;
	      System.out.println("Result of division is:"+res);
		  break;
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Switchcasedemo oo=new Switchcasedemo();
  oo.check();
	}

}

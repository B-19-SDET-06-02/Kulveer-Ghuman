package Loopsdemo;
import java.util.Scanner;
public class Fibbonacci {
	int fib,x=0,y=1,z,i;
	Scanner sc=new Scanner(System.in);
	public void fibo()
	{
    System.out.println("Enter the number which you want to find factorial");
    fib=sc.nextInt();
    System.out.println("The fibonacci number is:0");
    System.out.println("The fibonacci number is 1");
    for(i=1;i<=fib;i++)
    {
    	z=x+y;
    	x=y;
    	y=z;
    	System.out.println("The fibbonacci number is:"+z);
    }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Fibbonacci oo=new Fibbonacci();
    oo.fibo();
	}

}



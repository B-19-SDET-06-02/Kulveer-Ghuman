package conditionaldemo;
import java.util.Scanner;
public class EvenOdd 
	{
int n;
Scanner sc=new Scanner(System.in);
public void evenodd()
{
System.out.println("Enter the number to check for even or odd");
n=sc.nextInt();

	if(n%2==0)
	{
		System.out.println("The number is even");
	}
	else
	{
		System.out.println("The number is odd");
}
 }
public static void main(String[] args) {
		// TODO Auto-generated method stub
EvenOdd oo=new EvenOdd();
oo.evenodd();
	}

}

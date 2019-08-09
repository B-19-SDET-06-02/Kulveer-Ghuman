package Loopsdemo;
import java.util.Scanner;
public class Primenumber 
{
int n,i,j=0;
Scanner sc=new Scanner(System.in);
public void prime()
{
System.out.println("Enter the number which you want to check for prime");
n=sc.nextInt();
for(i=2;i<n;i++)
{
	if(n%i==0)
	{
		j=j+1;
	}
}
 if(j==0)
 {
	 System.out.println(j);
 }
 else
 {
	 System.out.println("The number is not prime");
 }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Primenumber oo=new Primenumber();
oo.prime();
	}

}

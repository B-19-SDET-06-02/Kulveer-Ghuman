package Loopsdemo;

public class Diagram5 
{
public static void main(String args[])
{
for(int i = 5; i>=1; i--)
{
for(int j = 1; j<i; j++)
{
System.out.print("0");
}
for(int k = 5; k>=i; k--)
{
System.out.print("*");
}
System.out.println("");
}
}
}

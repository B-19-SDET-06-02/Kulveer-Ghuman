package Loopsdemo;

public class DoWhileLoop {
int i=101;
public void acc()
{
	   do
	   {
		   System.out.println("Hello"+i);
		   i=i+10;
	   }   while (i <=100);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     DoWhileLoop oo=new DoWhileLoop();
     oo.acc();
	}

}

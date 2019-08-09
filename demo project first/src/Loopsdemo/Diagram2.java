package Loopsdemo;

public class Diagram2 {
int i=1;
public void diagram()
{ 
	for(int row=0;row<5;row++)
	{
		for(int col=0;col<=row;col++)
		{
			System.out.print(i);
		}
	      System.out.print("\n");
	      i++;
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Diagram2 oo=new Diagram2();
     oo.diagram();
	}

}

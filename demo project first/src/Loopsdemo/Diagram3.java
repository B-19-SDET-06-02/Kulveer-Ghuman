package Loopsdemo;


public class Diagram3 {
int i=0;
public void diagram()
{ 
	for(int row=0;row<5;row++)
	{
		for(int col=0;col<=row;col++)
		{
			i=i+1;
			System.out.print(i);
		}
		  i=0;
	      System.out.print("\n");
	      
	}

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Diagram3 oo=new Diagram3();
     oo.diagram();
	}

}

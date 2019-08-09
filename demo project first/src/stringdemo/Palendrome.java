package stringdemo;

public class Palendrome {
String s=new String("mom");
String rev=new String();
int count;
public void str()
{
	count=s.length();
	for(int i=count-1;i>=0;i--)
	{
	rev=rev+s.charAt(i);	
	}
	System.out.println(rev);
	if(s.equals(rev))
		
	{
		System.out.println("String is palendrome");
	}
	else
	{
		System.out.println("String is not palendrome");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Palendrome oo=new Palendrome();
 oo.str();
	}

}

package stringdemo;

public class SplitCase {
String str="kulveer singh ghuman";
String st[];
public void acc()
{
	System.out.println("spliting string");
	st=str.split(" ");
	System.out.println(st[1]);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SplitCase oo=new SplitCase();
 oo.acc();
	}

}

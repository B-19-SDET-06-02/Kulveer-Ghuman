package arraydemo;
import java.util.Scanner;
public class ClassReport 
{
     int[] rollno=new int[5];
     String[] Names=new String[5];
     int[] Eng=new int[5];
     int[] Hindi=new int[5];
     int[] Total=new int[5];
     int[] Average=new int[5];
     int counter;
     Scanner s=new Scanner(System.in);
  public void classreport()
 {   
	 System.out.println("Enter the details");
	 for(counter=0;counter<5;counter++)
	 {
		 System.out.println("Enter roll no");
		 rollno[counter]=s.nextInt();
		 System.out.println("Enter Name");
		 Names[counter]=s.next();
		 System.out.println("Enter Eng Marks");
		 Eng[counter]=s.nextInt();
		 System.out.println("Enter Hindi marks");
		 Hindi[counter]=s.nextInt();
		 System.out.println("Enter Total marks");
		 Total[counter]= Eng[counter]+Hindi[counter];
 Average[counter]=Total[counter]/2;
		   }
	 System.out.println("Rollno\tNames\tEng\tHindi\tTotal\tAvg");
	 for(int n=0;n<5;n++)
	 {
		 System.out.print(rollno[n]);
		 System.out.print("\t");
		 System.out.print(Names[n]);
		 System.out.print("\t");
		 System.out.print(Eng[n]);
		 System.out.print("\t");
		 System.out.print(Hindi[n]);
		 System.out.print("\t");
		 System.out.print(Total[n]);
		 System.out.print("\t");
		 System.out.print(Average[n]);
		 System.out.print("\t");
		 System.out.println();
	 }
 }
	 public static void main(String[]args)
	 {
	  ClassReport oo=new ClassReport();
	  oo.classreport();
      }
}

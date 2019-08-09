package arraydemo;

public class ArrayMaximum {
 int[] arr={78,98,36,26,89};
 int temp;
 public void sort()
 {
	 for(int i=0;i<arr.length;i++)
	 { 
		 for(int j=0;j<arr.length-1;j++)
		 {
			 if(arr[j]>arr[j+1])
			 {
				 temp=arr[j];
				 arr[j]=arr[j+1];
				 arr[j+1]=temp;
			 }
		 }
			 
	 
	 }
	 System.out.println(arr[arr.length-1]);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ArrayMaximum oo=new ArrayMaximum();
    oo.sort();
	}

}

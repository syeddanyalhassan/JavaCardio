import java.util.ArrayList;

public class Introduction {

	public Introduction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myNum = 5;
		String website = "Danyal Hassan";
		char letter = 'r';
		double dec = 3.99;
		boolean myCard = true;
		
		System.out.println(System.getProperty("user.dir"));
		System.out.println(myNum+" is the new number ");
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard+"\n");
		
		int [] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
				
		int [] arr2= {1,2,3,4,5};
		
		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);
		
		System.out.println(arr2[2]);
	
		for (int a=0;a<arr.length;a++)
		{
			System.out.println(arr[a]);
		}
		
		System.out.println("\n");
		
		for (int a=0;a<arr2.length;a++)
		{
			System.out.println(arr2[a]);
		}
		
		String [] arr3= {"Syed","Danyal","Hassan"};
		
		for (int a = 0; a < arr3.length ; a++)
		{
			System.out.println(arr3[a]+"\n");
		}
		
		for (String s:arr3)
		{
			System.out.println(s);
		}
		
		for (int a=0;a<arr.length;a++)
		{
			if (arr[a]%2==0)
			{
				System.out.println(arr[a]);
			}
		}
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("ali");
		al.add("kinza");
		al.add("academy");
		al.add("selenium");
		
		System.out.println(al.get(3));
		
		
		String s="Danyal Hassan Academy";
		String [] splittedarray=s.split(" ");
		System.out.println(splittedarray[0]);
		System.out.println(splittedarray[1]);
		System.out.println(splittedarray[2]);
		String [] splittedarray2=s.split("Hassan");
		System.out.println(splittedarray2[0]);
		System.out.println(splittedarray2[1]);
		System.out.println(splittedarray2[1].trim());
		
		
		//reading string character by character
		
		for (int a=0;a<s.length();a++)
		{
			System.out.println(s.charAt(a)+"\n");
		}
		
		//reading string character by character in reverse order
		
		for (int a=s.length()-1;a>=0;a--)
		{
			System.out.println(s.charAt(a)+"\n");
		}
		
	}

}

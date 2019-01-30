import java.util.Scanner;
class String1
	{
        public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	String str;
	int a,b;
	char k=' ';
	System.out.println("enter the line");
	str=sc.nextLine();
	System.out.println("the line is" +str);
	a=str.length();
	System.out.println("the length of a string is:" +a);
	System.out.println("Enter the char of which u want to find index");
	k=sc.nextLine().charAt(0);
	b=str.indexOf(k);
	System.out.println("the position is:" +b);
	}
}
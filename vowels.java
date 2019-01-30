import java.util.Scanner;
	public class vowels
	{
		public static void main(String[] args)
		{
			Scanner sc= new Scanner(System.in);
			char a;
			System.out.println("Enter a character");
			a=sc.nextChar();
			if(a>='A' && a<='Z')
				{
					if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
					{
						System.out.println("the char is a vowel");
					}
					else 
					{
					System.out.println("the char is a consonant");
			}
		}
		else
		{
			System.out.println("please enter a character");
		}
	}
}
	
		
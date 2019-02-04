import java.io.*;
import java.util.*;
class Ritika
{
	public static void main(String[] args)
	{
	File f=null;
	BufferedWriter bout=null;
	try{
		f=new File("data.txt");
		FileWriter fout=new FileWriter(f);
		bout=new BufferedWriter(fout);
		Scanner sc=new Scanner(System.in);
		Boolean flag=true;
		while(flag)
		{
			System.out.println("Enter S.no.");
			bout.write(Integer.toString(sc.nextInt()));
			bout.write(' ');
			System.out.print("enter name:");
			bout.write(sc.next());
			bout.write(' ');
			System.out.print("enter cgpa:");
			bout.write(Float.toString((float)sc.nextDouble()));
			bout.write(' ');
			System.out.print("enter grade:");
			bout.write(sc.next().charAt(0));
			bout.newLine();
			System.out.print("\nDo you want to continue entering?");
			char c =  sc.next().charAt(0);
			if(c=='n' || c=='N')
			{
				flag=false;
			}

		}
	bout.close();
		
	}
	catch(Exception e){System.out.println(e);}
		
	//	bout.close();
	try{
		FileReader fin= new FileReader(f);
		BufferedReader bin=new BufferedReader(fin);
	  	String sr;
		System.out.println("thecontents of the file");
		while((sr=bin.readLine())!=null)
		{
			String[] strs = sr.split(" ");

			System.out.print((strs[0])+" "+strs[1]+ " ");
		}
	}
	catch(Exception e){}
	}
}
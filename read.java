import java.io.*; 
public class read 
{
public static void main(String[] args) throws Exception
{
File R = new File("C:\\Users\\HP\\Desktop");
BufferedReader br = new BufferedReader(new FileReader(R));
String a;
while((a=br.readLine()) !=null)
System.out.println(a);
}
}
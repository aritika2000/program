
import java.util.Scanner;
class Eg1 {
public static void main(String[] args){
Scanner sc =new Scanner(System.in);
System.out.println("enter 1st no");
int a = sc.nextInt();
System.out.println("enter 2 no");
while(true) {
try {
int b = sc.nextInt();
System.out.println(a/b);
break;
}
catch (Exception e) {
System.out.println(e);
}
}
System.out.println("hello");
}
}

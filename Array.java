import java.util.Scanner;
	public class Array
	{
        public static void main(String[] args)
	{
	Scanner sc= new Scanner(System.in);
	int sum=0,i,n,max,min;
	double average;
	System.out.println("Enter the size of arrray");
	n=sc.nextInt(); 
	int a[] = new int[n];
	for(i=0;i<n;i++)
	{
	System.out.println("Enter the values");
	a[i]=sc.nextInt();
	}
	System.out.println("The array is:");
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]);
	}
	for(i=0;i<n;i++)
	{
	sum=sum+a[i];
	}
	average=sum/n;
	System.out.println("Sum is:" +sum);
	System.out.println("Average is:" +average);
	max=a[0];
	for(i=0;i<n;i++)
	{
	if(max < a[i])
	{
	max=a[i];
	}
	}
	min=a[i];
	for(i=0;i<n;i++)
	{
	if(min > a[i])
	{
	min=a[i];
	}
	}
	System.out.println("min is:" +min);
	System.out.println("max is:" +max);
	}
}
	
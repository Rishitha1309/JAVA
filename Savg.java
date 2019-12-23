import java.io.*;
import java.util.Scanner;
class Savg
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int sum=0;
float avg;
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
sum=sum+a[i];
}
avg=(float)sum/n;
System.out.println("Sum is "+sum);
System.out.println("Avg is "+avg);
}
}
   
 
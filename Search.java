import java.io.*;
import java.util.*;
class Search
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int k=sc.nextInt();
int flag=0;
for(int i=0;i<n;i++)
{
if(a[i]==k)
{
flag=i;
}
}
if(flag==0)
{
System.out.println("-1");
}
else
{
System.out.println(+flag);
}
}
}

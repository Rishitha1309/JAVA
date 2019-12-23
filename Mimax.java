import java.io.*;
import java.util.*;
class Mimax
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
int min=99999,max=0;
int n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
if(min>a[i])
{
min=a[i];
}
}
for(int i=0;i<n;i++)
{
if(max<a[i])
{
max=a[i];
}
}
System.out.println("Maximum valu is "+max);
System.out.println("Minimum value is "+min);
}
}



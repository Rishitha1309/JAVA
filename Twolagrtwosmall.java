
import java.io.*;
import java.util.*;
class Twolagrtwosmall
{
public static void main(String []args)throws IOException
{
Scanner sc=new Scanner(System.in);
int temp=0,i,j;
int n=sc.nextInt();
int[] a=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++){
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}

System.out.println("Smallest numbers are "+a[0]+","+a[1]);
System.out.println("largest numbers are "+a[n-1]+","+a[n-2]);




}
}

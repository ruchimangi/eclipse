import java.io.*;
import java.lang.*;
import java.util.*;
class Decimalscalling
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter v value:");
double v=sc.nextDouble();
System.out.println("enter j value:");
int j=sc.nextInt();
double p=Math.pow(10,j);
double v1=(v/p);
System.out.println("the value of v1="+v1);
}
}
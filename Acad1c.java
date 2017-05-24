import java.util.*;
public class Acad1c
{
public static void main(String []args){
int a,b;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a and b");
a=sc.nextInt();
b=sc.nextInt();
System.out.println("You entered a="+a+" and b="+b);
b=a+b;
a=b-a;
b=b-a;
System.out.println("After swapping a="+a+" and b="+b);
}
}

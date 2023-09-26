







import java.io.*;
import java.util.Scanner;

class Practical10b{
public static void main(String args[]) throws IOException{
String s1,s2,s3;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Name: ");
s1=sc.nextLine();
System.out.println("Enter your phone number: ");
s2=sc.nextLine();
System.out.println("Enter your email: ");
s3=sc.nextLine();
FileOutputStream fos=new FileOutputStream("pranav.txt");
byte b1[]=s1.getBytes();
fos.write(b1);
byte b2[]=s2.getBytes();
fos.write(b2);
byte b3[]=s3.getBytes();
fos.write(b3);
fos.close();
}
}























import java.util.Scanner; 
class Practical6a2{
void display(int a){
System.out.println("Got an integer data!!!");
}
void display(String a){
System.out.println("Got an String object");
}
public static void main(String args[]){
Practical6a2 overloading=new Practical6a2();
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for Int");
int x=sc.nextInt();
System.out.println("Enter value for string: ");
String y=sc.next();
overloading.display(x);
overloading.display(y);
}
}
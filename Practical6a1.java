import java.util.Scanner;
class Practical6a1{
void display(int x){
System.out.println("Arguments: "+x);
}
void display(int x,int y){
System.out.println("Arguments: "+x+" and "+y);
}
public static void main(String args[]){
Practical6a1 overloading=new Practical6a1();
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for x: ");
int x=sc.nextInt();
System.out.println("Enter value for y: ");
int y=sc.nextInt();

overloading.display(x);
overloading.display(x,y);
}
}
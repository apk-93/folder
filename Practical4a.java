import java.util.Scanner;
class Rectangle{
int length,breadth;

void get(){
Scanner sc =new Scanner(System.in);
System.out.println("Enter the length and breadth :");
length=sc.nextInt();
breadth=sc.nextInt();
}

void calArea(){
int area=length*breadth;
System.out.println("Area of rectangle is : "+area);
}
}

class Practical4a{
public static void main(String srgs[]){
Rectangle r1=new Rectangle();
r1.get();
r1.calArea();
}
}
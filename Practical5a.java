import java.util.Scanner;

class SiParent{
float length;
float breadth;
void SiParent(float x,float y){
length=x;
breadth=y;
}
float RectArea(){
return length* breadth;
}
}

class SiChild extends SiParent{
float height;
void SiChild(float z){
height=z;
}
float Volume(){
return length*breadth*height;
}
}

class Practical5a{
public static void main(String args[]){
SiChild s1=new SiChild();
Scanner sc =new Scanner(System.in);
System.out.println("Enter Length: ");
float l=sc.nextFloat();
System.out.println("Enter Breadth: ");
float b=sc.nextFloat();
s1.SiParent(l,b);
System.out.println("AREA: "+s1.RectArea());
System.out.println("Enter Height: ");
float h=sc.nextFloat();
s1.SiChild(h);
System.out.println("Volume is: "+s1.Volume());


}
}
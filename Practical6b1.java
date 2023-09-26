class Parent
{
void show()
{
System.out.println("Parent's show()");
}
}
class child extends Parent{
void show(){
super.show();
System.out.println("Child's show()");
}
}
public class Practical6b1{
public static void main(String args[]){
child obj1=new child();
obj1.show();
}
}
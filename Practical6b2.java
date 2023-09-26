class Super{
int x;
Super(int x){
this.x=x;
}
void display(){
System.out.println("Super x: "+x);
}
}
class sub extends Super{
int y;
sub(int x,int y)
{
super (x);
this.y=y;
}
void display()
{
super.display();
System.out.println("Sub y: " +y);
}
}
class Practical6b2{
public static void main(String args[])
{
sub s1=new sub(55,45);
s1.display();
}
}





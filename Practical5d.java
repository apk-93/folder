class Student{
int rollno;
public void getNumber(int n){
rollno=n;
}
public void putNumber(){
System.out.println("Roll No.:"+rollno);
}
}
class Test extends Student
{
float sem1,sem2;
public void getMarks(float s1,float s2){
sem1=s1;
sem2=s2;
}
public void putMarks(){
System.out.println("Marks Obtained:");
System.out.println("Sem 1="+sem1);
System.out.println("Sem 2="+sem2);
}
}
interface Sports{
float sportmk=6.0f;
void putMarks();
}
class Result extends Test implements Sports
{
float total;
public void putMarks()  //Implementing method of interface sports
{
System.out.println("Sports marks="+sportmk);
}
public void display(){
total=sem1+sem2+sportmk;
putNumber();
super.putMarks();  //calling the method of Test Class
}
}
class Practical5D
{
public static void main(String args[])
{
Result r=new Result();
r.getNumber(2);
r.getMarks(53.4f,46.7f);
r.display();
r.putMarks(); //calling the method of inherface sports which implemented in result class
System.out.println("Total score="+r.total);
}
}
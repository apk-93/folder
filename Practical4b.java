import java.util.Scanner;
class Employee{
int id;
int salary;
String name;

Employee(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your id: ");
id=sc.nextInt();
System.out.println("Enter your name: ");
name=sc.next();


System.out.println("Enter your salary: ");
salary=sc.nextInt();
}

void display(){
System.out.println("Employee is is: "+id+" ,Name: "+name+" ,Salary: "+salary);

}
}

class Practical4b{
public static void main(String args[]){
Employee emp1=new Employee();
emp1.display();
}
}

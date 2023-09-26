import java.io.*;

class Employee{
int id;
int salary;
String name;

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

Employee(){
try{
System.out.println("Enter your id: ");
id=Integer.parseInt(br.readLine());
System.out.println("Enter your salary: ");
salary=Integer.parseInt(br.readLine());
System.out.println("Enter your name: ");
name=br.readLine();
}
catch(Exception e){
System.out.println(e);
}
}

void display(){
System.out.println("The output is: ");
System.out.println("Id: "+id);
System.out.println("Salary: "+salary);
System.out.println("Name: "+name);
}

class Practical10a{
public static void main(String args[]){
Employee e1=new Employee();
e1.display();
}
}
}
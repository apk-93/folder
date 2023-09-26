class Employee{
double salary=30000;
void displaySalary(){
System.out.println("Employee Salary= "+salary);
}
}

class FullTimeEmp extends Employee{
double hike =0.50;
void incrementSalary(){
salary=salary+(salary*hike);
}
}

class PartTimeEmp extends Employee{
double hike=0.25;
void incrementSalary(){
salary=salary+(salary*hike);
}
}

class Practical5c{
public static void main(String srgs[]){
FullTimeEmp emp1=new FullTimeEmp();
PartTimeEmp emp2=new PartTimeEmp();
System.out.println("Salary of the Employee 1 befre incrementing: ");
emp1.displaySalary();
System.out.println("Salary of the Employee 2 before incrementing: ");
emp2.displaySalary();

emp1.incrementSalary();
emp2.incrementSalary();
System.out.println("Salary of the employee 1 after incrementing :");
emp1.displaySalary();
System.out.println("Salary of the employee after incrementring: ");
emp2.displaySalary();
}

}



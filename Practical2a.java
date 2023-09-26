import java.util.Scanner;

class Practical2a{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second  number: ");
        int b=sc.nextInt();

        int sum=a+b;
        System.out.println("Addition of two numbers is: "+sum);

        int mul=a*b;
        System.out.println("Multiplicatin of two numbers is: "+mul);

        int div=a/b;
        System.out.println("Division of two numbers is: "+div);

        int sub=a-b;
        System.out.println("Subraction of two numbers is: "+sub);
        

    }
}
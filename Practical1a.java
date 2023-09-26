import java.util.Scanner;
import java.lang.Math;

class Practical1a{
    public static void main(String args[]){
        float a,b,c,d,x;
        double x1,x2;
        System.out.println("Enter value for a,b,c");
        Scanner sc=new Scanner(System.in);
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        System.out.println("The coeficient of a: "+a+" "+"b: "+b+" "+"c: "+c);
        d=b*b-4*a*c;
        if(d>0)
        {
            x1=(-b+Math.sqrt(d))/2*a;
            x2=(-b+Math.sqrt(d))/2*a; 
            System.out.println("Roots are real and distinct");
            System.out.println("x1:"+x1);
            System.out.println("x2: "+x2);
             }
        else if(d==0)
        {
            x=-b/2*a;
            System.out.println("roots are real and equal");
            System.out.println("x:"+x);
                 }
        else
        {
            System.out.println("Roots are real and iminary");
            }

    }
}
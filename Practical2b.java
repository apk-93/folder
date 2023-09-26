
class Practical2b{
    public static void main(String args[]){
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt;
        System.out.println("The first number is: "+a);

        System.out.println("Enter the second number");
        int b=sc.nextInt;
        System.out.println("The second number is:"+b);*/

        int a=5;
        int  b=10;
         System.out.println("The first number is: "+a);
          System.out.println("The second number is:"+b);




        boolean equal=(a==b);
        boolean not_equal=(a!=b);
        boolean greater=(a>b);
        boolean lesser=(a<b);
        boolean greater_equal=(a>=b);
        boolean lesser_equal=(a<=b);
        
        System.out.println("a==b"+equal);
        System.out.println("a!=b"+not_equal);
        System.out.println("a>b"+greater);
        System.out.println("a<b"+lesser);   
        System.out.println("a>=b"+greater_equal);   
        System.out.println("a>=b"+lesser_equal);
    }           

}
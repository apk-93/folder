import java.util.*;
class Practical3a{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String input=sc.nextLine();
        int spaces=0;
        int numbers=0;
        int letters=0;
        int others=0;
     
       for(int i=0;i<input.length();i++)
       {
        if(input.charAt(i)==' '){
            spaces++;
        }
        else if(Character.isDigit(input.charAt(i))){
            numbers++;

        }
        else if(Character.isAlphabetic(input.charAt(i))){
            letters++;

        }

        else{
            others++;

        }

       }

        System.out.println("Total");
        System.out.println("Letters"+letters);
        System.out.println("Spaces"+spaces);
        System.out.println("numbers: "+numbers);
        System.out.println("Others"+ others );
    }
}
class age_exception extends Exception{
    age_exception(String s){
        super(s);
    }
}

class check_age{
    void validate(int age) throws age_exception{
        if(age<18){
            throw new age_exception("Your age is less than 18");
        }
        else{
            System.out.println("You are elligible");
        }
    }
}


public class Practical9b {
    public static void main(String[] args) {
        check_age check=new check_age();

        try{
            check.validate(12);
        }
        catch(Exception a){
            System.out.println("Exception occured: "+a);
        }
        finally{
            System.out.println("thankyou");
        }
    }
}

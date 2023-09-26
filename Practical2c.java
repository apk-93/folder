class Practical2c{
    public static void main(String args[]){
        int a=5;
        int b=10;

        boolean AND=(a>b)&&(a<b);
        boolean OR=(a<b)||(a>b);
        boolean NOT=!(a>b);

        System.out.println("(a>b)&&(a<b):  "+AND);
        System.out.println("(a<b)||(a>b):  "+OR);
        System.out.println("!(a>b):  "+NOT);

    }
}
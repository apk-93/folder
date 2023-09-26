class Iphone6{
void makecalls(){
System.out.println("Calling functionality....");
}
}

class Iphone10 extends Iphone6{
void unlockByFaceId(){
System.out.println("Unlock by Face Id  ....");
}
}

class Iphone12 extends Iphone10{
void supportFor5GNetwork(){
System.out.println("Support 5G nnetwork");
}
}
public class Practical5b{
public static void main(String args[]){
Iphone12 ip = new Iphone12();
ip.makecalls();
ip.unlockByFaceId();
ip.supportFor5GNetwork();

}
}

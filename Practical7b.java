class TA extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("\t From Thread A i="+i);
}
System.out.println("Exit from A");
}
}

class TB extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("\t From Thread B i="+i);
}
System.out.println("Exit from B");
}
}

class TC extends Thread{
public void run(){
for(int i=1;i<=5;i++){
System.out.println("\t From Thread C i="+i);
}
System.out.println("Exit from C");
}
}

class Practical7b{
public static void main(String args[]){
new TA().start();
new TB().start();
new TC().start();
}
}
  
class Practical9a{ 
public static void main(String args[]){
StringBuffer str=new StringBuffer("Object language");
System.out.println("Original String is: "+str);

//Ascending characters string
for(int i=0;i<str.length();i++){
System.out.println("Character at position "+i+"is "+str.charAt(i));
}

//Inserting a string in middle
String astring=new String(str.toString());
int pos=astring.indexOf("language");
str.insert(pos,"Oriented");
System.out.println("Modified String: "+str);

//Modifing characters
str.setCharAt(6,'-');
System.out.println("Strinng Now: "+str);
str.append("Improves security ");
System.out.println("apppended string: "+str);

}
}
class Practical3b{
public static void main(String args[]){
int a[]=new int[] {23,24,12,24,32,134,21};
int min=a[0];
int max=a[0];
for(int i=0;i<a.length;i++){
if(a[i]>max){
max=a[i];
}
if(a[i]<min){
min=a[i];
}

}
System.out.println("The maximum number in an array is "+max);
System.out.println("The minimum number in an array is "+min);


}
}
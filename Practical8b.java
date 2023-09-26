public class Practical8b{
public static vooid main(String args[]){
int a[][]={{4,2},{1,3}};
int b[][]={{3,6},{4,2]};
int c[][]=new int[2][2];
for(int i=0;i<2;i++){
for(int j=0;j<2;j++){
c[i][j]=0;
for(int k=0;k<2;k++){
c[i][j]+=a[i][k]*b[k][j];
}
System.out.println(c[i][j]+" ");

}
System.out.println();
}
}
}
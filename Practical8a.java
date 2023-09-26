import java.util.Scanner;
public class Practical8a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter length of an array: ");
        int len=sc.nextInt();

        int arr[]=new int[len];
        System.out.println("enter element of array: ");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] > arr[j]) {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("ascending order: ");
        for (int i = 0; i < len; i++) {
            System.out.print("" + arr[i]);
        }
        System.out.println();
    }
}
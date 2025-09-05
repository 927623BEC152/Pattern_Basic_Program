import java.util.*;
public class Trial{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the patter : ");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=i;j<N;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int r=N-1;r>=1;r--){
            for(int s=1;s<=N-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=N-(N-r);c++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
    

}

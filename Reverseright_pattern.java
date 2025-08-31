import java.util.*;
public class Reverseright_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the row");
        int N=sc.nextInt();
        for(int i=N;i>=1;i--){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }    
}

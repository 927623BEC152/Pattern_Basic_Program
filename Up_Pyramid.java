import java.util.Scanner;

public class Up_Pyramid {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int N=sc.nextInt();
    for(int i=1;i<=N;i++){
            for(int j=i;j<N;j++){
                System.out.print(" ");
            }
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        sc.close();
    }
}

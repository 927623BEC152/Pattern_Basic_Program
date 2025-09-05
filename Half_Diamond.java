import java.util.*;

public class Half_Diamond {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int N=sc.nextInt();
    for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    for(int i=N-1;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
     sc.close();
    }


}

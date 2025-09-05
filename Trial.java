import java.util.*;
public class Trial{
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int N=sc.nextInt();
    for(int i=N;i>=1;i--){
        for(int j=1;j<=N-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
     sc.close();
    }
    

}

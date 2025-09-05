import java.util.Scanner;

public class Down_Half_Diomand {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int N=sc.nextInt();
         for(int r=N;r>=1;r--){
            for(int s=1;s<=N-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=N-(N-r);c++){
                System.out.print("*");
            }

        for(int j=1;j<=r-1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    
sc.close();
}
    
}

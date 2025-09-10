import java.util.Scanner;

public class Hollow_square {
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int n=sc.nextInt();
    for(int r=1;r<=n;r++){
        for(int c=1;c<=n;c++){
            if(r==c||c==(n-r+1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    sc.close();
    }
    
}

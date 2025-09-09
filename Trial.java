import java.util.*;
public class Trial{
    
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of row");
    int n=sc.nextInt();
    for(int r=1;r<=n;r++){
        for(int c=1;c<=n;c++){
            if(r==1||c==1||r==n||c==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    }
}
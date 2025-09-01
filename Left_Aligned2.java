import java.util.*;
public class Left_Aligned2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the pattern:");
        int N=sc.nextInt();
        for(int r=1;r<=N;r++){
            for(int s=1;s<=N-r;s++){
                System.out.print(" ");
            }
            for(int c=1;c<=r;c++){
                System.out.print("*");
            }
            System.out.println();
        }
    sc.close();
    }
}
import java.util.*;
public class Left_Pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            for(int j=N;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
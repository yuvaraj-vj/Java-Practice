import java.util.Scanner;
public class OddEven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0) System.out.println("Given no is even");
        else System.out.println("Given no is odd");
    }
}

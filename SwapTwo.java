import java.util.Scanner;
public class SwapTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("First no="+a);
        System.out.println("second no="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swap a="+a+" b="+b);
    }
}

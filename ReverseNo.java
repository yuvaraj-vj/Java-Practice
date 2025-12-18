import java.util.Scanner;
public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reversed=0;
        while(n!=0){
            int remainder=n%10;
            reversed=reversed*10+remainder;
            n/=10;
        }
        System.out.println("Reverse of a number is "+reversed);
    }
}

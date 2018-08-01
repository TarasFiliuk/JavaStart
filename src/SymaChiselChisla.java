import java.util.Scanner;

public class SymaChiselChisla   {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum=0;
        while (a!=0){
        sum+=a%10;
        a/=10;
        }
//        System.out.println((a%10) + ((a/10)%10) + ((a/100)%10)+((a/1000)%10));
        System.out.println(sum);
    }
}

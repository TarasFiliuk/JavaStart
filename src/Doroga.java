import java.util.Arrays;
import java.util.Random;

public class Doroga {
    public static void main(String[] args) {
        int k=0;
        int [] mas = new int[8];
        for (int i =0; i <mas.length; i++) {
            Random random = new Random();
            mas[i]=random.nextInt(10)+1;
            System.out.print(mas[i]+"\t");
            if (i%2==1){
                mas[i]=0;
            }
// k+=2
//            System.out.println();
//        System.out.println();
        }
        System.out.println();
        System.out.println(Arrays.toString(mas));
//        for (int i =mas.length-1 ;i>=0; i--) {
//
//            System.out.print(mas[i]+"\t");

//            System.out.println();
        }
    }


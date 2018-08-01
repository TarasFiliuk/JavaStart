import java.util.Arrays;
import java.util.Random;

public class Arr1 {
    public static void main(String[] args) {
        int k =0;
        int mas []=new int[15];
        for (int i = 0; i < mas.length; i++) {
            Random random = new Random();
            mas[i]=random.nextInt(10);
        }
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]%2==0 && mas[i]!=0){
                k++;
            }
        }
        System.out.println("кількість парних елементів в массиві = " + k);
        System.out.println(Arrays.toString(mas));
    }
}

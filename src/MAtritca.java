import java.util.Random;
public class MAtritca {
    public static void main(String[] args) {
        int[][] mas  = new int[10][10];
        int k=0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Random random = new Random();
                mas[i][j] =random.nextInt(100) ;
                if (mas[i][j]%10==5) {
                   k++;
                }
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(k);
        }
        }





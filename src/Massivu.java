import java.util.Random;

public class Massivu {
    public static void main(String[] args) {
        int[][] mas = new int[6][5];
        int max = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length - 1; j++) {
                Random random = new Random();
                mas[i][j] = random.nextInt(1000);
                System.out.print(mas[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length - 1; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];
                }
            }
        }
        int min = mas[0][0];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] < min) {
                    min = mas[i][j];
                }

            }

        }
        System.out.println("Максимальний елемент в масиві "+max);
        System.out.println("Мінімальний  елемент в масиві "+min);
    }
}
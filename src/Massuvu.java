import java.util.Arrays;

public class Massuvu {
    public static void main(String[] args) {
        double [] mas = new double[100];
        int j =1;
        int d =3;
        double k =0;
        for (int i = 1; i <=mas.length; i++) {
//            k=Math.sqrt(j);
//            mas[i]=k;
//            j+=d;
                mas[i-1]= Math.pow(i,2);
//    d+=2;
        }
        System.out.println(Arrays.toString(mas));

    }
}

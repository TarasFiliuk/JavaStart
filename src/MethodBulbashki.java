import java.util.Arrays;

public class MethodBulbashki {
    public static void main(String[] args) {
 bulba();
    }
    public static void bulba(){
        int mas []={56,35,68,987,9};
        int f;
        for (int i = 0; i < mas.length; i++) {
            for (int i1 = mas.length - 1; i1 >= i; i1--) {
              if (mas[i]>mas[i1]){
                  f=mas[i1];
                  mas[i1]=mas[i];
                  mas[i]=f;

              }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

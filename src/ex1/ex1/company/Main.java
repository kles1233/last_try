package ex1.ex1.company;
import java.util.Random;


// 3 4 адания практическойё
public class Main {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        int u;
        u=0;
        int length = num.length;
        ////////////////////////4
        for (String str : args) {
            System.out.println("аргумент = " + str);
        }
////////////////////////////3
        for (int i=0;i<length;i++) {
            u += num[i];

        }
        System.out.println(u);
int d=0;
        int t =0;
        do{
            d += num[t];

            t++;
        }
        while (t<length);

        System.out.println(d);

int s=0; int g=0;
        while (num.length>g){
            s += num[g];

            g++;
        }

        System.out.println(s);
////////////////////////////////////////


//5
        System.out.println();
        System.out.println();
        System.out.println();

        int k =0;
        System.out.print("1/k = ");
                for (int i=0;i<10;i++ ){
                   k++;

                    System.out.print(1+"/"+k+" + ");
                }

        System.out.println();
        System.out.println();
        System.out.println();
//6
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;
            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
            System.out.println(arr[i]);
        }


        System.out.println();
        System.out.println();
        System.out.println();


        int[] arr1 = new int[10];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 31);
            System.out.println(arr1[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println();


        for (int i = 0; i < arr1.length; i++) {

            int min = arr1[i];
            int min_i = i;
            for (int j = i+1; j < arr1.length; j++) {

                if (arr1[j] < min) {
                    min = arr1[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arr1[i];
                arr1[i] = arr1[min_i];
                arr1[min_i] = tmp;
            }
            System.out.println(arr1[i]);
        }
        System.out.println();
        System.out.println();
        System.out.println();


        System.out.println(calculateFactorial(4));

    }

    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <=n; i++)
        {
            result = result*i;
        }
        return result;
    }
}

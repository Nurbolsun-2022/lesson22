import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int k = 0; k < a; k++) {
//            if (k == 0) {
//                System.out.println();
//            } else
//                System.out.print(k + " ");
//            k += 6;
//        }


        int sum = 0;
        int sum1 = 0;
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 5; k++) {
                    sum+=1;
                }
            }

        }
        sum1+=sum;
        System.out.println(sum1);
        System.out.println();
    }
}



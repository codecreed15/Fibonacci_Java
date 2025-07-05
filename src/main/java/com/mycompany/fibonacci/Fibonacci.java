import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner L = new Scanner(System.in);
        
        System.out.println("Ingresa el tamaño de la serie:");
        int a = L.nextInt();
        
        int an = 0, ac = 1;
        
        System.out.println("----------Serie de Fibonacci-----------\n");
        
        for (int i = 0; i < a; i++) {
            if (i == 0) {
                System.out.print(an);
            } else if (i == 1) {
                System.out.print(", " + ac);
            } else {
                int r = an + ac;
                System.out.print(", " + r);
                an = ac;
                ac = r;
            }
        }
        
        L.close();
    }
}

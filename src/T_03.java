import java.util.Scanner;

public class T_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        double s = p*r*t;
        double si = s/100;
// updated the code
        System.out.println("Simple Intrest = " + si);

    }
}

import java.util.Scanner;

public class T_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();

        int s = p*r*t;
        int si = s/100;

        System.out.println("Simple Intrest = " + si);

    }
}

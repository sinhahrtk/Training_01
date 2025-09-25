import java.util.Scanner;

public class T_02 {

    public static void main(String[] args) {

        Scanner  sc = new Scanner(System.in);
        System.out.println("Input length value");
        int length = sc.nextInt();
        System.out.println("Length = " + length);

        System.out.println("Input breadth value");
        int breadth = sc.nextInt();
        System.out.println("Breadth = " + breadth);

        int Area = length*breadth ;
        System.out.println("Area of Rectangle = " + Area);
//updated the code
    }


}

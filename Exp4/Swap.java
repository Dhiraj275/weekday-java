import java.util.*;

class swap {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x");
        int x = sc.nextInt();
        System.out.print("Enter value of y");
        int y = sc.nextInt();
        System.out.println("Before swapping");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
        System.out.println("After swapping");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("value of x:" + x);
        System.out.println("value of y:" + y);
    }
}
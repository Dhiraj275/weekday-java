import java.util.*;

class Swap2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of x");
        int x = sc.nextInt();
        System.out.print("Enter value of y");
        int y = sc.nextInt();

        System.out.println("Before swapping the numbers:");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("After swapping the numbers: ");
        System.out.println("First number = " + x);
        System.out.println("Second number = " + y);
    }
}

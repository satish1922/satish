public class SwapAndAdd {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("Swapped numbers:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Addition of two numbers: " + (a + b));
    }
}

package satish;
public class NarrowCasting {
    public static void main(String[] args) 
    {
        double Raj = 222.222; 
        int Ratan = (int) Raj;

        System.out.println("Original double value: " + Raj);
        System.out.println("Narrowed int value: " + Ratan);
    }
}


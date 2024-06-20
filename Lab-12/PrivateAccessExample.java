package satish;

class MyClass {
    private int privateVar;

    public MyClass() {
        privateVar = 15;
    }

    public void displayPrivateVar() {
        System.out.println("Private variable value: " + privateVar);
    }

    public void setPrivateVar(int value) {
        privateVar = value;
    }
}

public class PrivateAccessExample {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.displayPrivateVar();

        obj.setPrivateVar(25);

        obj.displayPrivateVar();
    }
}
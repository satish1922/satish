package satish;

class Parent {
    protected int protectedVariable;

    public Parent() {
        protectedVariable = 15;
    }

    protected void display() {
        System.out.println("Value of protectedVariable: " + protectedVariable);
    }
}

class Child extends Parent {
    public Child() {
        protectedVariable = 25;
    }
}

public class ProtectedExample {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        parentObj.display();

        Child childObj = new Child();
        childObj.display();
    }
}
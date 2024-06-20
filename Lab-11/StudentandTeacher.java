package satish;

interface Human {
    void speak();
}

class Interface implements Human {
    private String name;

    public Interface(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Student speaks: My name is " + name);
    }
}


class Teacher implements Human {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("Teacher speaks: My name is " + name);
    }
}

public class StudentandTeacher {
    public static void main(String[] args) {
        Interface student = new Interface("raju");
        student.speak();
        Teacher teacher = new Teacher("laxmi");
        teacher.speak();
    }
}
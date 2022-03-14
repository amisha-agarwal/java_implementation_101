import java.util.*;

class Zoo {
    public String m1() {
        return "this is string";
    }
}

public class Demo {
    public void m2() {
        Zoo z = new Zoo();
        System.out.println("print  == " + z.m1());
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.m2();
    }
}

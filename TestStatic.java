import static java.lang.Integer.*;

import static java.lang.System.out;

public class TestStatic {
    public static void main(String[] args) {
        // advantage of static import ofsystem class 
        // and integer class 
        out.println(MAX_VALUE);
        out.println(toHexString(42));
    }
}
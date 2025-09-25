
import static java.lang.System.out;
import static java.lang.System.err;;

class Pojo {
    private final int number;

    Pojo(int number) {
        this.number = number;
    }

    public int number() {
        return number;
    }
}

record Record(int number) {
}

public class RecordTest {

    public static void main(String[] args) {

        var pojo1 = new Pojo(10);
        var pojo2 = new Pojo(10);

        test(pojo1, pojo2);

        var record1 = new Record(10);
        var record2 = new Record(10);

        test(record1, record2);
    }

    static void test(Object o1, Object o2) {
        out.println(o1);

        out.printf("o1 == o2 -> %s\n", o1 == o2);
        _assert(o1 != o2, "o1 and o2 are the same object");

        out.printf("o1.equals(o2) -> %s\n", o1.equals(o2));
        _assert(o1.equals(o2), "o1 and o2 are not equal");

        out.printf("hashcode o1: %s\n", o1.hashCode());
        out.printf("hashcode o2: %s\n", o2.hashCode());
        _assert(o1.hashCode() == o2.hashCode(), "o1 and o2 have different hashcodes");

        out.println();
    }

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    static void _assert(boolean condition, String message) {
        if (!condition) {
            err.printf("%sAssertion failed: %s%s\n", ANSI_RED, message, ANSI_RESET);
        }
    }
}

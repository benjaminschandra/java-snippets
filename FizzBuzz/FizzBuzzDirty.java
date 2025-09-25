
public class FizzBuzzDirty {

    public static void main(String[] args) {
        int r;
        if(args.length < 1) {
            r = 20;
        } else {
            try {
                r = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                r = 20;
            }
        }

        for (int i = 1; i <= r; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
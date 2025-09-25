
import java.util.HashMap;

public class FizzBuzz {

    static final HashMap<Integer, String> fizzBuzzMap = new HashMap<>();
    static final int defaultRange = 20;

    public static void main(String... args) {
        initializeMap();
        var range = getInputRangeFromArgs(args);
        printFizzBuzz(range);
    }

    static void initializeMap() {
        fizzBuzzMap.put(3, "Fizz");
        fizzBuzzMap.put(5, "Buzz");
    }

    static int getInputRangeFromArgs(String... args) {
        return args.length < 1 ? defaultRange : parseIntWithDefault(args[0], defaultRange);
    }

    static int parseIntWithDefault(String str, int defaultValue) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    static void printFizzBuzz(int range) {
        for (int i = 1; i <= range; i++) {
            System.out.println(checkAndConvertNumber(i));
        }
    }

    static String checkAndConvertNumber(int number) {
        StringBuilder output = new StringBuilder();
        for (var key : fizzBuzzMap.keySet()) {
            if (number % key == 0) {
                output.append(fizzBuzzMap.get(key));
            }
        }
        if (output.isEmpty()) {
            return Integer.toString(number);
        }
        return output.toString();
    }

}
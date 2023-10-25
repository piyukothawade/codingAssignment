import java.util.HashMap;
import java.util.Map;

public class RomanNum {

    private static final Map<Character, Integer> romanMap = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public static int romanNum(String s) {
        int result = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter a Roman numeral: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String romanNumber = scanner.nextLine().toUpperCase();
        
        int integerValue = romanNum(romanNumber);
        System.out.println(romanNumber + " = " + integerValue);
    }
}

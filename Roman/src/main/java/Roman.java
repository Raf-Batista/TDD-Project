import java.util.HashMap;

public class Roman {
    /*
        I	1
        V	5
        X	10
        L	50
        C	100
        D	500
        M	1000
    */

    private static HashMap<String, Integer> romanMap = new HashMap<>();

    public static int convert(String input) {
        romanMap.put("I", 1);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);

        int total = 0;
        String[] inputArr = input.split("");

        for (int i = 0; i < input.length(); i++) {

            if (i+1 < input.length()) {
                int current = romanMap.get(inputArr[i]);
                int next = romanMap.get(inputArr[i+1]);
                if (current < next) {
                    int difference = next - current;
                    total += difference;
                    i++;
                } else {
                    total += romanMap.get(inputArr[i]);
                }
            } else {
                total += romanMap.get(inputArr[i]);
            }
        }

        return total;
    }
}

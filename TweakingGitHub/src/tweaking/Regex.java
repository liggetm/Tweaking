package tweaking;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    
    private static final Pattern regex = Pattern.compile("\\d+\\.*.*"); //is digit followed optionally by .digit
    private static Matcher m;
    
    public static void main(String[] args) {
        
        final String[] input = { "12.567", "UNKNOWN", "22.65.21", "21" };

        for (final String in : input) {
            System.out.println("in = " + in + " result = " + isMatch(in));
        }

    }
    
    private static boolean isMatch(final String in) {
        m = regex.matcher(in);
        return m.matches();
    }
}

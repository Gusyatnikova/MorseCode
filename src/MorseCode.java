import java.util.HashMap;
import java.util.Map;

public class MorseCode {
    private static HashMap<String, String> morseMap = new HashMap<String, String>(100);

    public static void setLine(String curKey, String curVal) {
        morseMap.put(curKey, curVal);
    }

    public String getValue(String key) {
        return (morseMap.get(key));
    }

    public String getValue(char key) {
        return (morseMap.get(String.valueOf(key)));
    }

    public boolean containsKey(String key) {
        return (morseMap.containsKey(key.toUpperCase()));
    }
}


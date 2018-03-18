import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static java.lang.System.exit;
import static java.lang.System.setOut;

public class MorseCodeReader {
    public void readMorse(String filename) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            String curString = "";
            MorseCode morseCode = new MorseCode();

            while ((curString = fileReader.readLine()) != null) {
                String[] splittedAlphLine = curString.split("\t", 3);
                morseCode.setLine(splittedAlphLine[0], splittedAlphLine[1]);
                //this line is reverse: key, value became value, key(for decode)
                morseCode.setLine(splittedAlphLine[1], splittedAlphLine[0]);
            }
        } catch (IOException except) {
            System.out.println("smth wrong with file0");
        }
    }
}


import java.io.*;
import java.util.HashMap;

public class Encoder {
    public void code(String source, String destination) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(source));
            StringBuilder outputString = new StringBuilder();
            MorseCode morseMap = new MorseCode();

            int symbol = fileReader.read();

            String str = new String();
          //  fileReader.readLine().split("");
            while (symbol != -1) {
                char key = (char) symbol;
                str = Character.toString(key);
                str = str.toUpperCase();
                if (morseMap.containsKey(str)) {
                    outputString.append(morseMap.getValue(str));
                    outputString.append(" ");
                } else if (key == 32) {
                    outputString.append("\t");
                } else if (key == 10) {
                    outputString.append("\r\n");
                }
                symbol = fileReader.read();
            }
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(destination, true));
            for (int i = 0; i < outputString.length(); i++) {
                fileWriter.write(outputString.charAt(i));
                fileWriter.flush();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file is not open");
        } catch (IOException e) {
            System.out.println("error with dest file");
        }
    }
}

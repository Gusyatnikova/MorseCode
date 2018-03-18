import java.io.*;

public class Decoder {
    void decode(String source, String destination) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(source));
            StringBuilder outputString = new StringBuilder();
            MorseCode morseMap = new MorseCode();
            char symbol;
            String accumulatedString = new String();
            //Space = between letters, space+tab = between words;
            while ((symbol = (char) fileReader.read()) != 65535) {
                switch (symbol) {
                    case 32:
                        outputString.append(morseMap.getValue(accumulatedString));
                        accumulatedString = "";
                        break;
                    case 10:
                        outputString.append("\r\n");
                        accumulatedString = "";
                        break;
                    case 9:
                        outputString.append(" ");
                        break;
                    default:
                        accumulatedString = accumulatedString + Character.toString(symbol);
                        break;
                }
            }
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(destination, true));
            for (int i = 0; i < outputString.length(); i++) {
                fileWriter.write(outputString.charAt(i));
            }
            fileWriter.flush();


        } catch (FileNotFoundException e) {
            System.out.println("smth wrong with input file");
        } catch (IOException e) {
            System.out.println("error with dest file");
        }
    }
}

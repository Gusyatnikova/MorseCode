public class CommandHandler {
    /*
    * code nameOfFile nameOfFile(for alphabet)
    * decode nameOfFile nameOfFile
    * appoint - назначать*/
    private MorseCodeReader  morseReader;

    {
        morseReader = new MorseCodeReader();
    }

    void appointCommand(String[] rowArgs) {
        Encoder encoder = new Encoder();
        Decoder decoder = new Decoder();

        morseReader.readMorse(rowArgs[2]);
        if(rowArgs[0].equals("code")) {
            encoder.code(rowArgs[1], rowArgs[3]);
        }
        else if(rowArgs[0].equals("decode")) {
            decoder.decode(rowArgs[1], rowArgs[3]);
        }
        else {
            System.out.println("Enter command: code[decode] filename(for input Text) filepath(for alphabet)");
        }
    }
}

import java.io.Reader;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try
        {
            if (args.length != 4) {
                throw new InvalidParameterException();
            }
        } catch (InvalidParameterException e) {
            System.out.println("Incorrect arguments");
            System.out.println("Please, enter: [opition] nameOfFile nameOfFile(for alphabet) outputfile");
        }
        CommandHandler commandsReader = new CommandHandler();
        commandsReader.appointCommand(args);
    }
}

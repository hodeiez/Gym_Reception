import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * * Created by Hodei Eceiza
 * * Date: 10/8/2020
 * * Time: 16:01
 * * Project: Inlämningsuppgift2
 * * Copyright: MIT
 * <p>
 * A program which search if a customer is a Gym member and saves theirs training dates.
 */
public class Main {

    public static void main(String[] args) {
        Path customersDB = Paths.get("src/customers.txt");
        Path trainingT = Paths.get("src/TrainingTracker.txt");

        while (true) {
            ReceptionApp receptionApp = new ReceptionApp(customersDB, trainingT);
            UserInput question = new UserInput();
            int option = question.optionMessage(Messages.QUESTION_SEARCH.txt, Messages.QUESTION_CONTINUE.txt);
            if (option != 0)
                break;
        }


    }
}

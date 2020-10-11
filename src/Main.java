/**
 *  * Created by Hodei Eceiza
 *  * Date: 10/8/2020
 *  * Time: 16:01
 *  * Project: Inlämningsuppgift2
 *  * Copyright: MIT
 *
 *  A program which search if a customer is a Gym member and saves theirs training dates.
 */
public class Main {

    public static void main(String[] args) {

        while (true) {
            ReceptionApp receptionApp = new ReceptionApp("src/customers.txt", "src/TrainingTracker.txt");

            UserInput question = new UserInput();
            int option = question.optionMessage(Messages.QUESTION_SEARCH.txt, Messages.QUESTION_CONTINUE.txt);
            if (option!=0)
                break;
        }

    }
}



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

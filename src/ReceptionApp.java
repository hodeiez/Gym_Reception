
/**
 * Created by Hodei Eceiza
 * Date: 10/10/2020
 * Time: 13:20
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 */
public class ReceptionApp {
   public ReceptionApp(String fileDB,String fileTracker) {
        UserInput ui=new UserInput();
        ui.searching();
        if(!ui.getInput().isEmpty()) {
            DataManagement statusSearch = new DataManagement(ui.getInput(), fileDB);
            statusSearch.setSearch(ui.getInput());
            statusSearch.setVisitDay();
            statusSearch.setCopyOfFile();
            statusSearch.setIndexOfData();
            statusSearch.setCustomerData();

            ui.answerMessage(statusSearch.toPrint(),Messages.INFO.txt);
            if (statusSearch.getStatus() == Messages.MEMBER.txt) {
                DataManagement trainingTracker = new DataManagement(ui.getInput(), fileTracker);
                trainingTracker.setData(statusSearch.getData());
                trainingTracker.setCopyOfFile();
                trainingTracker.setIndexOfData();
                trainingTracker.insertInArray();
                trainingTracker.saveFile(trainingTracker.getCopyOfFile(), fileTracker);
                ui.answerMessage(statusSearch.printSaved(),Messages.INFO.txt);
            }
        }
        else
            ui.answerMessage(Messages.INPUT_IS_EMPTY.txt,Messages.EMPTY.txt);
    }
}

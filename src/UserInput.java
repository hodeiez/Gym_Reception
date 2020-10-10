
import javax.swing.*;

/**
 * Created by Hodei Eceiza
 * Date: 10/8/2020
 * Time: 20:56
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 */
public class UserInput {
    private String input;
    UserInput(){ }

    public void searching(){
        input=JOptionPane.showInputDialog(Messages.SEARCH_INPUT.txt);
        if(input==null)
            System.exit(0);
    }
    public String getInput(){
        return input;
    }

    public void answerMessage(String message,String title){
        JOptionPane.showMessageDialog(null,message,title,1);
    }
    public int optionMessage(String message,String title){
        String[]option={Messages.YES.txt, Messages.NO.txt};
        return JOptionPane.showOptionDialog(null,message,title,JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,option,option[1]);
    }
}

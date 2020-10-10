/**
 * Created by Hodei Eceiza
 * Date: 10/8/2020
 * Time: 21:00
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 */
public enum Messages {
    MEMBER("Member"),
    NOT_MEMBER("Not in the system"),
    OLD_MEMBER("Old Member,didn't pay for this year"),
    SEARCH_INPUT("Type the name or id your search for"),
    ERROR("Error with message: "),
    NODATA("No data"),
    NOTFOUND("Didn't find any match searching for %s\n Status:%s"),
    SEARCH_ANSWER("%s matches with user\nId: %s\nName: %s\nSurname: %s\nStatus: %s\nPaid membership: %s"),
    SAVED_TRAINING("Saved to the training track file today visit of\n%s %s with id %s"),
    QUESTION_SEARCH("Do you want to search again?"),
    QUESTION_CONTINUE("continue?"),
    INPUT_IS_EMPTY("You didn't type anything"),
    EMPTY("Empty"),
    INFO("Info"),
    YES("Yes"),
    NO("No");
    public String txt;
     Messages(String txt){
        this.txt=txt;
    }
}

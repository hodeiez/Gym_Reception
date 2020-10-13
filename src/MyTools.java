import java.io.File;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Hodei Eceiza
 * Date: 10/8/2020
 * Time: 14:46
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 *
 * Different tools for searching and checking management.
 */
public class MyTools {
    public static boolean dateRangeInsideYear(String date,String actual) {
        try{
        LocalDate before = LocalDate.parse(date);
        LocalDate now =LocalDate.parse(actual);
        return ((int) ChronoUnit.YEARS.between(now, before)==0);}
        catch (DateTimeParseException e){
            System.out.println(Messages.ERROR.txt+e.getLocalizedMessage());
            return false;
        }
    }

    public static String findInLine(String LineToSearchIn,String searchString) {
       Scanner scn=new Scanner(LineToSearchIn);
       scn.useDelimiter(",");
       String temp;
       while(scn.hasNext()){
           temp=scn.next().trim();
           if(temp.equalsIgnoreCase(searchString) || temp.equalsIgnoreCase(MyTools.findInString(temp,searchString))){
               return LineToSearchIn;
           }
       }
       return null;
    }
    public static String findInString(String stringToSearchIn,String searchString){
        Scanner scn=new Scanner(stringToSearchIn);
        String temp;
        while(scn.hasNext()){
            temp=scn.next().trim();
            if (temp.equalsIgnoreCase(searchString))
                return stringToSearchIn;
        }
        return null;
    }

    public static ArrayList<String> fileToArray(Path file){
        ArrayList<String>tempList=new ArrayList<>();
        try(Scanner scn=new Scanner(new File(file.toString()))){
            while(scn.hasNextLine()){
                tempList.add(scn.nextLine());
            }
        }catch (Exception e){
            e.getLocalizedMessage();
            System.out.println(e.getMessage());
        }
        return tempList;
    }
    public static int getIndexOfFound(ArrayList<String>arrayToSearch,String searching){
        int index=-1;
        for(String d:arrayToSearch) {
            if (findInLine(d, searching) == d) {
                index = arrayToSearch.indexOf(findInLine(d, searching.trim()));
            }
        }
        return index;
    }

}

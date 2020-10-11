
import java.io.FileWriter;
import java.util.ArrayList;

/**
 * Created by Hodei Eceiza
 * Date: 10/10/2020
 * Time: 12:50
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 *
 * A class for customers registering management.
 */
public class DataManagement extends Customer {
    private String fileName;
    private ArrayList<String> copyOfFile;
    private int indexOfData;
    private String search;
    private String data;

    DataManagement() { }
    DataManagement(String search, String fileName) {
        this.search = search;
        this.fileName = fileName;
        super.setVisitDay();
    }
    public ArrayList<String> getCopyOfFile() {
        return copyOfFile;
    }
    public void setCopyOfFile() {
        copyOfFile = MyTools.fileToArray(fileName);
    }

    public int findIndexOf(String search) {
        return MyTools.getIndexOfFound(copyOfFile, search);
    }

    public void setIndexOfData() {
        indexOfData = findIndexOf(getSearch());
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public void insertInArray() {
        if (this.findIndexOf(getSearch()) != -1)
            copyOfFile.add(indexOfData + 1, super.getVisitDay());
        else
            copyOfFile.add(getData() + "\n" + super.getVisitDay());
    }

    public void saveFile(ArrayList<String> copyOfFile, String filename) {
        try {
            FileWriter toSave = new FileWriter(filename);
            for (String s : copyOfFile) {
                toSave.write(s + "\n");
            }
            toSave.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    public void splitData(String string){
        String [] split=string.split(",");
        super.setId(split[0]);
        String [] split2=split[1].trim().split(" ");
        super.setName(split2[0]);
        super.setSurname(split2[1]);
    }
    public void setCustomerData() {
        if (indexOfData != -1) {
            setData(copyOfFile.get(indexOfData));
            splitData(getData());
            super.setPaidDay(copyOfFile.get(indexOfData + 1));
            setStatus();
        } else {
            setData(Messages.NODATA.txt);
            super.setStatus(Messages.NOT_MEMBER.txt);
            super.setId(Messages.NODATA.txt);
            super.setName(Messages.NODATA.txt);
            super.setSurname(Messages.NODATA.txt);
        }

    }

    public void setStatus() {
        if (MyTools.dateRangeInsideYear(getPaidDay()))
            super.setStatus(Messages.MEMBER.txt);
        else
            super.setStatus(Messages.OLD_MEMBER.txt);
    }

    @Override
    public String toPrint() {
        return (getStatus()==Messages.NOT_MEMBER.txt)?
                String.format(Messages.NOTFOUND.txt,getSearch(),getStatus()):
                String.format(Messages.SEARCH_ANSWER.txt,getSearch(), getId(),getName(),getSurname(), getStatus(),getPaidDay());
    }
    public String printSaved(){
        return String.format(Messages.SAVED_TRAINING.txt,getName(),getSurname(),getId());
    }
}

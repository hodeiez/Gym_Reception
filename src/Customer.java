import java.time.LocalDate;

/**
 * Created by Hodei Eceiza
 * Date: 10/8/2020
 * Time: 16:01
 * Project: Inlämningsuppgift2
 * Copyright: MIT
 *
 * The Gym Customer class.
 */
public abstract class Customer {
    /**
     * paidDay=the last time the customer paid the membership.
     * visitDay=the last day the customer visited.
     * status=customers membership status.
     */
    private String paidDay, visitDay,id,name,surname,status;


    public String getPaidDay() { return paidDay; }

    public void setPaidDay(String paidDay) { this.paidDay = paidDay; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getVisitDay() { return visitDay; }

    public void setVisitDay() { this.visitDay = LocalDate.now().toString(); }

    public void setStatus(String status) { this.status = status; }

    public String getStatus() { return status; }
    public abstract String toPrint();
    public abstract int findIndexOf(String search);
    public abstract void setIndexOfData();
}

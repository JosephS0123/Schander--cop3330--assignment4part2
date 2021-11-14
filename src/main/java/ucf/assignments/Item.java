package ucf.assignments;

import java.time.LocalDate;

public class Item {
    private String description;
    private LocalDate date;
    private Character complete;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Character getComplete() {
        return this.complete;
    }

    public void setComplete(Character complete) {
        this.complete = complete;
    }
    public Item(Character complete,LocalDate date, String description){
        this.setDate(date);
        this.setDescription(description);
        this.setComplete(complete);
    }
    @Override
    public String toString(){
        return this.getComplete()+" | At "+this.getDate()+": "+this.getDescription();

    }

}

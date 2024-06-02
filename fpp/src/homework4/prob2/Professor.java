package homework4.prob2;

import java.time.LocalDate;

public class Professor extends DeptEmployee{

    private int numberOfPublications;

    public Professor(String name, double salary, LocalDate hiredDate, int numberOfPublications) {
        super(name, salary, hiredDate);
        this.numberOfPublications = numberOfPublications;
    }

    public int getNumberOfPublications() {
        return numberOfPublications;
    }

    public void setNumberOfPublications(int numberOfPublications) {
        this.numberOfPublications = numberOfPublications;
    }
}

package lab9.prob1;

public class Student {
    private final String firstName;
    private final String lastName;
    private final double gpa;
    private final Standing standing;

    public Student(String firstName, String lastName, double gpa, Standing standing) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.standing = standing;
    }

    public Standing getStanding() {
        return standing;
    }

    public double getGpa() {
        return gpa;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "[" + firstName + " " + lastName + "]";
    }

    @Override
    public boolean equals(Object ob) {
        if (ob == null) return false;
        if (ob.getClass() != Student.class) return false;
        Student s = (Student) ob;
        return s.firstName.equals(firstName) && s.lastName.equals(lastName);
    }

}

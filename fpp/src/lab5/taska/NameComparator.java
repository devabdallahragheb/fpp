package lab5.taska;

import java.util.Comparator;

public class NameComparator implements Comparator<DeptEmployee> {
    @Override
    public int compare(DeptEmployee employee1, DeptEmployee employee2) {
        return employee1.getName().compareTo(employee2.getName());
    }
}

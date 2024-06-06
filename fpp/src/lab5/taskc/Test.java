package lab5.taskc;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Test test = new Test();
        test.sort(data);
        System.out.println(Arrays.toString(data));
    }

    private void sort(DeptEmployee[] data) {
        class ReversedSalaryComparator implements Comparator<DeptEmployee> {
            @Override
            public int compare(DeptEmployee employee1, DeptEmployee employee2) {
                return Double.compare(employee2.getSalary(), employee1.getSalary());
            }
        }
        Arrays.sort(data, new ReversedSalaryComparator());
    }
}

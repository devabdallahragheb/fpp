package lab5.taskd;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data, new Comparator<DeptEmployee>() {
            @Override
            public int compare(DeptEmployee employee1, DeptEmployee employee2) {
                return Double.compare(employee2.getSalary(), employee1.getSalary());
            }
        });
        System.out.println(Arrays.toString(data));
    }
}

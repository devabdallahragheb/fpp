package lab5.taskb;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data, DeptEmployee.getComparator());
        System.out.println(Arrays.toString(data));
    }
}

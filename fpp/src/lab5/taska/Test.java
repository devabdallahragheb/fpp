package lab5.taska;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();
        Arrays.sort(data, new NameComparator());
        System.out.printf(Arrays.toString(data));
    }
}

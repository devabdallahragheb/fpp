package lab9.prob1;

import java.util.HashMap;
import java.util.List;

public class Admin {
    public static HashMap<Key, Student> processStudents(List<Student> students) {
        HashMap<Key, Student> studentMap = new HashMap<>();
        if (students == null) {
            return studentMap;
        }
        for (Student student : students) {
            Key key = new Key(student.getFirstName(), student.getLastName());
            studentMap.put(key, student);
        }
        return studentMap;
    }
}

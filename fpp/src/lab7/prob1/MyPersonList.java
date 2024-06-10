package lab7.prob1;

import java.util.Arrays;

// Common task : Make sure to check your code should not throw any run time exception
public class MyPersonList {
    private final static int INITIAL_LENGTH = 3;
    private Person[] arrPerson;
    private int size;

    // Default Constructor
    public MyPersonList() {
        arrPerson = new Person[INITIAL_LENGTH];
        size = 0;
    }

    // 1. Implement method to Add as last element, make sure you have enough room else call resize()
    public void add(Person person) {
        if (person == null) return;
        if (size == arrPerson.length) resize(); // Array is full
        arrPerson[size] = person;
        size++;
    }

    // 2. get person information by passing index
    public Person get(int i) {
        if (i < 0 || i >= size) {
            // throw new IndexOutOfBoundsException("Invalid index i" + i);
            return null;
        }
        return arrPerson[i];
    }

    // 3. Find the Person object using lastname
    public boolean find(String lastName) {
        if (lastName == null) return false;
        for (Person person : arrPerson) {
            if (person != null && person.getLast() != null && person.getLast().equals(lastName)) return true;
        }
        return false;
    }

    // 4. Remove the person object by passing its lastname
    public boolean remove(String lastName) {
        if (size == 0 || lastName == null) return false; // the list is empty
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (arrPerson[i] != null && arrPerson[i].getLast() != null && arrPerson[i].getLast().equals(lastName)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[size];
        System.arraycopy(arrPerson, 0, temp, 0, index);
        System.arraycopy(arrPerson, index + 1, temp, index, size - (index + 1));
        arrPerson = temp;
        size--;
        return true;
    }

    // 5. Resizing the list
    private void resize() {
        int length = arrPerson.length;// Original array length
        int newLength = 2 * length; // Twice the original length
        arrPerson = Arrays.copyOf(arrPerson, newLength);
    }

    // To display all the persons list
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size - 1; ++i) {
            sb.append(arrPerson[i]).append(", \n");
        }
        sb.append(arrPerson[size - 1]).append("]");
        return sb.toString();
    }

    // Return the size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyPersonList list = new MyPersonList();
        list.add(new Person("Bruce", "Tom", 36));
        list.add(new Person("Paul", "Corozza", 51));
        list.add(new Person("Joe", "Lermon", 53));
        list.add(new Person("Anne", "Dow", 55));
        System.out.println(STR."""
        Size() : \{list.size()}
        \{list}
        """);
        list.remove("Tom");
        System.out.println(STR."""
        Size() : \{list.size()}
        \{list}
        """);
        System.out.println(STR."""
        Searching of Lermon: \{list.find("Lermon")}
        """);
        System.out.println(list.get(2));
    }
}
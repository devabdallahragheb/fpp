package lab7.prob3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // a. Create an ArrayList<Marketing> type.
        List<Marketing> marketingList = new ArrayList<Marketing>();

        // b. add() minimum of five objects into your ArrayList collection of Marketing instances.
        Marketing marketing1 = new Marketing("Cris", "Estate", 200000);
        Marketing marketing2 = new Marketing("Tuan", "Car", 10000);
        Marketing marketing3 = new Marketing("Cuong", "Coffee", 10);
        Marketing marketing4 = new Marketing("Thinh", "Motorcycle", 4000);
        Marketing marketing5 = new Marketing("Duy", "Computer", 3000);

        marketingList.add(marketing1);
        marketingList.add(marketing2);
        marketingList.add(marketing3);
        marketingList.add(marketing4);
        marketingList.add(marketing5);

        // c. delete an object from Marketing by passing instance object.
        marketingList.remove(marketing1);

        // d. Print the size of the list.
        System.out.println(STR."""
        Size of List: \{marketingList.size()}
        """);

        // e. Retrieve a Marketing object by its position. get()
        Marketing result = marketingList.get(0);
        if (result != null)
            System.out.println(result);

        // f. Update the details of a Marketing object by passing its position. (Set())

        Marketing newMarketing = new Marketing("Nhat", "Food", 20000);
        marketingList.set(0, newMarketing);
        System.out.println(marketingList.get(0));

        // h. Sort the list in natural order for the field salesamount using comparator interface.
        marketingList.sort((o1, o2) -> Double.compare(o1.getSalesamount(), o2.getSalesamount()));
        System.out.println(marketingList);

        // i. Sort the list in natural order using employeename with the criteria of the employee who achieves more than $1000 of salesamount
        List<Marketing> filterList = listMoreThan1000(marketingList);
        filterList.sort((o1, o2) -> o1.getEmployeename().compareTo(o2.getEmployeename()));
        System.out.println(filterList);
    }

    // Write a method to retrieve the result of getting list of employees have more than $1000 sales

    public static List<Marketing> listMoreThan1000(List<Marketing> list) {
        if (list == null || list.size() == 0)
            return list;
        List<Marketing> result = new ArrayList<>();
        for (Marketing marketing : list) {
            if (marketing.getSalesamount() > 1000) {
                result.add(marketing);
            }
        }
        return result;
    }

}

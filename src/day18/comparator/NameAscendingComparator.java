package day18.comparator;

import java.util.Comparator;

public class NameAscendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName()); // 숫자 아스키코드값을 비교하여 1 0 -1 을 리턴
    }
}

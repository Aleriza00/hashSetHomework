import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(8);
        set1.add(10);
        set1.add(15);

        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(1);
        set2.add(2);
        set2.add(11);
        set2.add(15);
        set2.add(10);
        symmetricDifference(set1, set2);

    }

    public static void symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> set3 = new HashSet<>(set1);
        set3.removeAll(set2);
        set2.removeAll(set1);
        set3.addAll(set2);
        System.out.println(set3);

    }
}
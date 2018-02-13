import java.util.HashSet;
import java.util.Set;

public class Main11 {

    /*
    Write a method called symmetricSetDifference that accepts two Set s as parameters and returns a new Set containing
    their symmetric set difference (that is, the set of elements contained in either of the two sets but not in both).
    For example, the symmetric difference between the sets [1, 4, 7, 9] and [2, 4, 5, 6, 7] is [1, 2, 5, 6, 9] .
    */

    public static void main(String[] args) {
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        Set<Integer> b = new HashSet<>();
        b.add(3);
        b.add(2);
        Set<Integer> c = symmetricDifference(a,b);

        // Should print 1 and 3, but not 2, since 2 is in both a and b.
        System.out.println(c);
    }

    public static Set<Integer> symmetricDifference(Set<Integer> s, Set<Integer> t) {
        Set<Integer> ans = new HashSet<>(s);
        ans.addAll(t);
        Set<Integer> intersection = new HashSet<>(s);
        intersection.retainAll(t);
        ans.removeAll(intersection);
        return ans;
    }
}

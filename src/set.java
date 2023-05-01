import java.util.HashSet;

public class set {
    public static void main(String[] args) {
        HashSet<Integer> hs1 = new HashSet<Integer>();
        HashSet<Integer> hs3 = new HashSet<Integer>();

        hs1.add(2);
        hs1.add(3);

        hs3.add(0);
        hs3.add(1);
        hs3.add(2);
        hs3.add(3);

        Integer[] array1 = hs3.toArray(new Integer[hs3.size()]);
        for(Integer itm : array1) {
            System.out.println(itm);
        }

        System.out.println(hs3.retainAll(hs1));
        System.out.println(hs3.containsAll(hs1));
        System.out.println(hs3.removeAll(hs1));
        System.out.println(hs1.retainAll(hs3));
        System.out.println(hs1.containsAll(hs3));
        System.out.println(hs1.removeAll(hs3));

    }
}

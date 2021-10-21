package EstruturasDeDados;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class CollectionSet {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(3);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(22);
        conjunto.add('x');

        System.out.println(conjunto.size());
        System.out.println(conjunto.remove("teste"));
        System.out.println(conjunto.contains(1.2));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);
        //conjunto.addAll(nums);
        conjunto.retainAll(nums);
        System.out.println(conjunto);
        nums.clear();
        System.out.println(nums);
    }
}

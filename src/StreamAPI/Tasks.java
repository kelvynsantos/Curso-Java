package src.StreamAPI;
import java.util.Arrays;
import java.util.List;
public class Tasks {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3);

//        System.out.println(Integer.toBinaryString(Integer.parseInt(String.valueOf(nums))));
        for( Integer num : nums) {
            String binary = Integer.toBinaryString(num);
            System.out.println(binary);
        }
            System.out.println("\n------\n");
//        for(String binary : binarys) {
//            binary = String.valueOf(new StringBuilder(binary).reverse());
//        }
//            System.out.println(binary.toString());
//            Integer number = Integer.parseInt(binary);
//            System.out.println(binary);
//        }
    }
}

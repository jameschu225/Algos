import java.util.Arrays;

public class testarray_to_do_1{
    public static void main(String[] args) {
        array_to_do_1 array_to_do_1 = new array_to_do_1();

        int[] mylist = {1,2,3,4,5};
        int[] result = array_to_do_1.pushFront( mylist,8);
        System.out.println(Arrays.toString(result));

        int result1 = array_to_do_1.popFront( mylist);
        System.out.println(result1);

        int[] result2= array_to_do_1.insertAt( mylist,3,9);
        System.out.println(Arrays.toString(result2));

        int result3= array_to_do_1.remoteAt( mylist,3);
        System.out.println(result3);

        int[] result4= array_to_do_1.swapPairs( mylist);
        System.out.println(Arrays.toString(result4));

        int[] mylist1 = {-2,-2,3,5,5,10};
        int[] result5= array_to_do_1.removeDuplicate( mylist1);
        System.out.println(Arrays.toString(result5));

    }
}
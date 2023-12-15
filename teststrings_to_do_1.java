import java.util.List;

public class teststrings_to_do_1 {
        public static void main(String[] args) {
            strings_to_do_1 strings_to_do_1 = new strings_to_do_1();

            String result = strings_to_do_1.removeBlanks(" Pl ayTha tF u nkyM usi c ");
            System.out.println(result);

            String result4 = strings_to_do_1.getDigit("os1a3y5w7h9a2t4?6!8?0");
            System.out.println(result4);

            String result1 = strings_to_do_1.acronumy("Live from New York, it's Saturday Night!\"");
            System.out.println(result1);

            int result2 = strings_to_do_1.conutNonSapces("Honey pie, you are driving me crazy");
            System.out.println(result2);

            String[] itme = {"Good morning", "sunshine", "the", "Earth", "says", "hello"};
            List<String> result3 = strings_to_do_1.removeShorterStrings(itme, 4);
            System.out.println(result3);
    }
}
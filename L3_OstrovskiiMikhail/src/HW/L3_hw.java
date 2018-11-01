package HW;


import java.util.*;


public class L3_hw {
    public static void main(String[] args) {
        String[] letters = {"A", "B", "C", "D", "E", "E", "A", "A", "A", "C"};

        Map<String, Integer> map = new HashMap<>();
        for (String i : letters) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
        System.out.println("");

        Set<String> arrOfUniqLetters = new HashSet<>(Arrays.asList(letters));
        System.out.println(arrOfUniqLetters);
        System.out.println("");



        PhoneBook p1 = new PhoneBook();

        p1.add("petrov", "81111111111");
        p1.add("smirnov", "82222222222");
        p1.add("ivanov", "83333333333");
        p1.add("kozlov", "84444444444");
        p1.add("petrov", "85555555555");
        p1.add("smirnov", "86666666666");
        p1.add("kozlov", "87777777777");
        p1.add("kozlov", "88888888888");

        System.out.println(p1.get("petrov"));
        System.out.println(p1.get("smirnov"));
        System.out.println(p1.get("ivanov"));
        System.out.println(p1.get("kozlov"));

    }
}

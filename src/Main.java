import java.util.*;

public class Main {
    public static void main(String[] args) {

        User ivan = new User("Ivan", 35);
        User sergey = new User("Sergey", 45);
        User ivanK = new User("Ivan", 36);
        User serg = new User("Sergey", 46);
        User katya = new User("Ekaterina", 18);

        UserSet userSet = new UserSet();
        userSet.addUser(ivan);
        userSet.addUser(sergey);
        userSet.addUser(ivanK);
        userSet.addUser(serg);
        userSet.addUser(katya);
        System.out.println(userSet);

        User oldestuser = userSet.getOldest();
        System.out.println(oldestuser);

        String str = "Мышка сушек насушила, мышка мышек пригласила, мышки сушки кушать стала, зубы сразу все сломала";
        countWords(str);
    }

    public static void countWords(String str) {
        str = str.replace(",", "");
        str = str.toLowerCase();
        String[] arr = str.split(" ");
        Map<String, Integer> counterMap = new HashMap<>();
        for (String word : arr) {
            if(!word.isEmpty()) {
                Integer count = counterMap.get(word);
                if(count == null) {
                    count = 0;
                }
                counterMap.put(word, ++count);
            }
        }

        for(String word : counterMap.keySet()) {
            System.out.println(word + ": " + counterMap.get(word));
        }
    }
}

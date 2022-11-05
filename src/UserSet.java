import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserSet {

    private List<User> userSet = new ArrayList<>();

    public void addUser(User user) {
        if (userSet.contains(user)) {
            throw new IllegalArgumentException("Такой пользователь уже существует");
        } else {
            userSet.add(user);
        }
    }

    public User getOldest() {
        int minAge = Integer.MIN_VALUE;
        User target = null;
        for (User user : userSet) {
            if (user.getAge() > minAge) {
                minAge = user.getAge();
                target = user;
            }
        }
        return target;
    }

    @Override
    public String toString() {
        return "UserSet{" +
                "userSet=" + userSet +
                '}';
    }
}

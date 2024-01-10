package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = Stream.generate(() -> RandomUser.generateUser())
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted((user1, user2) -> user1.getName().compareTo(user2.getName()))
                .filter(user -> user.getEmail() != null && !user.getEmail().isEmpty())
                .collect(Collectors.toList());

        Map<String, List<User>> groupedByGender = users.stream().collect(Collectors.groupingBy(User::getGender));

        System.out.println(groupedByGender);
    }
}

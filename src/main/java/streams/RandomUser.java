package streams;

import com.github.javafaker.Faker;

import java.util.Random;

public class RandomUser {
    static User generateUser() {

        Faker faker = new Faker();
        Random random = new Random();

        return User.builder()
                .age(random.nextInt(70))
                .name(faker.name().firstName())
                .email(faker.internet().emailAddress())
                .gender(generateRandomGender())
                .build();
    }

    private static String generateRandomGender() {
        String[] genders = {"male", "female"};
        return genders[new Random().nextInt(genders.length)];
    }
}
package streams;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User {
    private String name;
    private int age;
    private String email;
    private String gender;


}
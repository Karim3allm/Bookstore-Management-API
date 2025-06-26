package Steps;

import com.github.javafaker.Faker;

public class Steps {

    public static void GenerateUser()

    {
        Faker faker = new Faker();
        String name = faker.name().firstName();
        String description = faker.name().lastName();
        
    }

}

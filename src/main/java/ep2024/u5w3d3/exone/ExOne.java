package ep2024.u5w3d3.exone;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ExOne {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Info info = new Info();
        info.setFirstName(faker.lordOfTheRings().character());
        info.setLastName(faker.name().lastName());
        info.setBirthDate(Date.from(LocalDate.of(1970, 5, 19).atStartOfDay(ZoneId.systemDefault()).toInstant()));

        DataSource adapter = new Adapter(info);

        System.out.println("---EXONE---");
        System.out.println("Full name: " + adapter.getFullName());
        System.out.println("Age " + adapter.getAge());
    }
}

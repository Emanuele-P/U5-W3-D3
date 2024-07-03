package ep2024.u5w3d3.ex1;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String[] args) {
        Faker faker = new Faker();
        Info info = new Info();
        info.setFirstName(faker.lordOfTheRings().character());
        info.setLastName(faker.name().lastName());
        info.setBirthDate(Date.from(LocalDate.of(1970, 5, 19).atStartOfDay(ZoneId.systemDefault()).toInstant()));

        DataSource adapter = new Adapter(info);

        System.out.println(System.lineSeparator() + "---EXONE---");
        System.out.println("Full name: " + adapter.getFullName());
        System.out.println("Age " + adapter.getAge());
    }
}

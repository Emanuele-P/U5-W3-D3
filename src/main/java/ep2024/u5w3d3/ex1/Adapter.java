package ep2024.u5w3d3.ex1;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Adapter implements DataSource {
    private Info info;

    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getFullName() {
        return info.getFirstName() + " " + info.getLastName();
    }

    @Override
    public int getAge() {
        LocalDate birthDate = info.getBirthDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate today = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(birthDate, today);
    }
}

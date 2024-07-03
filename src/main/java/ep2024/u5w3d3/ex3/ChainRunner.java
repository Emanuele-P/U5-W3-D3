package ep2024.u5w3d3.ex3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        Lieutenant lieutenant = new Lieutenant();
        Captain captain = new Captain();
        Major major = new Major();
        Colonel colonel = new Colonel();
        General general = new General();

        System.out.println(System.lineSeparator() + "---EXTHREE---");
        lieutenant.setSuperior(captain);
        captain.setSuperior(major);
        major.setSuperior(colonel);
        colonel.setSuperior(general);

        captain.doCheck(1000);
    }
}

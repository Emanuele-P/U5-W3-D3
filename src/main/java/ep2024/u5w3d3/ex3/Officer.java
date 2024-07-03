package ep2024.u5w3d3.ex3;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Officer {
    private Officer superior;
    private double salary;

    public void doCheck(double amount) {
        if (amount <= this.salary) {
            System.out.println("The salary of " + this.getClass().getSimpleName() + " is greater than " + amount);
        }
        if (superior != null) {
            this.superior.doCheck(amount);
        } else {
            System.out.println("There are no higher-ranking officers");
        }
    }
}

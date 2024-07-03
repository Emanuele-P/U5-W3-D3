package ep2024.u5w3d3.ex1;

public class UserData {
    private String fullName;
    private int age;

    public void getData(DataSource ds) {
        fullName = ds.getFullName();
        age = ds.getAge();
    }
}

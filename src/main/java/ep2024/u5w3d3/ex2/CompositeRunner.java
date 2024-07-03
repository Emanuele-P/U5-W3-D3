package ep2024.u5w3d3.ex2;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class CompositeRunner implements CommandLineRunner {
    @Override
    public void run(String[] args) throws Exception {
        Faker faker = new Faker();

        Page page1 = new Page("page one");
        Page page2 = new Page("page two");
        Page page3 = new Page("page three");
        Page page4 = new Page("page four");

        Section section1 = new Section("Section one");
        section1.addElement(page1);
        section1.addElement(page2);

        Section section2 = new Section("Section two");
        Section subsection1 = new Section("Subsection one");
        subsection1.addElement(page3);
        section2.addElement(subsection1);
        section2.addElement(page4);

        Book book = new Book("Composite design pattern", Arrays.asList(faker.name().fullName(), faker.name().fullName()), 49.99);
        book.addElement(section1);
        book.addElement(section2);

        System.out.println(System.lineSeparator() + "---EXTWO---");
        book.print();
        System.out.println(System.lineSeparator() + "Total pages in book '" + book.getTitle() + "' is " + book.getPageCount());
    }
}

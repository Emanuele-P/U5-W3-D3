package ep2024.u5w3d3.extwo;

import com.github.javafaker.Faker;

import java.util.Arrays;

public class ExTwo {
    public static void main(String[] args) {
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

        book.print();
        System.out.println("Total pages in book '" + book.getTitle() + "' is " + book.getPageCount());
    }
}

package ep2024.u5w3d3.extwo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Book implements BookElement {

    private String title;
    private List<String> authors;
    private double price;
    private List<BookElement> elements = new ArrayList<>();

    public Book(String title, List<String> authors, double price) {
        this.title = title;
        this.authors = authors;
        this.price = price;
    }

    public void addElement(BookElement element) {
        elements.add(element);
    }

    public void print() {
        System.out.println("Book: " + title);
        System.out.println("Authors: " + String.join(", ", authors));
        System.out.println("Price: " + price + "€");
        for (BookElement element : elements) {
            element.print();
        }
    }

    @Override
    public int getPageCount() {
        int totalPageCount = 0;
        for (BookElement element : elements) {
            totalPageCount += element.getPageCount();
        }
        return totalPageCount;
    }
}

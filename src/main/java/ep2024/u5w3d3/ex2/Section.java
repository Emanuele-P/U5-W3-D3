package ep2024.u5w3d3.ex2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
public class Section implements BookElement {

    private String title;
    private List<BookElement> elements = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public void addElement(BookElement element) {
        elements.add(element);
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
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

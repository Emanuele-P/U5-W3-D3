package ep2024.u5w3d3.extwo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Page implements BookElement {
    private String content;

    @Override
    public void print() {
        System.out.println("Page: " + content);
    }

    @Override
    public int getPageCount() {
        return 1;
    }
}

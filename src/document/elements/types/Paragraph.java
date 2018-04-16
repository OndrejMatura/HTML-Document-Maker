package document.elements.types;

import document.elements.DoubleTagElement;
import document.elements.Element;

public class Paragraph extends DoubleTagElement {

    public static final String TAG_NAME = "p";

    @Override
    public String tagName() {
        return TAG_NAME;
    }

    public Paragraph(Element... elements) {
        super(elements);
    }

}

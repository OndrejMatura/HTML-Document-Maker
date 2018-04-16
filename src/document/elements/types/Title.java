package document.elements.types;

import document.elements.DoubleTagElement;
import document.elements.Element;

public class Title extends DoubleTagElement {

    public static final String TAG_NAME = "title";

    @Override
    public String tagName() {
        return TAG_NAME;
    }

    public Title(Element... elements) {
        super(elements);
    }

}

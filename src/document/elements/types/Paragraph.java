package document.elements.types;

import document.elements.DoubleTagElement;

public class Paragraph extends DoubleTagElement {

    public static final String TAG_NAME = "p";

    @Override
    public String getTagName() {
        return TAG_NAME;
    }

}

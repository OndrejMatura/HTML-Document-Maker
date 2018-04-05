package document.elements.types;

import document.elements.DoubleTagElement;

public class Body extends DoubleTagElement {

    public static final String TAG_NAME = "body";

    @Override
    public String tagName() {
        return TAG_NAME;
    }

    protected Body() {
    }

}

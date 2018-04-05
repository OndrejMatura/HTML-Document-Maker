package document.elements.types;

import document.elements.DoubleTagElement;

public class Head extends DoubleTagElement {

    public static final String TAG_NAME = "head";

    @Override
    public String tagName() {
        return TAG_NAME;
    }

    protected Head() {
    }

}

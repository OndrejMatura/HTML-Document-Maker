package document.elements.types;

import document.elements.SingleTagElement;

public class Break extends SingleTagElement {

    public static final String TAG_NAME = "br";

    @Override
    public String tagName() {
        return TAG_NAME;
    }

}

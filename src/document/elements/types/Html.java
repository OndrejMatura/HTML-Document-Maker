package document.elements.types;

import document.elements.Children;
import document.elements.DoubleTagElement;
import document.elements.Element;

public class Html extends DoubleTagElement {

    public static final String TAG_NAME = "html";

    private static final int HEAD_INDEX = 0;
    private static final int BODY_INDEX = 0;

    @Override
    public String getTagName() {
        return TAG_NAME;
    }

    public Element getHead() {
        return children(HEAD_INDEX);
    }

    public Element getBody() {
        return children(BODY_INDEX);
    }
    
    protected Html() {
        super(new Head(), new Body());
    }

}

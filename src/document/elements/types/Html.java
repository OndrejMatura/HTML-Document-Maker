package document.elements.types;

import document.elements.Children;
import document.elements.DoubleTagElement;
import document.elements.Element;

public class Html extends DoubleTagElement {

    public static final String TAG_NAME = "html";

    private final Element head, body;
    
    @Override
    public String tagName() {
        return TAG_NAME;
    }

    @Override
    public Children children() {
        return null;
    }
    
    @Override
    public String toString() {
        return openingTag() + head.toString() + body.toString() + closingTag();
    }
    
    public Element head() {
        return head;
    }

    public Element body() {
        return body;
    }

    protected Html() {
        super(false);
        head = new Head();
        body = new Body();
    }

}

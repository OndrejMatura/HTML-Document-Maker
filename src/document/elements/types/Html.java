package document.elements.types;

import document.elements.Children;
import document.elements.DoubleTagElement;
import document.elements.Element;

public class Html extends DoubleTagElement {

    public static final String TAG_NAME = "html";

    private Element head;
    private Element body;

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    public Element getBody() {
        return body;
    }

    public void setBody(Element body) {
        this.body = body;
    }

    @Override
    public String getTagName() {
        return TAG_NAME;
    }

    @Override
    public Children getChildren() {
        Children children = new Children();
        children.add(head);
        children.add(body);
        return children;
    }
    
    public Html() {
        head = new Head();
        body = new Body();
    }

}

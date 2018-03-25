package document;

import document.elements.Element;
import document.elements.types.*;

public class Document {

    public static final String DOCTYPE = "<!DOCTYPE HTML>";

    private final Element html;
    private final Element head;
    private final Element body;

    public Element getHtml() {
        return html;
    }

    public Element getHead() {
        return head;
    }

    public Element getBody() {
        return body;
    }

    public Document() {
        Html newHtml = new Html();
        head = newHtml.getHead();
        body = newHtml.getBody();
        this.html = newHtml;
    }

    @Override
    public String toString() {
        return DOCTYPE + html.toString();
    }

}

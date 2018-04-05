package document.elements;

public abstract class Element {

    protected static final String TAG = "<%s/>";
    protected static final String OPENING_TAG = "<%s>";
    protected static final String CLOSING_TAG = "</%s>";

    private Element parent;

    public Element getParent() {
        return parent;
    }

    protected void setParent(Element element) {
        parent = element;
    }

    protected void removeParent() {
        parent = null;
    }

    public void setText(String text) {
    }

    public abstract Children children();

    public abstract int childrenCount();

    public abstract boolean hasChildren();

    @Override
    public abstract String toString();

    public abstract String tagName();

}

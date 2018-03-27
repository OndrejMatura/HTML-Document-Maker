package document.elements;

public abstract class Element {

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

    public void appendText(String text) {
    }

    public abstract Element[] children();

    public abstract Element children(int index);

    public abstract int childrenCount();

    public abstract boolean hasChildren();

    public abstract void appendChild(Element element);

    public abstract void removeChild(int index);

    //TODO
    //public abstract void removeChild(Element element);
    public abstract void switchChildren(int index1, int index2);

    public abstract void clearChildren();

    @Override
    public abstract String toString();

    public abstract String getTagName();

    public Element() {
        parent = this;
    }

}

package document.elements;

public abstract class Element {

    private Element parent;

    public Element getParent() {
        return parent;
    }

    protected void setParent(Element element) {
        parent = element;
    }

    public void setText(String text) {
    }

    public void appendText(String text) {
    }

    public abstract void appendChild(Element element);

    public abstract void removeChildren();

    public abstract int childrenCount();

    public abstract Children getChildren();
    
    public abstract Element getChild(int index);

    @Override
    public abstract String toString();

    public abstract String getTagName();
    

}

package document.elements;

import java.util.ArrayList;

public abstract class Element {

    private ElementType type;
    private Element parent;

    public String getTagName() {
        return type.name();
    }
    
    public Element parent() {
        return parent;
    }
    
    public abstract int childrenCount();

    public abstract ArrayList<Element> children();

    @Override
    public abstract String toString();
    
}

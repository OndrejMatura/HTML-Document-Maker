package document.elements;

import java.util.ArrayList;

public abstract class Element {

    private Element parent;
    
    public Element getParent() {
        return parent;
    }
    
    public abstract String getTagName();
    
    public abstract int childrenCount();

    public abstract ArrayList<Element> children();

    @Override
    public abstract String toString();
    
}

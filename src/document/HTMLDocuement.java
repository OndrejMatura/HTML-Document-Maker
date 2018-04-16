package document;

import document.elements.Element;
import document.elements.types.*;

public class HTMLDocuement extends Html {

    public static final String DOCTYPE = "<!DOCTYPE HTML>";
    
    private String name;

    @Override
    public String toString() {
        return DOCTYPE + super.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public HTMLDocuement(String name) {
        super();
        this.name = name;
    }
    
}

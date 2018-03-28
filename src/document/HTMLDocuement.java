package document;

import document.elements.Element;
import document.elements.types.*;

public class HTMLDocuement extends Html {

    public static final String DOCTYPE = "<!DOCTYPE HTML>";

    @Override
    public String toString() {
        return DOCTYPE + super.toString();
    }
}

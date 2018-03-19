package document.elements;

import java.util.ArrayList;

public abstract class DoubleTagElement extends Element {

    private static final String OPENING_TAG = "<%s>";
    private static final String CLOSING_TAG = "</%s>";

    private ArrayList<Element> children;

    @Override
    public ArrayList<Element> children() {
        return children;
    }

    @Override
    public int childrenCount() {
        return children.size();
    }

    public String getOpeningTag() {
        return String.format(OPENING_TAG, getTagName());
    }

    public String getClosingTag() {
        return String.format(CLOSING_TAG, getTagName());
    }

    @Override
    public String toString() {
        String string = getOpeningTag();
        for (Element element : children) {
            string += element;
        }
        string += getClosingTag();
        return string;
    }

}

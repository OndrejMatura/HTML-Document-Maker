package document.elements;

import java.util.Arrays;

public abstract class DoubleTagElement extends Element {

    private static final String OPENING_TAG = "<%s>";
    private static final String CLOSING_TAG = "</%s>";

    private final Children children;

    @Override
    public void appendChild(Element element) {
        element.setParent(this);
        children.add(element);
    }

    @Override
    public void removeChildren() {
        children.clear();
    }

    @Override
    public Children getChildren() {
        return children;
    }

    @Override
    public Element getChild(int index) {
        return children.get(index);
    };

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
        for (Element element : getChildren()) {
            string += element.toString();
        }
        string += getClosingTag();
        return string;
    }

    public DoubleTagElement() {
        children = new Children();
    }
    
    public DoubleTagElement(Element... elements) {
        this();
        children.addAll(Arrays.asList(elements));
    }

}

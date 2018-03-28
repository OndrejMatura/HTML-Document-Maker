package document.elements;

public abstract class SingleTagElement extends Element {

    @Override
    public void appendChild(Element element) {
    }

    @Override
    public void removeChild(int index) {
    }
    
    @Override
    public void removeChild(Element element) {
    }

    @Override
    public void switchChildren(int index1, int index2) {
    }

    @Override
    public void clearChildren() {
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public Element children(int index) {
        return null;
    }

    @Override
    public Element[] children() {
        return new Element[0];
    }

    @Override
    public int childrenCount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format(TAG, getTagName());
    }

}

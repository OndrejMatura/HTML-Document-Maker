package document.elements;

public abstract class SingleTagElement extends Element {

    @Override
    public Children children() {
        return null;
    }

    @Override
    public boolean hasChildren() {
        return false;
    }

    @Override
    public int childrenCount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format(TAG, tagName(), getAttributes());
    }

}

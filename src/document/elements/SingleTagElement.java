package document.elements;

public abstract class SingleTagElement extends Element {

    private static final String TAG = "<%s/>";
    
    @Override
    public void appendChild(Element element) {
    }
    
    @Override
    public void removeChildren() {
    }
    
    @Override
    public Children getChildren() {
        return new Children();
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

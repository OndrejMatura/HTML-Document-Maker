package document.elements;

import java.util.ArrayList;

public class SingleTagElement extends Element {

    private static final String TAG = "<%s/>";
    
    @Override
    public ArrayList<Element> children() {
        return new ArrayList<>();
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

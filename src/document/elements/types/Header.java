package document.elements.types;

import document.elements.DoubleTagElement;
import document.elements.Element;

public class Header extends DoubleTagElement {

    public static final String TAG_NAME = "h";
    public static final int MIN_TIER = 1;
    public static final int MAX_TIER = 6;

    private final int tier;
    
    @Override
    public String tagName() {
        return TAG_NAME + tier;
    }
    
    public Header(int tier, Element... elements) {
        super(elements);
        if (tier < MIN_TIER) {
            this.tier = MIN_TIER;
        } else if (tier > MAX_TIER) {
            this.tier = MAX_TIER;
        } else {
            this.tier = tier;
        }
    }
    
    

}

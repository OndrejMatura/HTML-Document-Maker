package document.elements.types;

import document.elements.SingleTagElement;

public class Text extends SingleTagElement {

    private final String text;

    @Override
    public String tagName() {
        return "";
    }

    @Override
    public String toString() {
        return text;
    }

    public Text(String text) {
        this.text = text;
    }

}

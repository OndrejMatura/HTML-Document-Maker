package document.elements.types;

import document.elements.SingleTagElement;

public class Text extends SingleTagElement {

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

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

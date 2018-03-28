package document.elements.types;

import document.elements.SingleTagElement;

public class Text extends SingleTagElement {

    private String text;

    @Override
    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void appendText(String text) {
        this.text += text;
    }

    @Override
    public String getTagName() {
        return "";
    }

    @Override
    public String toString() {
        return text + " ";
    }

    public Text() {
    }

    public Text(String text) {
        this.text = text;
    }

}

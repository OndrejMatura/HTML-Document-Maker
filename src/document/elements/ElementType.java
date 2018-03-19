package document.elements;

public enum ElementType {
    HTML("html"),
    HEAD("head"),
    TITLE("title"),
    BODY("body"),
    HEADER1("h1"),
    PARAGRAPH("P"),
    BOLD("b");

    private final String tagName;

    private ElementType(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }

}

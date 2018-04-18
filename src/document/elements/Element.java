package document.elements;

public abstract class Element {

    protected static final String TAG = "<%s%s/>";
    protected static final String OPENING_TAG = "<%s%s>";
    protected static final String CLOSING_TAG = "</%s>";

    protected static final String ATTRIBUTE = "=\"%s\"";
    private static final String CLASS_ATTRIBUTE_NAME = "class";
    private static final String ID_ATTRIBUTE_NAME = "id";

    private Element parent;

    private String idAttribute;
    private String classAttribute;

    public Element getParent() {
        return parent;
    }

    protected void setParent(Element element) {
        parent = element;
    }

    protected void removeParent() {
        parent = null;
    }

    public String getAttributes() {
        return createAttributeString(classAttribute, CLASS_ATTRIBUTE_NAME)
                + createAttributeString(idAttribute, ID_ATTRIBUTE_NAME);
    }

    protected static String createAttributeString(String attribute, String attributeName) {
        if (attribute == null || attribute.isEmpty()) {
            return "";
        } else {
            return " " + attributeName + String.format(ATTRIBUTE, attribute);
        }
    }

    public abstract Children children();

    public abstract int childrenCount();

    public abstract boolean hasChildren();

    @Override
    public abstract String toString();

    public abstract String tagName();

    public String getIdAttribute() {
        return idAttribute;
    }

    public void setIdAttribute(String idAttribute) {
        this.idAttribute = idAttribute;
    }

    public String getClassAttribute() {
        return classAttribute;
    }

    public void setClassAttribute(String classAttribute) {
        this.classAttribute = classAttribute;
    }

}

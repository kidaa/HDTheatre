package javax.xml.parsers;
public abstract class DocumentBuilderFactory
{
protected  DocumentBuilderFactory() { throw new RuntimeException("Stub!"); }
public abstract  java.lang.Object getAttribute(java.lang.String name) throws java.lang.IllegalArgumentException;
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.parsers.ParserConfigurationException;
public  boolean isCoalescing() { throw new RuntimeException("Stub!"); }
public  boolean isExpandEntityReferences() { throw new RuntimeException("Stub!"); }
public  boolean isIgnoringComments() { throw new RuntimeException("Stub!"); }
public  boolean isIgnoringElementContentWhitespace() { throw new RuntimeException("Stub!"); }
public  boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
public  boolean isValidating() { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.parsers.DocumentBuilder newDocumentBuilder() throws javax.xml.parsers.ParserConfigurationException;
public static  javax.xml.parsers.DocumentBuilderFactory newInstance() throws javax.xml.parsers.FactoryConfigurationError { throw new RuntimeException("Stub!"); }
public abstract  void setAttribute(java.lang.String name, java.lang.Object value) throws java.lang.IllegalArgumentException;
public  void setCoalescing(boolean value) { throw new RuntimeException("Stub!"); }
public  void setExpandEntityReferences(boolean value) { throw new RuntimeException("Stub!"); }
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.parsers.ParserConfigurationException;
public  void setIgnoringComments(boolean value) { throw new RuntimeException("Stub!"); }
public  void setIgnoringElementContentWhitespace(boolean value) { throw new RuntimeException("Stub!"); }
public  void setNamespaceAware(boolean value) { throw new RuntimeException("Stub!"); }
public  void setValidating(boolean value) { throw new RuntimeException("Stub!"); }
public  void setXIncludeAware(boolean value) { throw new RuntimeException("Stub!"); }
}

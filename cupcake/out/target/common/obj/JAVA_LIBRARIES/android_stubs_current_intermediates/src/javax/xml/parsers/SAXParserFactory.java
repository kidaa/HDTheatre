package javax.xml.parsers;
public abstract class SAXParserFactory
{
protected  SAXParserFactory() { throw new RuntimeException("Stub!"); }
public abstract  boolean getFeature(java.lang.String name) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public  boolean isNamespaceAware() { throw new RuntimeException("Stub!"); }
public  boolean isValidating() { throw new RuntimeException("Stub!"); }
public  boolean isXIncludeAware() { throw new RuntimeException("Stub!"); }
public static  javax.xml.parsers.SAXParserFactory newInstance() throws javax.xml.parsers.FactoryConfigurationError { throw new RuntimeException("Stub!"); }
public abstract  javax.xml.parsers.SAXParser newSAXParser() throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXException;
public abstract  void setFeature(java.lang.String name, boolean value) throws javax.xml.parsers.ParserConfigurationException, org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public  void setNamespaceAware(boolean value) { throw new RuntimeException("Stub!"); }
public  void setValidating(boolean value) { throw new RuntimeException("Stub!"); }
public  void setXIncludeAware(boolean value) { throw new RuntimeException("Stub!"); }
}

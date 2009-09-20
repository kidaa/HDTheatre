package javax.xml.parsers;
public abstract class SAXParser
{
protected  SAXParser() { throw new RuntimeException("Stub!"); }
public abstract  org.xml.sax.Parser getParser() throws org.xml.sax.SAXException;
public abstract  java.lang.Object getProperty(java.lang.String name) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
public abstract  org.xml.sax.XMLReader getXMLReader() throws org.xml.sax.SAXException;
public abstract  boolean isNamespaceAware();
public abstract  boolean isValidating();
public  boolean isXIncludeAware() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.File file, org.xml.sax.HandlerBase handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.File file, org.xml.sax.helpers.DefaultHandler handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream stream, org.xml.sax.HandlerBase handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream stream, org.xml.sax.HandlerBase handler, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream stream, org.xml.sax.helpers.DefaultHandler handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.io.InputStream stream, org.xml.sax.helpers.DefaultHandler handler, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String uri, org.xml.sax.HandlerBase handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(java.lang.String uri, org.xml.sax.helpers.DefaultHandler handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource source, org.xml.sax.HandlerBase handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void parse(org.xml.sax.InputSource source, org.xml.sax.helpers.DefaultHandler handler) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  void reset() { throw new RuntimeException("Stub!"); }
public abstract  void setProperty(java.lang.String name, java.lang.Object value) throws org.xml.sax.SAXNotRecognizedException, org.xml.sax.SAXNotSupportedException;
}

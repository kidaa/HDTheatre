package javax.xml.parsers;
public abstract class DocumentBuilder
{
protected  DocumentBuilder() { throw new RuntimeException("Stub!"); }
public abstract  org.w3c.dom.DOMImplementation getDOMImplementation();
public abstract  boolean isNamespaceAware();
public abstract  boolean isValidating();
public  boolean isXIncludeAware() throws java.lang.UnsupportedOperationException { throw new RuntimeException("Stub!"); }
public abstract  org.w3c.dom.Document newDocument();
public  org.w3c.dom.Document parse(java.io.File file) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.InputStream stream) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.io.InputStream stream, java.lang.String systemId) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public  org.w3c.dom.Document parse(java.lang.String uri) throws org.xml.sax.SAXException, java.io.IOException { throw new RuntimeException("Stub!"); }
public abstract  org.w3c.dom.Document parse(org.xml.sax.InputSource source) throws org.xml.sax.SAXException, java.io.IOException;
public  void reset() { throw new RuntimeException("Stub!"); }
public abstract  void setEntityResolver(org.xml.sax.EntityResolver resolver);
public abstract  void setErrorHandler(org.xml.sax.ErrorHandler handler);
}

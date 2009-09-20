package org.w3c.dom;
public interface Document
  extends org.w3c.dom.Node
{
public abstract  org.w3c.dom.DocumentType getDoctype();
public abstract  org.w3c.dom.DOMImplementation getImplementation();
public abstract  org.w3c.dom.Element getDocumentElement();
public abstract  org.w3c.dom.Element createElement(java.lang.String tagName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.DocumentFragment createDocumentFragment();
public abstract  org.w3c.dom.Text createTextNode(java.lang.String data);
public abstract  org.w3c.dom.Comment createComment(java.lang.String data);
public abstract  org.w3c.dom.CDATASection createCDATASection(java.lang.String data) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.ProcessingInstruction createProcessingInstruction(java.lang.String target, java.lang.String data) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr createAttribute(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.EntityReference createEntityReference(java.lang.String name) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.NodeList getElementsByTagName(java.lang.String tagname);
public abstract  org.w3c.dom.Node importNode(org.w3c.dom.Node importedNode, boolean deep) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Element createElementNS(java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.Attr createAttributeNS(java.lang.String namespaceURI, java.lang.String qualifiedName) throws org.w3c.dom.DOMException;
public abstract  org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String namespaceURI, java.lang.String localName);
public abstract  org.w3c.dom.Element getElementById(java.lang.String elementId);
}

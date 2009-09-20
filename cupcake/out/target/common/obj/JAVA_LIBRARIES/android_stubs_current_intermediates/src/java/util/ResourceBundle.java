package java.util;
public abstract class ResourceBundle
{
public  ResourceBundle() { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String bundleName) throws java.util.MissingResourceException { throw new RuntimeException("Stub!"); }
public static final  java.util.ResourceBundle getBundle(java.lang.String bundleName, java.util.Locale locale) { throw new RuntimeException("Stub!"); }
public static  java.util.ResourceBundle getBundle(java.lang.String bundleName, java.util.Locale locale, java.lang.ClassLoader loader) throws java.util.MissingResourceException { throw new RuntimeException("Stub!"); }
public abstract  java.util.Enumeration<java.lang.String> getKeys();
public  java.util.Locale getLocale() { throw new RuntimeException("Stub!"); }
public final  java.lang.Object getObject(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(java.lang.String key) { throw new RuntimeException("Stub!"); }
public final  java.lang.String[] getStringArray(java.lang.String key) { throw new RuntimeException("Stub!"); }
protected abstract  java.lang.Object handleGetObject(java.lang.String key);
protected  void setParent(java.util.ResourceBundle bundle) { throw new RuntimeException("Stub!"); }
protected java.util.ResourceBundle parent;
}

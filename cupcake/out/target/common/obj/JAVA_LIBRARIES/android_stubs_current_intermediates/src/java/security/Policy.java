package java.security;
public abstract class Policy
{
public  Policy() { throw new RuntimeException("Stub!"); }
public abstract  java.security.PermissionCollection getPermissions(java.security.CodeSource cs);
public abstract  void refresh();
public  java.security.PermissionCollection getPermissions(java.security.ProtectionDomain domain) { throw new RuntimeException("Stub!"); }
public  boolean implies(java.security.ProtectionDomain domain, java.security.Permission permission) { throw new RuntimeException("Stub!"); }
public static  java.security.Policy getPolicy() { throw new RuntimeException("Stub!"); }
public static  void setPolicy(java.security.Policy policy) { throw new RuntimeException("Stub!"); }
}

package dalvik.system;
public final class VMStack
{
public  VMStack() { throw new RuntimeException("Stub!"); }
public static native  java.lang.ClassLoader getCallingClassLoader();
public static native  java.lang.ClassLoader getCallingClassLoader2();
public static native  java.lang.Class<?>[] getClasses(int maxDepth, boolean stopAtPrivileged);
public static native  java.lang.StackTraceElement[] getThreadStackTrace(java.lang.Thread t);
}

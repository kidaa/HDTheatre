package java.io;
public final class FileDescriptor
{
public  FileDescriptor() { throw new RuntimeException("Stub!"); }
public  void sync() throws java.io.SyncFailedException { throw new RuntimeException("Stub!"); }
public native  boolean valid();
public static final java.io.FileDescriptor in;
public static final java.io.FileDescriptor out;
public static final java.io.FileDescriptor err;
static { in = null; out = null; err = null; }
}

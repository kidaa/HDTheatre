package dalvik.system;
public final class VMRuntime
{
VMRuntime() { throw new RuntimeException("Stub!"); }
public static  dalvik.system.VMRuntime getRuntime() { throw new RuntimeException("Stub!"); }
public native  float getTargetHeapUtilization();
public  float setTargetHeapUtilization(float newTarget) { throw new RuntimeException("Stub!"); }
public  long getMinimumHeapSize() { throw new RuntimeException("Stub!"); }
public synchronized  long setMinimumHeapSize(long size) { throw new RuntimeException("Stub!"); }
public native  void gcSoftReferences();
public native  void runFinalizationSync();
public native  long getExternalBytesAllocated();
}

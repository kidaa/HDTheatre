package dalvik.system;
public final class VMDebug
{
VMDebug() { throw new RuntimeException("Stub!"); }
public static native  long lastDebuggerActivity();
public static native  boolean isDebuggingEnabled();
public static native  boolean isDebuggerConnected();
public static  void startMethodTracing() { throw new RuntimeException("Stub!"); }
public static native  void startMethodTracing(java.lang.String traceFileName, int bufferSize, int flags);
public static native  void stopMethodTracing();
public static native  void startEmulatorTracing();
public static native  void stopEmulatorTracing();
public static native  long threadCpuTimeNanos();
public static native  void startAllocCounting();
public static native  void stopAllocCounting();
public static native  int getAllocCount(int kind);
public static native  void resetAllocCount(int kinds);
public static native  int setAllocationLimit(int limit);
public static native  int setGlobalAllocationLimit(int limit);
public static native  void startInstructionCounting();
public static native  void stopInstructionCounting();
public static native  void getInstructionCount(int[] counts);
public static native  void resetInstructionCount();
public static native  void printLoadedClasses(int flags);
public static native  int getLoadedClassCount();
public static native  void dumpHprofData(java.lang.String fileName) throws java.io.IOException;
public static final java.lang.String DEFAULT_METHOD_TRACE_FILE_NAME = "/sdcard/dmtrace.trace";
public static final int TRACE_COUNT_ALLOCS = 1;
public static final int KIND_GLOBAL_ALLOCATED_OBJECTS = 1;
public static final int KIND_GLOBAL_ALLOCATED_BYTES = 2;
public static final int KIND_GLOBAL_FREED_OBJECTS = 4;
public static final int KIND_GLOBAL_FREED_BYTES = 8;
public static final int KIND_GLOBAL_GC_INVOCATIONS = 16;
public static final int KIND_GLOBAL_EXT_ALLOCATED_OBJECTS = 4096;
public static final int KIND_GLOBAL_EXT_ALLOCATED_BYTES = 8192;
public static final int KIND_GLOBAL_EXT_FREED_OBJECTS = 16384;
public static final int KIND_GLOBAL_EXT_FREED_BYTES = 32768;
public static final int KIND_THREAD_ALLOCATED_OBJECTS = 65536;
public static final int KIND_THREAD_ALLOCATED_BYTES = 131072;
public static final int KIND_THREAD_FREED_OBJECTS = 262144;
public static final int KIND_THREAD_FREED_BYTES = 524288;
public static final int KIND_THREAD_GC_INVOCATIONS = 1048576;
public static final int KIND_THREAD_EXT_ALLOCATED_OBJECTS = 268435456;
public static final int KIND_THREAD_EXT_ALLOCATED_BYTES = 536870912;
public static final int KIND_THREAD_EXT_FREED_OBJECTS = 1073741824;
public static final int KIND_THREAD_EXT_FREED_BYTES = -2147483648;
public static final int KIND_ALL_COUNTS = -1;
}

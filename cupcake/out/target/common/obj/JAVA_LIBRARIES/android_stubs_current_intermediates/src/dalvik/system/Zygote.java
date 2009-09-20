package dalvik.system;
public class Zygote
{
Zygote() { throw new RuntimeException("Stub!"); }
public static native  int fork();
public static native  int forkAndSpecialize(int uid, int gid, int[] gids, int debugFlags, int[][] rlimits);
public static  int forkAndSpecialize(int uid, int gid, int[] gids, boolean enableDebugger, int[][] rlimits) { throw new RuntimeException("Stub!"); }
public static native  int forkSystemServer(int uid, int gid, int[] gids, int debugFlags, int[][] rlimits);
public static  int forkSystemServer(int uid, int gid, int[] gids, boolean enableDebugger, int[][] rlimits) { throw new RuntimeException("Stub!"); }
public static final int DEBUG_ENABLE_DEBUGGER = 1;
public static final int DEBUG_ENABLE_CHECKJNI = 2;
public static final int DEBUG_ENABLE_ASSERT = 4;
}

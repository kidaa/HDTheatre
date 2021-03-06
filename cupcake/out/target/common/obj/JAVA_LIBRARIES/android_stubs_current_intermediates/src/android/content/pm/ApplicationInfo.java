package android.content.pm;
public class ApplicationInfo
  extends android.content.pm.PackageItemInfo
  implements android.os.Parcelable
{
public static class DisplayNameComparator
  implements java.util.Comparator<android.content.pm.ApplicationInfo>
{
public  DisplayNameComparator(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public final  int compare(android.content.pm.ApplicationInfo aa, android.content.pm.ApplicationInfo ab) { throw new RuntimeException("Stub!"); }
}
public  ApplicationInfo() { throw new RuntimeException("Stub!"); }
public  ApplicationInfo(android.content.pm.ApplicationInfo orig) { throw new RuntimeException("Stub!"); }
public  void dump(android.util.Printer pw, java.lang.String prefix) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence loadDescription(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public java.lang.String taskAffinity;
public java.lang.String permission;
public java.lang.String processName;
public java.lang.String className;
public int descriptionRes;
public int theme;
public java.lang.String manageSpaceActivityName;
public static final int FLAG_SYSTEM = 1;
public static final int FLAG_DEBUGGABLE = 2;
public static final int FLAG_HAS_CODE = 4;
public static final int FLAG_PERSISTENT = 8;
public static final int FLAG_FACTORY_TEST = 16;
public static final int FLAG_ALLOW_TASK_REPARENTING = 32;
public static final int FLAG_ALLOW_CLEAR_USER_DATA = 64;
public int flags;
public java.lang.String sourceDir;
public java.lang.String publicSourceDir;
public java.lang.String[] sharedLibraryFiles = null;
public java.lang.String dataDir;
public int uid;
public boolean enabled;
public static final android.os.Parcelable.Creator<android.content.pm.ApplicationInfo> CREATOR;
static { CREATOR = null; }
}

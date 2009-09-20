package android.content.pm;
public abstract class PackageManager
{
public static class NameNotFoundException
  extends android.util.AndroidException
{
public  NameNotFoundException() { throw new RuntimeException("Stub!"); }
public  NameNotFoundException(java.lang.String name) { throw new RuntimeException("Stub!"); }
}
public  PackageManager() { throw new RuntimeException("Stub!"); }
public abstract  android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.Intent getLaunchIntentForPackage(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  int[] getPackageGids(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags);
public abstract  android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags);
public abstract  int checkPermission(java.lang.String permName, java.lang.String pkgName);
public abstract  boolean addPermission(android.content.pm.PermissionInfo info);
public abstract  void removePermission(java.lang.String name);
public abstract  int checkSignatures(java.lang.String pkg1, java.lang.String pkg2);
public abstract  java.lang.String[] getPackagesForUid(int uid);
public abstract  java.lang.String getNameForUid(int uid);
public abstract  java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags);
public abstract  java.lang.String[] getSystemSharedLibraryNames();
public abstract  android.content.pm.ResolveInfo resolveActivity(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName caller, android.content.Intent[] specifics, android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers(android.content.Intent intent, int flags);
public abstract  android.content.pm.ResolveInfo resolveService(android.content.Intent intent, int flags);
public abstract  java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, int flags);
public abstract  android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags);
public abstract  java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String processName, int uid, int flags);
public abstract  android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName className, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String targetPackage, int flags);
public abstract  android.graphics.drawable.Drawable getDrawable(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo);
public abstract  android.graphics.drawable.Drawable getActivityIcon(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getActivityIcon(android.content.Intent intent) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.graphics.drawable.Drawable getDefaultActivityIcon();
public abstract  android.graphics.drawable.Drawable getApplicationIcon(android.content.pm.ApplicationInfo info);
public abstract  android.graphics.drawable.Drawable getApplicationIcon(java.lang.String packageName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  java.lang.CharSequence getText(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo);
public abstract  android.content.res.XmlResourceParser getXml(java.lang.String packageName, int resid, android.content.pm.ApplicationInfo appInfo);
public abstract  java.lang.CharSequence getApplicationLabel(android.content.pm.ApplicationInfo info);
public abstract  android.content.res.Resources getResourcesForActivity(android.content.ComponentName activityName) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.res.Resources getResourcesForApplication(android.content.pm.ApplicationInfo app) throws android.content.pm.PackageManager.NameNotFoundException;
public abstract  android.content.res.Resources getResourcesForApplication(java.lang.String appPackageName) throws android.content.pm.PackageManager.NameNotFoundException;
public  android.content.pm.PackageInfo getPackageArchiveInfo(java.lang.String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); }
public abstract  void installPackage(android.net.Uri packageURI, android.content.pm.IPackageInstallObserver observer, int flags);
public  void installPackage(android.net.Uri packageURI) { throw new RuntimeException("Stub!"); }
public abstract  void addPackageToPreferred(java.lang.String packageName);
public abstract  void removePackageFromPreferred(java.lang.String packageName);
public abstract  java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int flags);
public abstract  void addPreferredActivity(android.content.IntentFilter filter, int match, android.content.ComponentName[] set, android.content.ComponentName activity);
public abstract  void clearPackagePreferredActivities(java.lang.String packageName);
public abstract  int getPreferredActivities(java.util.List<android.content.IntentFilter> outFilters, java.util.List<android.content.ComponentName> outActivities, java.lang.String packageName);
public abstract  void setComponentEnabledSetting(android.content.ComponentName componentName, int newState, int flags);
public abstract  int getComponentEnabledSetting(android.content.ComponentName componentName);
public abstract  void setApplicationEnabledSetting(java.lang.String packageName, int newState, int flags);
public abstract  int getApplicationEnabledSetting(java.lang.String packageName);
public abstract  boolean isSafeMode();
public static final int GET_ACTIVITIES = 1;
public static final int GET_RECEIVERS = 2;
public static final int GET_SERVICES = 4;
public static final int GET_PROVIDERS = 8;
public static final int GET_INSTRUMENTATION = 16;
public static final int GET_INTENT_FILTERS = 32;
public static final int GET_SIGNATURES = 64;
public static final int GET_RESOLVED_FILTER = 64;
public static final int GET_META_DATA = 128;
public static final int GET_GIDS = 256;
public static final int GET_DISABLED_COMPONENTS = 512;
public static final int GET_SHARED_LIBRARY_FILES = 1024;
public static final int GET_URI_PERMISSION_PATTERNS = 2048;
public static final int GET_PERMISSIONS = 4096;
public static final int GET_UNINSTALLED_PACKAGES = 8192;
public static final int GET_CONFIGURATIONS = 16384;
public static final int PERMISSION_GRANTED = 0;
public static final int PERMISSION_DENIED = -1;
public static final int SIGNATURE_MATCH = 0;
public static final int SIGNATURE_NEITHER_SIGNED = 1;
public static final int SIGNATURE_FIRST_NOT_SIGNED = -1;
public static final int SIGNATURE_SECOND_NOT_SIGNED = -2;
public static final int SIGNATURE_NO_MATCH = -3;
public static final int SIGNATURE_UNKNOWN_PACKAGE = -4;
public static final int MATCH_DEFAULT_ONLY = 65536;
public static final int COMPONENT_ENABLED_STATE_DEFAULT = 0;
public static final int COMPONENT_ENABLED_STATE_ENABLED = 1;
public static final int COMPONENT_ENABLED_STATE_DISABLED = 2;
public static final int FORWARD_LOCK_PACKAGE = 1;
public static final int REPLACE_EXISTING_PACKAGE = 2;
public static final int DONT_KILL_APP = 1;
public static final int INSTALL_SUCCEEDED = 1;
public static final int INSTALL_FAILED_ALREADY_EXISTS = -1;
public static final int INSTALL_FAILED_INVALID_APK = -2;
public static final int INSTALL_FAILED_INVALID_URI = -3;
public static final int INSTALL_FAILED_INSUFFICIENT_STORAGE = -4;
public static final int INSTALL_FAILED_DUPLICATE_PACKAGE = -5;
public static final int INSTALL_FAILED_NO_SHARED_USER = -6;
public static final int INSTALL_FAILED_UPDATE_INCOMPATIBLE = -7;
public static final int INSTALL_FAILED_SHARED_USER_INCOMPATIBLE = -8;
public static final int INSTALL_FAILED_MISSING_SHARED_LIBRARY = -9;
public static final int INSTALL_FAILED_REPLACE_COULDNT_DELETE = -10;
public static final int INSTALL_FAILED_DEXOPT = -11;
public static final int INSTALL_FAILED_OLDER_SDK = -12;
public static final int INSTALL_FAILED_CONFLICTING_PROVIDER = -13;
public static final int INSTALL_PARSE_FAILED_NOT_APK = -100;
public static final int INSTALL_PARSE_FAILED_BAD_MANIFEST = -101;
public static final int INSTALL_PARSE_FAILED_UNEXPECTED_EXCEPTION = -102;
public static final int INSTALL_PARSE_FAILED_NO_CERTIFICATES = -103;
public static final int INSTALL_PARSE_FAILED_INCONSISTENT_CERTIFICATES = -104;
public static final int INSTALL_PARSE_FAILED_CERTIFICATE_ENCODING = -105;
public static final int INSTALL_PARSE_FAILED_BAD_PACKAGE_NAME = -106;
public static final int INSTALL_PARSE_FAILED_BAD_SHARED_USER_ID = -107;
public static final int INSTALL_PARSE_FAILED_MANIFEST_MALFORMED = -108;
public static final int INSTALL_PARSE_FAILED_MANIFEST_EMPTY = -109;
public static final int PKG_INSTALL_INCOMPLETE = 0;
public static final int PKG_INSTALL_COMPLETE = 1;
}

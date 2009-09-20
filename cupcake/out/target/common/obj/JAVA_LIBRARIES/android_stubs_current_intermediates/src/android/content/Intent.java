package android.content;
public class Intent
  implements android.os.Parcelable
{
public static class ShortcutIconResource
  implements android.os.Parcelable
{
public  ShortcutIconResource() { throw new RuntimeException("Stub!"); }
public static  android.content.Intent.ShortcutIconResource fromContext(android.content.Context context, int resourceId) { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public java.lang.String packageName;
public java.lang.String resourceName;
public static final android.os.Parcelable.Creator<android.content.Intent.ShortcutIconResource> CREATOR;
static { CREATOR = null; }
}
public static final class FilterComparison
{
public  FilterComparison(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
public  android.content.Intent getIntent() { throw new RuntimeException("Stub!"); }
public  boolean equals(java.lang.Object obj) { throw new RuntimeException("Stub!"); }
public  int hashCode() { throw new RuntimeException("Stub!"); }
}
public  Intent() { throw new RuntimeException("Stub!"); }
public  Intent(android.content.Intent o) { throw new RuntimeException("Stub!"); }
public  Intent(java.lang.String action) { throw new RuntimeException("Stub!"); }
public  Intent(java.lang.String action, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
public  Intent(android.content.Context packageContext, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public  Intent(java.lang.String action, android.net.Uri uri, android.content.Context packageContext, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent createChooser(android.content.Intent target, java.lang.CharSequence title) { throw new RuntimeException("Stub!"); }
public  java.lang.Object clone() { throw new RuntimeException("Stub!"); }
public  android.content.Intent cloneFilter() { throw new RuntimeException("Stub!"); }
public static  android.content.Intent getIntent(java.lang.String uri) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public static  android.content.Intent getIntentOld(java.lang.String uri) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
public  java.lang.String getAction() { throw new RuntimeException("Stub!"); }
public  android.net.Uri getData() { throw new RuntimeException("Stub!"); }
public  java.lang.String getDataString() { throw new RuntimeException("Stub!"); }
public  java.lang.String getScheme() { throw new RuntimeException("Stub!"); }
public  java.lang.String getType() { throw new RuntimeException("Stub!"); }
public  java.lang.String resolveType(android.content.Context context) { throw new RuntimeException("Stub!"); }
public  java.lang.String resolveType(android.content.ContentResolver resolver) { throw new RuntimeException("Stub!"); }
public  java.lang.String resolveTypeIfNeeded(android.content.ContentResolver resolver) { throw new RuntimeException("Stub!"); }
public  boolean hasCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  java.util.Set<java.lang.String> getCategories() { throw new RuntimeException("Stub!"); }
public  void setExtrasClassLoader(java.lang.ClassLoader loader) { throw new RuntimeException("Stub!"); }
public  boolean hasExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
public  boolean getBooleanExtra(java.lang.String name, boolean defaultValue) { throw new RuntimeException("Stub!"); }
public  byte getByteExtra(java.lang.String name, byte defaultValue) { throw new RuntimeException("Stub!"); }
public  short getShortExtra(java.lang.String name, short defaultValue) { throw new RuntimeException("Stub!"); }
public  char getCharExtra(java.lang.String name, char defaultValue) { throw new RuntimeException("Stub!"); }
public  int getIntExtra(java.lang.String name, int defaultValue) { throw new RuntimeException("Stub!"); }
public  long getLongExtra(java.lang.String name, long defaultValue) { throw new RuntimeException("Stub!"); }
public  float getFloatExtra(java.lang.String name, float defaultValue) { throw new RuntimeException("Stub!"); }
public  double getDoubleExtra(java.lang.String name, double defaultValue) { throw new RuntimeException("Stub!"); }
public  java.lang.String getStringExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.CharSequence getCharSequenceExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> T getParcelableExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.os.Parcelable[] getParcelableArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public <T extends android.os.Parcelable> java.util.ArrayList<T> getParcelableArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.io.Serializable getSerializableExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.Integer> getIntegerArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.util.ArrayList<java.lang.String> getStringArrayListExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  boolean[] getBooleanArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  byte[] getByteArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  short[] getShortArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  char[] getCharArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  int[] getIntArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  long[] getLongArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  float[] getFloatArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  double[] getDoubleArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  java.lang.String[] getStringArrayExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getBundleExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
public  int getFlags() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName getComponent() { throw new RuntimeException("Stub!"); }
public  android.content.ComponentName resolveActivity(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
public  android.content.pm.ActivityInfo resolveActivityInfo(android.content.pm.PackageManager pm, int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setAction(java.lang.String action) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setData(android.net.Uri data) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setType(java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setDataAndType(android.net.Uri data, java.lang.String type) { throw new RuntimeException("Stub!"); }
public  android.content.Intent addCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  void removeCategory(java.lang.String category) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, boolean value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, byte value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, char value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, short value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, int value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, long value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, float value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, double value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.String value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.CharSequence value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, android.os.Parcelable value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, android.os.Parcelable[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putParcelableArrayListExtra(java.lang.String name, java.util.ArrayList<? extends android.os.Parcelable> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putIntegerArrayListExtra(java.lang.String name, java.util.ArrayList<java.lang.Integer> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putStringArrayListExtra(java.lang.String name, java.util.ArrayList<java.lang.String> value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.io.Serializable value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, boolean[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, byte[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, short[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, char[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, int[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, long[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, float[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, double[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, java.lang.String[] value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtra(java.lang.String name, android.os.Bundle value) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtras(android.content.Intent src) { throw new RuntimeException("Stub!"); }
public  android.content.Intent putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  android.content.Intent replaceExtras(android.content.Intent src) { throw new RuntimeException("Stub!"); }
public  android.content.Intent replaceExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
public  void removeExtra(java.lang.String name) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent addFlags(int flags) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setComponent(android.content.ComponentName component) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setClassName(android.content.Context packageContext, java.lang.String className) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setClassName(java.lang.String packageName, java.lang.String className) { throw new RuntimeException("Stub!"); }
public  android.content.Intent setClass(android.content.Context packageContext, java.lang.Class<?> cls) { throw new RuntimeException("Stub!"); }
public  int fillIn(android.content.Intent other, int flags) { throw new RuntimeException("Stub!"); }
public  boolean filterEquals(android.content.Intent other) { throw new RuntimeException("Stub!"); }
public  int filterHashCode() { throw new RuntimeException("Stub!"); }
public  java.lang.String toString() { throw new RuntimeException("Stub!"); }
public  java.lang.String toURI() { throw new RuntimeException("Stub!"); }
public  int describeContents() { throw new RuntimeException("Stub!"); }
public  void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
public  void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
public static  android.content.Intent parseIntent(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
public static final java.lang.String ACTION_MAIN = "android.intent.action.MAIN";
public static final java.lang.String ACTION_VIEW = "android.intent.action.VIEW";
public static final java.lang.String ACTION_DEFAULT = "android.intent.action.VIEW";
public static final java.lang.String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";
public static final java.lang.String ACTION_EDIT = "android.intent.action.EDIT";
public static final java.lang.String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";
public static final java.lang.String ACTION_PICK = "android.intent.action.PICK";
public static final java.lang.String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";
public static final java.lang.String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";
public static final java.lang.String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";
public static final java.lang.String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";
public static final java.lang.String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";
public static final java.lang.String ACTION_CHOOSER = "android.intent.action.CHOOSER";
public static final java.lang.String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";
public static final java.lang.String ACTION_DIAL = "android.intent.action.DIAL";
public static final java.lang.String ACTION_CALL = "android.intent.action.CALL";
public static final java.lang.String ACTION_SENDTO = "android.intent.action.SENDTO";
public static final java.lang.String ACTION_SEND = "android.intent.action.SEND";
public static final java.lang.String ACTION_ANSWER = "android.intent.action.ANSWER";
public static final java.lang.String ACTION_INSERT = "android.intent.action.INSERT";
public static final java.lang.String ACTION_DELETE = "android.intent.action.DELETE";
public static final java.lang.String ACTION_RUN = "android.intent.action.RUN";
public static final java.lang.String ACTION_SYNC = "android.intent.action.SYNC";
public static final java.lang.String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";
public static final java.lang.String ACTION_SEARCH = "android.intent.action.SEARCH";
public static final java.lang.String ACTION_SYSTEM_TUTORIAL = "android.intent.action.SYSTEM_TUTORIAL";
public static final java.lang.String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";
public static final java.lang.String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";
public static final java.lang.String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";
public static final java.lang.String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";
public static final java.lang.String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";
public static final java.lang.String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";
public static final java.lang.String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
public static final java.lang.String ACTION_SEARCH_LONG_PRESS = "android.intent.action.SEARCH_LONG_PRESS";
public static final java.lang.String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";
public static final java.lang.String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";
public static final java.lang.String ACTION_USER_PRESENT = "android.intent.action.USER_PRESENT";
public static final java.lang.String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";
public static final java.lang.String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";
public static final java.lang.String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";
public static final java.lang.String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";
public static final java.lang.String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
public static final java.lang.String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
public static final java.lang.String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";
public static final java.lang.String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";
public static final java.lang.String ACTION_PACKAGE_REPLACED = "android.intent.action.PACKAGE_REPLACED";
public static final java.lang.String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
public static final java.lang.String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";
public static final java.lang.String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";
public static final java.lang.String ACTION_PACKAGE_DATA_CLEARED = "android.intent.action.PACKAGE_DATA_CLEARED";
public static final java.lang.String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";
public static final java.lang.String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";
public static final java.lang.String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";
public static final java.lang.String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";
public static final java.lang.String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";
public static final java.lang.String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";
public static final java.lang.String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";
public static final java.lang.String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";
public static final java.lang.String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";
public static final java.lang.String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";
public static final java.lang.String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
public static final java.lang.String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";
public static final java.lang.String ACTION_MEDIA_CHECKING = "android.intent.action.MEDIA_CHECKING";
public static final java.lang.String ACTION_MEDIA_NOFS = "android.intent.action.MEDIA_NOFS";
public static final java.lang.String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
public static final java.lang.String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";
public static final java.lang.String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
public static final java.lang.String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";
public static final java.lang.String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";
public static final java.lang.String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";
public static final java.lang.String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";
public static final java.lang.String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
public static final java.lang.String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";
public static final java.lang.String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";
public static final java.lang.String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";
public static final java.lang.String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";
public static final java.lang.String ACTION_INPUT_METHOD_CHANGED = "android.intent.action.INPUT_METHOD_CHANGED";
public static final java.lang.String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";
public static final java.lang.String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";
public static final java.lang.String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
public static final java.lang.String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
public static final java.lang.String ACTION_REBOOT = "android.intent.action.REBOOT";
public static final java.lang.String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";
public static final java.lang.String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";
public static final java.lang.String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";
public static final java.lang.String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";
public static final java.lang.String CATEGORY_TAB = "android.intent.category.TAB";
public static final java.lang.String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";
public static final java.lang.String CATEGORY_INFO = "android.intent.category.INFO";
public static final java.lang.String CATEGORY_HOME = "android.intent.category.HOME";
public static final java.lang.String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";
public static final java.lang.String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";
public static final java.lang.String CATEGORY_EMBED = "android.intent.category.EMBED";
public static final java.lang.String CATEGORY_MONKEY = "android.intent.category.MONKEY";
public static final java.lang.String CATEGORY_TEST = "android.intent.category.TEST";
public static final java.lang.String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";
public static final java.lang.String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";
public static final java.lang.String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";
public static final java.lang.String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";
public static final java.lang.String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";
public static final java.lang.String EXTRA_TEXT = "android.intent.extra.TEXT";
public static final java.lang.String EXTRA_STREAM = "android.intent.extra.STREAM";
public static final java.lang.String EXTRA_EMAIL = "android.intent.extra.EMAIL";
public static final java.lang.String EXTRA_CC = "android.intent.extra.CC";
public static final java.lang.String EXTRA_BCC = "android.intent.extra.BCC";
public static final java.lang.String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";
public static final java.lang.String EXTRA_INTENT = "android.intent.extra.INTENT";
public static final java.lang.String EXTRA_TITLE = "android.intent.extra.TITLE";
public static final java.lang.String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";
public static final java.lang.String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
public static final java.lang.String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
public static final java.lang.String EXTRA_UID = "android.intent.extra.UID";
public static final java.lang.String EXTRA_DATA_REMOVED = "android.intent.extra.DATA_REMOVED";
public static final java.lang.String EXTRA_REPLACING = "android.intent.extra.REPLACING";
public static final java.lang.String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";
public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;
public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;
public static final int FLAG_FROM_BACKGROUND = 4;
public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;
public static final int FLAG_ACTIVITY_NO_HISTORY = 1073741824;
public static final int FLAG_ACTIVITY_SINGLE_TOP = 536870912;
public static final int FLAG_ACTIVITY_NEW_TASK = 268435456;
public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 134217728;
public static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;
public static final int FLAG_ACTIVITY_FORWARD_RESULT = 33554432;
public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 16777216;
public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 8388608;
public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 4194304;
public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 2097152;
public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 1048576;
public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = 524288;
public static final int FLAG_ACTIVITY_NO_USER_ACTION = 262144;
public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = 131072;
public static final int FLAG_RECEIVER_REGISTERED_ONLY = 1073741824;
public static final int FILL_IN_ACTION = 1;
public static final int FILL_IN_DATA = 2;
public static final int FILL_IN_CATEGORIES = 4;
public static final int FILL_IN_COMPONENT = 8;
public static final android.os.Parcelable.Creator<android.content.Intent> CREATOR;
static { CREATOR = null; }
}

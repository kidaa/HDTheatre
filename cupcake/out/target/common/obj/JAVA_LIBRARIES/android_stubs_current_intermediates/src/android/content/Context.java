package android.content;
public abstract class Context
{
public  Context() { throw new RuntimeException("Stub!"); }
public abstract  android.content.res.AssetManager getAssets();
public abstract  android.content.res.Resources getResources();
public abstract  android.content.pm.PackageManager getPackageManager();
public abstract  android.content.ContentResolver getContentResolver();
public abstract  android.os.Looper getMainLooper();
public abstract  android.content.Context getApplicationContext();
public final  java.lang.CharSequence getText(int resId) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(int resId) { throw new RuntimeException("Stub!"); }
public final  java.lang.String getString(int resId, java.lang.Object... formatArgs) { throw new RuntimeException("Stub!"); }
public abstract  void setTheme(int resid);
public abstract  android.content.res.Resources.Theme getTheme();
public final  android.content.res.TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray obtainStyledAttributes(int resid, int[] attrs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); }
public final  android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
public abstract  java.lang.ClassLoader getClassLoader();
public abstract  java.lang.String getPackageName();
public abstract  android.content.SharedPreferences getSharedPreferences(java.lang.String name, int mode);
public abstract  java.io.FileInputStream openFileInput(java.lang.String name) throws java.io.FileNotFoundException;
public abstract  java.io.FileOutputStream openFileOutput(java.lang.String name, int mode) throws java.io.FileNotFoundException;
public abstract  boolean deleteFile(java.lang.String name);
public abstract  java.io.File getFileStreamPath(java.lang.String name);
public abstract  java.io.File getFilesDir();
public abstract  java.io.File getCacheDir();
public abstract  java.lang.String[] fileList();
public abstract  java.io.File getDir(java.lang.String name, int mode);
public abstract  android.database.sqlite.SQLiteDatabase openOrCreateDatabase(java.lang.String name, int mode, android.database.sqlite.SQLiteDatabase.CursorFactory factory);
public abstract  boolean deleteDatabase(java.lang.String name);
public abstract  java.io.File getDatabasePath(java.lang.String name);
public abstract  java.lang.String[] databaseList();
public abstract  android.graphics.drawable.Drawable getWallpaper();
public abstract  android.graphics.drawable.Drawable peekWallpaper();
public abstract  int getWallpaperDesiredMinimumWidth();
public abstract  int getWallpaperDesiredMinimumHeight();
public abstract  void setWallpaper(android.graphics.Bitmap bitmap) throws java.io.IOException;
public abstract  void setWallpaper(java.io.InputStream data) throws java.io.IOException;
public abstract  void clearWallpaper() throws java.io.IOException;
public abstract  void startActivity(android.content.Intent intent);
public abstract  void sendBroadcast(android.content.Intent intent);
public abstract  void sendBroadcast(android.content.Intent intent, java.lang.String receiverPermission);
public abstract  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission);
public abstract  void sendOrderedBroadcast(android.content.Intent intent, java.lang.String receiverPermission, android.content.BroadcastReceiver resultReceiver, android.os.Handler scheduler, int initialCode, java.lang.String initialData, android.os.Bundle initialExtras);
public abstract  void sendStickyBroadcast(android.content.Intent intent);
public abstract  void removeStickyBroadcast(android.content.Intent intent);
public abstract  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter);
public abstract  android.content.Intent registerReceiver(android.content.BroadcastReceiver receiver, android.content.IntentFilter filter, java.lang.String broadcastPermission, android.os.Handler scheduler);
public abstract  void unregisterReceiver(android.content.BroadcastReceiver receiver);
public abstract  android.content.ComponentName startService(android.content.Intent service);
public abstract  boolean stopService(android.content.Intent service);
public abstract  boolean bindService(android.content.Intent service, android.content.ServiceConnection conn, int flags);
public abstract  void unbindService(android.content.ServiceConnection conn);
public abstract  boolean startInstrumentation(android.content.ComponentName className, java.lang.String profileFile, android.os.Bundle arguments);
public abstract  java.lang.Object getSystemService(java.lang.String name);
public abstract  int checkPermission(java.lang.String permission, int pid, int uid);
public abstract  int checkCallingPermission(java.lang.String permission);
public abstract  int checkCallingOrSelfPermission(java.lang.String permission);
public abstract  void enforcePermission(java.lang.String permission, int pid, int uid, java.lang.String message);
public abstract  void enforceCallingPermission(java.lang.String permission, java.lang.String message);
public abstract  void enforceCallingOrSelfPermission(java.lang.String permission, java.lang.String message);
public abstract  void grantUriPermission(java.lang.String toPackage, android.net.Uri uri, int modeFlags);
public abstract  void revokeUriPermission(android.net.Uri uri, int modeFlags);
public abstract  int checkUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags);
public abstract  int checkCallingUriPermission(android.net.Uri uri, int modeFlags);
public abstract  int checkCallingOrSelfUriPermission(android.net.Uri uri, int modeFlags);
public abstract  int checkUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags);
public abstract  void enforceUriPermission(android.net.Uri uri, int pid, int uid, int modeFlags, java.lang.String message);
public abstract  void enforceCallingUriPermission(android.net.Uri uri, int modeFlags, java.lang.String message);
public abstract  void enforceCallingOrSelfUriPermission(android.net.Uri uri, int modeFlags, java.lang.String message);
public abstract  void enforceUriPermission(android.net.Uri uri, java.lang.String readPermission, java.lang.String writePermission, int pid, int uid, int modeFlags, java.lang.String message);
public abstract  android.content.Context createPackageContext(java.lang.String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException;
public static final int MODE_PRIVATE = 0;
public static final int MODE_WORLD_READABLE = 1;
public static final int MODE_WORLD_WRITEABLE = 2;
public static final int MODE_APPEND = 32768;
public static final int BIND_AUTO_CREATE = 1;
public static final int BIND_DEBUG_UNBIND = 2;
public static final java.lang.String POWER_SERVICE = "power";
public static final java.lang.String WINDOW_SERVICE = "window";
public static final java.lang.String LAYOUT_INFLATER_SERVICE = "layout_inflater";
public static final java.lang.String ACTIVITY_SERVICE = "activity";
public static final java.lang.String ALARM_SERVICE = "alarm";
public static final java.lang.String NOTIFICATION_SERVICE = "notification";
public static final java.lang.String KEYGUARD_SERVICE = "keyguard";
public static final java.lang.String LOCATION_SERVICE = "location";
public static final java.lang.String SEARCH_SERVICE = "search";
public static final java.lang.String SENSOR_SERVICE = "sensor";
public static final java.lang.String WALLPAPER_SERVICE = "wallpaper";
public static final java.lang.String VIBRATOR_SERVICE = "vibrator";
public static final java.lang.String CONNECTIVITY_SERVICE = "connectivity";
public static final java.lang.String WIFI_SERVICE = "wifi";
public static final java.lang.String AUDIO_SERVICE = "audio";
public static final java.lang.String TELEPHONY_SERVICE = "phone";
public static final java.lang.String CLIPBOARD_SERVICE = "clipboard";
public static final java.lang.String INPUT_METHOD_SERVICE = "input_method";
public static final int CONTEXT_INCLUDE_CODE = 1;
public static final int CONTEXT_IGNORE_SECURITY = 2;
}

package android.net;
public class ConnectivityManager
{
ConnectivityManager() { throw new RuntimeException("Stub!"); }
public static  boolean isNetworkTypeValid(int networkType) { throw new RuntimeException("Stub!"); }
public  void setNetworkPreference(int preference) { throw new RuntimeException("Stub!"); }
public  int getNetworkPreference() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkInfo getActiveNetworkInfo() { throw new RuntimeException("Stub!"); }
public  android.net.NetworkInfo getNetworkInfo(int networkType) { throw new RuntimeException("Stub!"); }
public  android.net.NetworkInfo[] getAllNetworkInfo() { throw new RuntimeException("Stub!"); }
public  int startUsingNetworkFeature(int networkType, java.lang.String feature) { throw new RuntimeException("Stub!"); }
public  int stopUsingNetworkFeature(int networkType, java.lang.String feature) { throw new RuntimeException("Stub!"); }
public  boolean requestRouteToHost(int networkType, int hostAddress) { throw new RuntimeException("Stub!"); }
public  boolean getBackgroundDataSetting() { throw new RuntimeException("Stub!"); }
public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
public static final java.lang.String EXTRA_NETWORK_INFO = "networkInfo";
public static final java.lang.String EXTRA_IS_FAILOVER = "isFailover";
public static final java.lang.String EXTRA_OTHER_NETWORK_INFO = "otherNetwork";
public static final java.lang.String EXTRA_NO_CONNECTIVITY = "noConnectivity";
public static final java.lang.String EXTRA_REASON = "reason";
public static final java.lang.String EXTRA_EXTRA_INFO = "extraInfo";
public static final java.lang.String ACTION_BACKGROUND_DATA_SETTING_CHANGED = "android.net.conn.BACKGROUND_DATA_SETTING_CHANGED";
public static final int TYPE_MOBILE = 0;
public static final int TYPE_WIFI = 1;
public static final int DEFAULT_NETWORK_PREFERENCE = 1;
}
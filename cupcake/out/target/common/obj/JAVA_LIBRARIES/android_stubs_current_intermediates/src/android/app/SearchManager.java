package android.app;
public class SearchManager
  implements android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnCancelListener
{
public static interface OnDismissListener
{
public abstract  void onDismiss();
}
public static interface OnCancelListener
{
public abstract  void onCancel();
}
SearchManager() { throw new RuntimeException("Stub!"); }
public  void startSearch(java.lang.String initialQuery, boolean selectInitialQuery, android.content.ComponentName launchActivity, android.os.Bundle appSearchData, boolean globalSearch) { throw new RuntimeException("Stub!"); }
public  void stopSearch() { throw new RuntimeException("Stub!"); }
public  void setOnDismissListener(android.app.SearchManager.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
public  void setOnCancelListener(android.app.SearchManager.OnCancelListener listener) { throw new RuntimeException("Stub!"); }
public  void onDismiss(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public  void onCancel(android.content.DialogInterface dialog) { throw new RuntimeException("Stub!"); }
public static final char MENU_KEY = 115;
public static final int MENU_KEYCODE = 47;
public static final java.lang.String QUERY = "query";
public static final java.lang.String APP_DATA = "app_data";
public static final java.lang.String ACTION_KEY = "action_key";
public static final java.lang.String ACTION_MSG = "action_msg";
public static final java.lang.String SUGGEST_URI_PATH_QUERY = "search_suggest_query";
public static final java.lang.String SUGGEST_MIME_TYPE = "vnd.android.cursor.dir/vnd.android.search.suggest";
public static final java.lang.String SUGGEST_COLUMN_FORMAT = "suggest_format";
public static final java.lang.String SUGGEST_COLUMN_TEXT_1 = "suggest_text_1";
public static final java.lang.String SUGGEST_COLUMN_TEXT_2 = "suggest_text_2";
public static final java.lang.String SUGGEST_COLUMN_ICON_1 = "suggest_icon_1";
public static final java.lang.String SUGGEST_COLUMN_ICON_2 = "suggest_icon_2";
public static final java.lang.String SUGGEST_COLUMN_INTENT_ACTION = "suggest_intent_action";
public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA = "suggest_intent_data";
public static final java.lang.String SUGGEST_COLUMN_INTENT_DATA_ID = "suggest_intent_data_id";
public static final java.lang.String SUGGEST_COLUMN_QUERY = "suggest_intent_query";
}

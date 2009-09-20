/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IWallpaperServiceCallback.aidl
 */
package android.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
/**
 * Callback interface used by IWallpaperService to send asynchronous 
 * notifications back to its clients.  Note that this is a
 * one-way interface so the server does not block waiting for the client.
 *
 * @hide
 */
public interface IWallpaperServiceCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IWallpaperServiceCallback
{
private static final java.lang.String DESCRIPTOR = "android.app.IWallpaperServiceCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IWallpaperServiceCallback interface,
 * generating a proxy if needed.
 */
public static android.app.IWallpaperServiceCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IWallpaperServiceCallback))) {
return ((android.app.IWallpaperServiceCallback)iin);
}
return new android.app.IWallpaperServiceCallback.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onWallpaperChanged:
{
data.enforceInterface(DESCRIPTOR);
this.onWallpaperChanged();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IWallpaperServiceCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/**
     * Called when the wallpaper has changed
     */
public void onWallpaperChanged() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onWallpaperChanged, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onWallpaperChanged = (IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when the wallpaper has changed
     */
public void onWallpaperChanged() throws android.os.RemoteException;
}
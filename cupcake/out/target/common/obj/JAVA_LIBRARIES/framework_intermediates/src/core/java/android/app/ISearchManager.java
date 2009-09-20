/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/ISearchManager.aidl
 */
package android.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.content.ComponentName;
import android.server.search.SearchableInfo;
/** @hide */
public interface ISearchManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.ISearchManager
{
private static final java.lang.String DESCRIPTOR = "android.app.ISearchManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an ISearchManager interface,
 * generating a proxy if needed.
 */
public static android.app.ISearchManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.ISearchManager))) {
return ((android.app.ISearchManager)iin);
}
return new android.app.ISearchManager.Stub.Proxy(obj);
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
case TRANSACTION_getSearchableInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _arg1;
_arg1 = (0!=data.readInt());
android.server.search.SearchableInfo _result = this.getSearchableInfo(_arg0, _arg1);
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.ISearchManager
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
public android.server.search.SearchableInfo getSearchableInfo(android.content.ComponentName launchActivity, boolean globalSearch) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.server.search.SearchableInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((launchActivity!=null)) {
_data.writeInt(1);
launchActivity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((globalSearch)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_getSearchableInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.server.search.SearchableInfo.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getSearchableInfo = (IBinder.FIRST_CALL_TRANSACTION + 0);
}
public android.server.search.SearchableInfo getSearchableInfo(android.content.ComponentName launchActivity, boolean globalSearch) throws android.os.RemoteException;
}

/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IIntentReceiver.aidl
 */
package android.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.content.Intent;
import android.os.Bundle;
/**
 * System private API for dispatching intent broadcasts.  This is given to the
 * activity manager as part of registering for an intent broadcasts, and is
 * called when it receives intents.
 *
 * {@hide}
 */
public interface IIntentReceiver extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IIntentReceiver
{
private static final java.lang.String DESCRIPTOR = "android.app.IIntentReceiver";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IIntentReceiver interface,
 * generating a proxy if needed.
 */
public static android.app.IIntentReceiver asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IIntentReceiver))) {
return ((android.app.IIntentReceiver)iin);
}
return new android.app.IIntentReceiver.Stub.Proxy(obj);
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
case TRANSACTION_performReceive:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
android.os.Bundle _arg3;
if ((0!=data.readInt())) {
_arg3 = android.os.Bundle.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
boolean _arg4;
_arg4 = (0!=data.readInt());
this.performReceive(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IIntentReceiver
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
public void performReceive(android.content.Intent intent, int resultCode, java.lang.String data, android.os.Bundle extras, boolean ordered) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(resultCode);
_data.writeString(data);
if ((extras!=null)) {
_data.writeInt(1);
extras.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((ordered)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_performReceive, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_performReceive = (IBinder.FIRST_CALL_TRANSACTION + 0);
}
public void performReceive(android.content.Intent intent, int resultCode, java.lang.String data, android.os.Bundle extras, boolean ordered) throws android.os.RemoteException;
}

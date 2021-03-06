/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/app/IActivityWatcher.aidl
 */
package android.app;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.content.Intent;
/**
 * Testing interface to monitor what is happening in the activity manager
 * while tests are running.  Not for normal application development.
 * {@hide}
 */
public interface IActivityWatcher extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.app.IActivityWatcher
{
private static final java.lang.String DESCRIPTOR = "android.app.IActivityWatcher";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IActivityWatcher interface,
 * generating a proxy if needed.
 */
public static android.app.IActivityWatcher asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.app.IActivityWatcher))) {
return ((android.app.IActivityWatcher)iin);
}
return new android.app.IActivityWatcher.Stub.Proxy(obj);
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
case TRANSACTION_activityStarting:
{
data.enforceInterface(DESCRIPTOR);
android.content.Intent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
java.lang.String _arg1;
_arg1 = data.readString();
boolean _result = this.activityStarting(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_activityResuming:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.activityResuming(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_appCrashed:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
java.lang.String _arg3;
_arg3 = data.readString();
byte[] _arg4;
_arg4 = data.createByteArray();
boolean _result = this.appCrashed(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_appNotResponding:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.appNotResponding(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.app.IActivityWatcher
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
     * The system is trying to start an activity.  Return true to allow
     * it to be started as normal, or false to cancel/reject this activity.
     */
public boolean activityStarting(android.content.Intent intent, java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_activityStarting, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * The system is trying to return to an activity.  Return true to allow
     * it to be resumed as normal, or false to cancel/reject this activity.
     */
public boolean activityResuming(java.lang.String pkg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg);
mRemote.transact(Stub.TRANSACTION_activityResuming, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * An application process has crashed (in Java).  Return true for the
     * normal error recovery (app crash dialog) to occur, false to kill
     * it immediately.
     */
public boolean appCrashed(java.lang.String processName, int pid, java.lang.String shortMsg, java.lang.String longMsg, byte[] crashData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(processName);
_data.writeInt(pid);
_data.writeString(shortMsg);
_data.writeString(longMsg);
_data.writeByteArray(crashData);
mRemote.transact(Stub.TRANSACTION_appCrashed, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * An application process is not responding.  Return 0 to show the "app
     * not responding" dialog, 1 to continue waiting, or -1 to kill it
     * immediately.
     */
public int appNotResponding(java.lang.String processName, int pid, java.lang.String processStats) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(processName);
_data.writeInt(pid);
_data.writeString(processStats);
mRemote.transact(Stub.TRANSACTION_appNotResponding, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_activityStarting = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_activityResuming = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_appCrashed = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_appNotResponding = (IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * The system is trying to start an activity.  Return true to allow
     * it to be started as normal, or false to cancel/reject this activity.
     */
public boolean activityStarting(android.content.Intent intent, java.lang.String pkg) throws android.os.RemoteException;
/**
     * The system is trying to return to an activity.  Return true to allow
     * it to be resumed as normal, or false to cancel/reject this activity.
     */
public boolean activityResuming(java.lang.String pkg) throws android.os.RemoteException;
/**
     * An application process has crashed (in Java).  Return true for the
     * normal error recovery (app crash dialog) to occur, false to kill
     * it immediately.
     */
public boolean appCrashed(java.lang.String processName, int pid, java.lang.String shortMsg, java.lang.String longMsg, byte[] crashData) throws android.os.RemoteException;
/**
     * An application process is not responding.  Return 0 to show the "app
     * not responding" dialog, 1 to continue waiting, or -1 to kill it
     * immediately.
     */
public int appNotResponding(java.lang.String processName, int pid, java.lang.String processStats) throws android.os.RemoteException;
}

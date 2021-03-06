/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/IM/src/com/android/im/IConnectionCreationListener.aidl
 */
package com.android.im;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
public interface IConnectionCreationListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.im.IConnectionCreationListener
{
private static final java.lang.String DESCRIPTOR = "com.android.im.IConnectionCreationListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IConnectionCreationListener interface,
 * generating a proxy if needed.
 */
public static com.android.im.IConnectionCreationListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.im.IConnectionCreationListener))) {
return ((com.android.im.IConnectionCreationListener)iin);
}
return new com.android.im.IConnectionCreationListener.Stub.Proxy(obj);
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
case TRANSACTION_onConnectionCreated:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IImConnection _arg0;
_arg0 = com.android.im.IImConnection.Stub.asInterface(data.readStrongBinder());
this.onConnectionCreated(_arg0);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.im.IConnectionCreationListener
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
     * Called when a connection is created in the service.
     */
public void onConnectionCreated(com.android.im.IImConnection connection) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((connection!=null))?(connection.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onConnectionCreated, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onConnectionCreated = (IBinder.FIRST_CALL_TRANSACTION + 0);
}
/**
     * Called when a connection is created in the service.
     */
public void onConnectionCreated(com.android.im.IImConnection connection) throws android.os.RemoteException;
}

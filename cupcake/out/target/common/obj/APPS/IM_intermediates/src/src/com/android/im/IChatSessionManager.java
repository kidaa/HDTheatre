/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/IM/src/com/android/im/IChatSessionManager.aidl
 */
package com.android.im;
import java.lang.String;
import java.util.List;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
public interface IChatSessionManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.im.IChatSessionManager
{
private static final java.lang.String DESCRIPTOR = "com.android.im.IChatSessionManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IChatSessionManager interface,
 * generating a proxy if needed.
 */
public static com.android.im.IChatSessionManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.im.IChatSessionManager))) {
return ((com.android.im.IChatSessionManager)iin);
}
return new com.android.im.IChatSessionManager.Stub.Proxy(obj);
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
case TRANSACTION_registerChatSessionListener:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSessionListener _arg0;
_arg0 = com.android.im.IChatSessionListener.Stub.asInterface(data.readStrongBinder());
this.registerChatSessionListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterChatSessionListener:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSessionListener _arg0;
_arg0 = com.android.im.IChatSessionListener.Stub.asInterface(data.readStrongBinder());
this.unregisterChatSessionListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_createChatSession:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.im.IChatSession _result = this.createChatSession(_arg0);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getChatSession:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
com.android.im.IChatSession _result = this.getChatSession(_arg0);
reply.writeNoException();
reply.writeStrongBinder((((_result!=null))?(_result.asBinder()):(null)));
return true;
}
case TRANSACTION_getActiveChatSessions:
{
data.enforceInterface(DESCRIPTOR);
java.util.List _result = this.getActiveChatSessions();
reply.writeNoException();
reply.writeList(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.im.IChatSessionManager
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
public void registerChatSessionListener(com.android.im.IChatSessionListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerChatSessionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void unregisterChatSessionListener(com.android.im.IChatSessionListener listener) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterChatSessionListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Create a ChatSession with the specified contact. If the contact does not exist in any
     * of the user's contact lists, it will be added to the temporary list.
     *
     * @param contactAddress the address of the contact.
     */
public com.android.im.IChatSession createChatSession(java.lang.String contactAddress) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.im.IChatSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(contactAddress);
mRemote.transact(Stub.TRANSACTION_createChatSession, _data, _reply, 0);
_reply.readException();
_result = com.android.im.IChatSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get the ChatSession that is associated with the specified contact or group.
     *
     * @param the address of the contact or group.
     * @return the ChatSession with the contact or group or <code>null</code> if
     *       there isn't any active ChatSession with the contact or group.
     */
public com.android.im.IChatSession getChatSession(java.lang.String address) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.android.im.IChatSession _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(address);
mRemote.transact(Stub.TRANSACTION_getChatSession, _data, _reply, 0);
_reply.readException();
_result = com.android.im.IChatSession.Stub.asInterface(_reply.readStrongBinder());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Get a list of all active ChatSessions.
     *
     * @return a list of IBinders of all active ChatSessions.
     */
public java.util.List getActiveChatSessions() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getActiveChatSessions, _data, _reply, 0);
_reply.readException();
java.lang.ClassLoader cl = (java.lang.ClassLoader)this.getClass().getClassLoader();
_result = _reply.readArrayList(cl);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_registerChatSessionListener = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_unregisterChatSessionListener = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_createChatSession = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getChatSession = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_getActiveChatSessions = (IBinder.FIRST_CALL_TRANSACTION + 4);
}
public void registerChatSessionListener(com.android.im.IChatSessionListener listener) throws android.os.RemoteException;
public void unregisterChatSessionListener(com.android.im.IChatSessionListener listener) throws android.os.RemoteException;
/**
     * Create a ChatSession with the specified contact. If the contact does not exist in any
     * of the user's contact lists, it will be added to the temporary list.
     *
     * @param contactAddress the address of the contact.
     */
public com.android.im.IChatSession createChatSession(java.lang.String contactAddress) throws android.os.RemoteException;
/**
     * Get the ChatSession that is associated with the specified contact or group.
     *
     * @param the address of the contact or group.
     * @return the ChatSession with the contact or group or <code>null</code> if
     *       there isn't any active ChatSession with the contact or group.
     */
public com.android.im.IChatSession getChatSession(java.lang.String address) throws android.os.RemoteException;
/**
     * Get a list of all active ChatSessions.
     *
     * @return a list of IBinders of all active ChatSessions.
     */
public java.util.List getActiveChatSessions() throws android.os.RemoteException;
}

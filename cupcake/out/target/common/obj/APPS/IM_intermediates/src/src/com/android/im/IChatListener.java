/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/IM/src/com/android/im/IChatListener.aidl
 */
package com.android.im;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import com.android.im.engine.Contact;
import com.android.im.engine.ImErrorInfo;
import com.android.im.engine.Message;
public interface IChatListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.im.IChatListener
{
private static final java.lang.String DESCRIPTOR = "com.android.im.IChatListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IChatListener interface,
 * generating a proxy if needed.
 */
public static com.android.im.IChatListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.im.IChatListener))) {
return ((com.android.im.IChatListener)iin);
}
return new com.android.im.IChatListener.Stub.Proxy(obj);
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
case TRANSACTION_onIncomingMessage:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSession _arg0;
_arg0 = com.android.im.IChatSession.Stub.asInterface(data.readStrongBinder());
com.android.im.engine.Message _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.im.engine.Message.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onIncomingMessage(_arg0, _arg1);
return true;
}
case TRANSACTION_onSendMessageError:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSession _arg0;
_arg0 = com.android.im.IChatSession.Stub.asInterface(data.readStrongBinder());
com.android.im.engine.Message _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.im.engine.Message.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
com.android.im.engine.ImErrorInfo _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.im.engine.ImErrorInfo.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onSendMessageError(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onConvertedToGroupChat:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSession _arg0;
_arg0 = com.android.im.IChatSession.Stub.asInterface(data.readStrongBinder());
this.onConvertedToGroupChat(_arg0);
return true;
}
case TRANSACTION_onContactJoined:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSession _arg0;
_arg0 = com.android.im.IChatSession.Stub.asInterface(data.readStrongBinder());
com.android.im.engine.Contact _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onContactJoined(_arg0, _arg1);
return true;
}
case TRANSACTION_onContactLeft:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSession _arg0;
_arg0 = com.android.im.IChatSession.Stub.asInterface(data.readStrongBinder());
com.android.im.engine.Contact _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onContactLeft(_arg0, _arg1);
return true;
}
case TRANSACTION_onInviteError:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.IChatSession _arg0;
_arg0 = com.android.im.IChatSession.Stub.asInterface(data.readStrongBinder());
com.android.im.engine.ImErrorInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.im.engine.ImErrorInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.onInviteError(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.im.IChatListener
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
     * This method is called when a new message of the ChatSession has arrived.
     */
public void onIncomingMessage(com.android.im.IChatSession ses, com.android.im.engine.Message msg) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onIncomingMessage, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This method is called when an error is found to send a message in the ChatSession.
     */
public void onSendMessageError(com.android.im.IChatSession ses, com.android.im.engine.Message msg, com.android.im.engine.ImErrorInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((msg!=null)) {
_data.writeInt(1);
msg.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onSendMessageError, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This method is called when the chat is converted to a group chat.
     */
public void onConvertedToGroupChat(com.android.im.IChatSession ses) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_onConvertedToGroupChat, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This method is called when a new contact has joined into this ChatSession.
     */
public void onContactJoined(com.android.im.IChatSession ses, com.android.im.engine.Contact contact) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((contact!=null)) {
_data.writeInt(1);
contact.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onContactJoined, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This method is called when a contact in this ChatSession has left.
     */
public void onContactLeft(com.android.im.IChatSession ses, com.android.im.engine.Contact contact) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((contact!=null)) {
_data.writeInt(1);
contact.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onContactLeft, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * This method is called when an error is found to invite a contact to join
     * this ChatSession.
     */
public void onInviteError(com.android.im.IChatSession ses, com.android.im.engine.ImErrorInfo error) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((ses!=null))?(ses.asBinder()):(null)));
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onInviteError, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onIncomingMessage = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onSendMessageError = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onConvertedToGroupChat = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onContactJoined = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_onContactLeft = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_onInviteError = (IBinder.FIRST_CALL_TRANSACTION + 5);
}
/**
     * This method is called when a new message of the ChatSession has arrived.
     */
public void onIncomingMessage(com.android.im.IChatSession ses, com.android.im.engine.Message msg) throws android.os.RemoteException;
/**
     * This method is called when an error is found to send a message in the ChatSession.
     */
public void onSendMessageError(com.android.im.IChatSession ses, com.android.im.engine.Message msg, com.android.im.engine.ImErrorInfo error) throws android.os.RemoteException;
/**
     * This method is called when the chat is converted to a group chat.
     */
public void onConvertedToGroupChat(com.android.im.IChatSession ses) throws android.os.RemoteException;
/**
     * This method is called when a new contact has joined into this ChatSession.
     */
public void onContactJoined(com.android.im.IChatSession ses, com.android.im.engine.Contact contact) throws android.os.RemoteException;
/**
     * This method is called when a contact in this ChatSession has left.
     */
public void onContactLeft(com.android.im.IChatSession ses, com.android.im.engine.Contact contact) throws android.os.RemoteException;
/**
     * This method is called when an error is found to invite a contact to join
     * this ChatSession.
     */
public void onInviteError(com.android.im.IChatSession ses, com.android.im.engine.ImErrorInfo error) throws android.os.RemoteException;
}

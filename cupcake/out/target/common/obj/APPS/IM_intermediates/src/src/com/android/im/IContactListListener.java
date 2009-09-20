/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: packages/apps/IM/src/com/android/im/IContactListListener.aidl
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
public interface IContactListListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.im.IContactListListener
{
private static final java.lang.String DESCRIPTOR = "com.android.im.IContactListListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IContactListListener interface,
 * generating a proxy if needed.
 */
public static com.android.im.IContactListListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.im.IContactListListener))) {
return ((com.android.im.IContactListListener)iin);
}
return new com.android.im.IContactListListener.Stub.Proxy(obj);
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
case TRANSACTION_onContactChange:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.im.IContactList _arg1;
_arg1 = com.android.im.IContactList.Stub.asInterface(data.readStrongBinder());
com.android.im.engine.Contact _arg2;
if ((0!=data.readInt())) {
_arg2 = com.android.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.onContactChange(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_onAllContactListsLoaded:
{
data.enforceInterface(DESCRIPTOR);
this.onAllContactListsLoaded();
return true;
}
case TRANSACTION_onContactsPresenceUpdate:
{
data.enforceInterface(DESCRIPTOR);
com.android.im.engine.Contact[] _arg0;
_arg0 = data.createTypedArray(com.android.im.engine.Contact.CREATOR);
this.onContactsPresenceUpdate(_arg0);
return true;
}
case TRANSACTION_onContactError:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
com.android.im.engine.ImErrorInfo _arg1;
if ((0!=data.readInt())) {
_arg1 = com.android.im.engine.ImErrorInfo.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
java.lang.String _arg2;
_arg2 = data.readString();
com.android.im.engine.Contact _arg3;
if ((0!=data.readInt())) {
_arg3 = com.android.im.engine.Contact.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.onContactError(_arg0, _arg1, _arg2, _arg3);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.im.IContactListListener
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
     * Called when:
     *  <ul>
     *  <li> a contact list has been created, deleted, renamed or loaded, or
     *  <li> a contact has been added to or removed from a list, or
     *  <li> a contact has been blocked or unblocked
     *  </ul>
     *
     * @see com.android.im.engine.ContactListListener#onContactChange(int, ContactList, Contact)
     */
public void onContactChange(int type, com.android.im.IContactList list, com.android.im.engine.Contact contact) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(type);
_data.writeStrongBinder((((list!=null))?(list.asBinder()):(null)));
if ((contact!=null)) {
_data.writeInt(1);
contact.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onContactChange, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when all the contact lists have been loaded from server.
     *
     * @see com.android.im.engine.ContactListListener#onAllContactListsLoaded()
     */
public void onAllContactListsLoaded() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_onAllContactListsLoaded, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when one or more contacts' presence information has updated.
     *
     * @see com.android.im.engine.ContactListListener#onContactsPresenceUpdate(Contact[])
     */
public void onContactsPresenceUpdate(com.android.im.engine.Contact[] contacts) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedArray(contacts, 0);
mRemote.transact(Stub.TRANSACTION_onContactsPresenceUpdate, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Called when a previous contact related request has failed.
     *
     * @see com.android.im.engine.ContactListListener#onContactError(int, ImErrorInfo, String, Contact)
     */
public void onContactError(int errorType, com.android.im.engine.ImErrorInfo error, java.lang.String listName, com.android.im.engine.Contact contact) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(errorType);
if ((error!=null)) {
_data.writeInt(1);
error.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(listName);
if ((contact!=null)) {
_data.writeInt(1);
contact.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_onContactError, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onContactChange = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_onAllContactListsLoaded = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_onContactsPresenceUpdate = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_onContactError = (IBinder.FIRST_CALL_TRANSACTION + 3);
}
/**
     * Called when:
     *  <ul>
     *  <li> a contact list has been created, deleted, renamed or loaded, or
     *  <li> a contact has been added to or removed from a list, or
     *  <li> a contact has been blocked or unblocked
     *  </ul>
     *
     * @see com.android.im.engine.ContactListListener#onContactChange(int, ContactList, Contact)
     */
public void onContactChange(int type, com.android.im.IContactList list, com.android.im.engine.Contact contact) throws android.os.RemoteException;
/**
     * Called when all the contact lists have been loaded from server.
     *
     * @see com.android.im.engine.ContactListListener#onAllContactListsLoaded()
     */
public void onAllContactListsLoaded() throws android.os.RemoteException;
/**
     * Called when one or more contacts' presence information has updated.
     *
     * @see com.android.im.engine.ContactListListener#onContactsPresenceUpdate(Contact[])
     */
public void onContactsPresenceUpdate(com.android.im.engine.Contact[] contacts) throws android.os.RemoteException;
/**
     * Called when a previous contact related request has failed.
     *
     * @see com.android.im.engine.ContactListListener#onContactError(int, ImErrorInfo, String, Contact)
     */
public void onContactError(int errorType, com.android.im.engine.ImErrorInfo error, java.lang.String listName, com.android.im.engine.Contact contact) throws android.os.RemoteException;
}

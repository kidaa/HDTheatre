/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/telephony/java/com/android/internal/telephony/gsm/ISms.aidl
 */
package com.android.internal.telephony.gsm;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.app.PendingIntent;
import java.util.List;
import java.util.List;
import java.util.List;
/** Interface for applications to access the SIM phone book.
 *
 * <p>The following code snippet demonstrates a static method to
 * retrieve the ISimSms interface from Android:</p>
 * <pre>private static ISimSms getSimSmsInterface()
            throws DeadObjectException {
    IServiceManager sm = ServiceManagerNative.getDefault();
    ISimSms ss;
    ss = ISimSms.Stub.asInterface(sm.getService("isms"));
    return ss;
}
 * </pre>
 */
public interface ISms extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.internal.telephony.gsm.ISms
{
private static final java.lang.String DESCRIPTOR = "com.android.internal.telephony.gsm.ISms";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an ISms interface,
 * generating a proxy if needed.
 */
public static com.android.internal.telephony.gsm.ISms asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.internal.telephony.gsm.ISms))) {
return ((com.android.internal.telephony.gsm.ISms)iin);
}
return new com.android.internal.telephony.gsm.ISms.Stub.Proxy(obj);
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
case TRANSACTION_getAllMessagesFromSimEf:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<com.android.internal.telephony.gsm.SmsRawData> _result = this.getAllMessagesFromSimEf();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_updateMessageOnSimEf:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
byte[] _arg2;
_arg2 = data.createByteArray();
boolean _result = this.updateMessageOnSimEf(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_copyMessageToSimEf:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
byte[] _arg1;
_arg1 = data.createByteArray();
byte[] _arg2;
_arg2 = data.createByteArray();
boolean _result = this.copyMessageToSimEf(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_sendRawPdu:
{
data.enforceInterface(DESCRIPTOR);
byte[] _arg0;
_arg0 = data.createByteArray();
byte[] _arg1;
_arg1 = data.createByteArray();
android.app.PendingIntent _arg2;
if ((0!=data.readInt())) {
_arg2 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.app.PendingIntent _arg3;
if ((0!=data.readInt())) {
_arg3 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.sendRawPdu(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_sendMultipartText:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
java.util.List<java.lang.String> _arg2;
_arg2 = data.createStringArrayList();
java.util.List<android.app.PendingIntent> _arg3;
_arg3 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
java.util.List<android.app.PendingIntent> _arg4;
_arg4 = data.createTypedArrayList(android.app.PendingIntent.CREATOR);
this.sendMultipartText(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.internal.telephony.gsm.ISms
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
     * Retrieves all messages currently stored on SIM.
     *
     * @return list of SmsRawData of all sms on SIM
     */
public java.util.List<com.android.internal.telephony.gsm.SmsRawData> getAllMessagesFromSimEf() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.android.internal.telephony.gsm.SmsRawData> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAllMessagesFromSimEf, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.android.internal.telephony.gsm.SmsRawData.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Update the specified message on the SIM.
     *
     * @param messageIndex record index of message to update
     * @param newStatus new message status (STATUS_ON_SIM_READ,
     *                  STATUS_ON_SIM_UNREAD, STATUS_ON_SIM_SENT,
     *                  STATUS_ON_SIM_UNSENT, STATUS_ON_SIM_FREE)
     * @param pdu the raw PDU to store
     * @return success or not
     *
     */
public boolean updateMessageOnSimEf(int messageIndex, int newStatus, byte[] pdu) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(messageIndex);
_data.writeInt(newStatus);
_data.writeByteArray(pdu);
mRemote.transact(Stub.TRANSACTION_updateMessageOnSimEf, _data, _reply, 0);
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
     * Copy a raw SMS PDU to the SIM.
     *
     * @param pdu the raw PDU to store
     * @param status message status (STATUS_ON_SIM_READ, STATUS_ON_SIM_UNREAD,
     *               STATUS_ON_SIM_SENT, STATUS_ON_SIM_UNSENT)
     * @return success or not
     *
     */
public boolean copyMessageToSimEf(int status, byte[] pdu, byte[] smsc) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(status);
_data.writeByteArray(pdu);
_data.writeByteArray(smsc);
mRemote.transact(Stub.TRANSACTION_copyMessageToSimEf, _data, _reply, 0);
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
     * Send a SMS
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  defatult SMSC
     * @param pdu the raw PDU to send
     * @param sentIntent if not NULL this <code>Intent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *  <code>RESULT_ERROR_RADIO_OFF</code>
     *  <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntent if not NULL this <code>Intent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
public void sendRawPdu(byte[] smsc, byte[] pdu, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeByteArray(smsc);
_data.writeByteArray(pdu);
if ((sentIntent!=null)) {
_data.writeInt(1);
sentIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((deliveryIntent!=null)) {
_data.writeInt(1);
deliveryIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_sendRawPdu, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Send a multi-part text based SMS.
     * 
     * @param destinationAddress the address to send the message to
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param parts an <code>ArrayList</code> of strings that, in order,
     *   comprise the original message
     * @param sentIntents if not null, an <code>ArrayList</code> of 
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK<code> for success,
     *   or one of these errors:
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *   <code>RESULT_ERROR_RADIO_OFF</code>
     *   <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of 
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     */
public void sendMultipartText(java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(destinationAddress);
_data.writeString(scAddress);
_data.writeStringList(parts);
_data.writeTypedList(sentIntents);
_data.writeTypedList(deliveryIntents);
mRemote.transact(Stub.TRANSACTION_sendMultipartText, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getAllMessagesFromSimEf = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_updateMessageOnSimEf = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_copyMessageToSimEf = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_sendRawPdu = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_sendMultipartText = (IBinder.FIRST_CALL_TRANSACTION + 4);
}
/**
     * Retrieves all messages currently stored on SIM.
     *
     * @return list of SmsRawData of all sms on SIM
     */
public java.util.List<com.android.internal.telephony.gsm.SmsRawData> getAllMessagesFromSimEf() throws android.os.RemoteException;
/**
     * Update the specified message on the SIM.
     *
     * @param messageIndex record index of message to update
     * @param newStatus new message status (STATUS_ON_SIM_READ,
     *                  STATUS_ON_SIM_UNREAD, STATUS_ON_SIM_SENT,
     *                  STATUS_ON_SIM_UNSENT, STATUS_ON_SIM_FREE)
     * @param pdu the raw PDU to store
     * @return success or not
     *
     */
public boolean updateMessageOnSimEf(int messageIndex, int newStatus, byte[] pdu) throws android.os.RemoteException;
/**
     * Copy a raw SMS PDU to the SIM.
     *
     * @param pdu the raw PDU to store
     * @param status message status (STATUS_ON_SIM_READ, STATUS_ON_SIM_UNREAD,
     *               STATUS_ON_SIM_SENT, STATUS_ON_SIM_UNSENT)
     * @return success or not
     *
     */
public boolean copyMessageToSimEf(int status, byte[] pdu, byte[] smsc) throws android.os.RemoteException;
/**
     * Send a SMS
     *
     * @param smsc the SMSC to send the message through, or NULL for the
     *  defatult SMSC
     * @param pdu the raw PDU to send
     * @param sentIntent if not NULL this <code>Intent</code> is
     *  broadcast when the message is sucessfully sent, or failed.
     *  The result code will be <code>Activity.RESULT_OK<code> for success,
     *  or one of these errors:
     *  <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *  <code>RESULT_ERROR_RADIO_OFF</code>
     *  <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntent if not NULL this <code>Intent</code> is
     *  broadcast when the message is delivered to the recipient.  The
     *  raw pdu of the status report is in the extended data ("pdu").
     */
public void sendRawPdu(byte[] smsc, byte[] pdu, android.app.PendingIntent sentIntent, android.app.PendingIntent deliveryIntent) throws android.os.RemoteException;
/**
     * Send a multi-part text based SMS.
     * 
     * @param destinationAddress the address to send the message to
     * @param scAddress is the service center address or null to use
     *   the current default SMSC
     * @param parts an <code>ArrayList</code> of strings that, in order,
     *   comprise the original message
     * @param sentIntents if not null, an <code>ArrayList</code> of 
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been sent.
     *   The result code will be <code>Activity.RESULT_OK<code> for success,
     *   or one of these errors:
     *   <code>RESULT_ERROR_GENERIC_FAILURE</code>
     *   <code>RESULT_ERROR_RADIO_OFF</code>
     *   <code>RESULT_ERROR_NULL_PDU</code>.
     * @param deliveryIntents if not null, an <code>ArrayList</code> of 
     *   <code>PendingIntent</code>s (one for each message part) that is
     *   broadcast when the corresponding message part has been delivered
     *   to the recipient.  The raw pdu of the status report is in the
     *   extended data ("pdu").
     */
public void sendMultipartText(java.lang.String destinationAddress, java.lang.String scAddress, java.util.List<java.lang.String> parts, java.util.List<android.app.PendingIntent> sentIntents, java.util.List<android.app.PendingIntent> deliveryIntents) throws android.os.RemoteException;
}

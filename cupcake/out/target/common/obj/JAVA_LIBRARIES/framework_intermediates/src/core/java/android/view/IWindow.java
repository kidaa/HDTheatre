/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/view/IWindow.aidl
 */
package android.view;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.graphics.Rect;
import android.os.ParcelFileDescriptor;
/**
 * API back to a client window that the Window Manager uses to inform it of
 * interesting things happening.
 *
 * {@hide}
 */
public interface IWindow extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.view.IWindow
{
private static final java.lang.String DESCRIPTOR = "android.view.IWindow";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IWindow interface,
 * generating a proxy if needed.
 */
public static android.view.IWindow asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.view.IWindow))) {
return ((android.view.IWindow)iin);
}
return new android.view.IWindow.Stub.Proxy(obj);
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
case TRANSACTION_executeCommand:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
android.os.ParcelFileDescriptor _arg2;
if ((0!=data.readInt())) {
_arg2 = android.os.ParcelFileDescriptor.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
this.executeCommand(_arg0, _arg1, _arg2);
return true;
}
case TRANSACTION_resized:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
android.graphics.Rect _arg2;
if ((0!=data.readInt())) {
_arg2 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg2 = null;
}
android.graphics.Rect _arg3;
if ((0!=data.readInt())) {
_arg3 = android.graphics.Rect.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
boolean _arg4;
_arg4 = (0!=data.readInt());
this.resized(_arg0, _arg1, _arg2, _arg3, _arg4);
return true;
}
case TRANSACTION_dispatchKey:
{
data.enforceInterface(DESCRIPTOR);
android.view.KeyEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.KeyEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.dispatchKey(_arg0);
return true;
}
case TRANSACTION_dispatchPointer:
{
data.enforceInterface(DESCRIPTOR);
android.view.MotionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
this.dispatchPointer(_arg0, _arg1);
return true;
}
case TRANSACTION_dispatchTrackball:
{
data.enforceInterface(DESCRIPTOR);
android.view.MotionEvent _arg0;
if ((0!=data.readInt())) {
_arg0 = android.view.MotionEvent.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
long _arg1;
_arg1 = data.readLong();
this.dispatchTrackball(_arg0, _arg1);
return true;
}
case TRANSACTION_dispatchAppVisibility:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
this.dispatchAppVisibility(_arg0);
return true;
}
case TRANSACTION_dispatchGetNewSurface:
{
data.enforceInterface(DESCRIPTOR);
this.dispatchGetNewSurface();
return true;
}
case TRANSACTION_windowFocusChanged:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _arg1;
_arg1 = (0!=data.readInt());
this.windowFocusChanged(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.view.IWindow
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
     * ===== NOTICE =====
     * The first method must remain the first method. Scripts
     * and tools rely on their transaction number to work properly.
     *//**
     * Invoked by the view server to tell a window to execute the specified
     * command. Any response from the receiver must be sent through the
     * specified file descriptor.
     */
public void executeCommand(java.lang.String command, java.lang.String parameters, android.os.ParcelFileDescriptor descriptor) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(command);
_data.writeString(parameters);
if ((descriptor!=null)) {
_data.writeInt(1);
descriptor.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_executeCommand, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void resized(int w, int h, android.graphics.Rect coveredInsets, android.graphics.Rect visibleInsets, boolean reportDraw) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(w);
_data.writeInt(h);
if ((coveredInsets!=null)) {
_data.writeInt(1);
coveredInsets.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
if ((visibleInsets!=null)) {
_data.writeInt(1);
visibleInsets.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(((reportDraw)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_resized, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void dispatchKey(android.view.KeyEvent event) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_dispatchKey, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void dispatchPointer(android.view.MotionEvent event, long eventTime) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(eventTime);
mRemote.transact(Stub.TRANSACTION_dispatchPointer, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void dispatchTrackball(android.view.MotionEvent event, long eventTime) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((event!=null)) {
_data.writeInt(1);
event.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeLong(eventTime);
mRemote.transact(Stub.TRANSACTION_dispatchTrackball, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void dispatchAppVisibility(boolean visible) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((visible)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_dispatchAppVisibility, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
public void dispatchGetNewSurface() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_dispatchGetNewSurface, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
/**
     * Tell the window that it is either gaining or losing focus.  Keep it up
     * to date on the current state showing navigational focus (touch mode) too.
     */
public void windowFocusChanged(boolean hasFocus, boolean inTouchMode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((hasFocus)?(1):(0)));
_data.writeInt(((inTouchMode)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_windowFocusChanged, _data, null, IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_executeCommand = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_resized = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_dispatchKey = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_dispatchPointer = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_dispatchTrackball = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_dispatchAppVisibility = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_dispatchGetNewSurface = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_windowFocusChanged = (IBinder.FIRST_CALL_TRANSACTION + 7);
}
/**
     * ===== NOTICE =====
     * The first method must remain the first method. Scripts
     * and tools rely on their transaction number to work properly.
     *//**
     * Invoked by the view server to tell a window to execute the specified
     * command. Any response from the receiver must be sent through the
     * specified file descriptor.
     */
public void executeCommand(java.lang.String command, java.lang.String parameters, android.os.ParcelFileDescriptor descriptor) throws android.os.RemoteException;
public void resized(int w, int h, android.graphics.Rect coveredInsets, android.graphics.Rect visibleInsets, boolean reportDraw) throws android.os.RemoteException;
public void dispatchKey(android.view.KeyEvent event) throws android.os.RemoteException;
public void dispatchPointer(android.view.MotionEvent event, long eventTime) throws android.os.RemoteException;
public void dispatchTrackball(android.view.MotionEvent event, long eventTime) throws android.os.RemoteException;
public void dispatchAppVisibility(boolean visible) throws android.os.RemoteException;
public void dispatchGetNewSurface() throws android.os.RemoteException;
/**
     * Tell the window that it is either gaining or losing focus.  Keep it up
     * to date on the current state showing navigational focus (touch mode) too.
     */
public void windowFocusChanged(boolean hasFocus, boolean inTouchMode) throws android.os.RemoteException;
}
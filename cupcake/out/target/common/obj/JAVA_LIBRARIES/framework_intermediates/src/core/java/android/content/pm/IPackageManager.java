/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: frameworks/base/core/java/android/content/pm/IPackageManager.aidl
 */
package android.content.pm;
import java.lang.String;
import android.os.RemoteException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Binder;
import android.os.Parcel;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.app.PendingIntent;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
import java.util.List;
/**
 *  See {@link PackageManager} for documentation on most of the APIs
 *  here.
 * 
 *  {@hide}
 */
public interface IPackageManager extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements android.content.pm.IPackageManager
{
private static final java.lang.String DESCRIPTOR = "android.content.pm.IPackageManager";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an IPackageManager interface,
 * generating a proxy if needed.
 */
public static android.content.pm.IPackageManager asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof android.content.pm.IPackageManager))) {
return ((android.content.pm.IPackageManager)iin);
}
return new android.content.pm.IPackageManager.Stub.Proxy(obj);
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
case TRANSACTION_getPackageInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.PackageInfo _result = this.getPackageInfo(_arg0, _arg1);
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
case TRANSACTION_getPackageUid:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getPackageUid(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPackageGids:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int[] _result = this.getPackageGids(_arg0);
reply.writeNoException();
reply.writeIntArray(_result);
return true;
}
case TRANSACTION_getPermissionInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.PermissionInfo _result = this.getPermissionInfo(_arg0, _arg1);
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
case TRANSACTION_queryPermissionsByGroup:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.content.pm.PermissionInfo> _result = this.queryPermissionsByGroup(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPermissionGroupInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.PermissionGroupInfo _result = this.getPermissionGroupInfo(_arg0, _arg1);
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
case TRANSACTION_getAllPermissionGroups:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.pm.PermissionGroupInfo> _result = this.getAllPermissionGroups(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getApplicationInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.ApplicationInfo _result = this.getApplicationInfo(_arg0, _arg1);
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
case TRANSACTION_getActivityInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.content.pm.ActivityInfo _result = this.getActivityInfo(_arg0, _arg1);
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
case TRANSACTION_getReceiverInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.content.pm.ActivityInfo _result = this.getReceiverInfo(_arg0, _arg1);
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
case TRANSACTION_getServiceInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.content.pm.ServiceInfo _result = this.getServiceInfo(_arg0, _arg1);
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
case TRANSACTION_checkPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.checkPermission(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_checkUidPermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _result = this.checkUidPermission(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_addPermission:
{
data.enforceInterface(DESCRIPTOR);
android.content.pm.PermissionInfo _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.pm.PermissionInfo.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
boolean _result = this.addPermission(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_removePermission:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removePermission(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_checkSignatures:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
java.lang.String _arg1;
_arg1 = data.readString();
int _result = this.checkSignatures(_arg0, _arg1);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getPackagesForUid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String[] _result = this.getPackagesForUid(_arg0);
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getNameForUid:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.lang.String _result = this.getNameForUid(_arg0);
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getUidForSharedUser:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getUidForSharedUser(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_resolveIntent:
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
int _arg2;
_arg2 = data.readInt();
android.content.pm.ResolveInfo _result = this.resolveIntent(_arg0, _arg1, _arg2);
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
case TRANSACTION_queryIntentActivities:
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
int _arg2;
_arg2 = data.readInt();
java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentActivities(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_queryIntentActivityOptions:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.Intent[] _arg1;
_arg1 = data.createTypedArray(android.content.Intent.CREATOR);
java.lang.String[] _arg2;
_arg2 = data.createStringArray();
android.content.Intent _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.Intent.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
java.lang.String _arg4;
_arg4 = data.readString();
int _arg5;
_arg5 = data.readInt();
java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentActivityOptions(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_queryIntentReceivers:
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
int _arg2;
_arg2 = data.readInt();
java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentReceivers(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_resolveService:
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
int _arg2;
_arg2 = data.readInt();
android.content.pm.ResolveInfo _result = this.resolveService(_arg0, _arg1, _arg2);
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
case TRANSACTION_queryIntentServices:
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
int _arg2;
_arg2 = data.readInt();
java.util.List<android.content.pm.ResolveInfo> _result = this.queryIntentServices(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getInstalledPackages:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.pm.PackageInfo> _result = this.getInstalledPackages(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getInstalledApplications:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.pm.ApplicationInfo> _result = this.getInstalledApplications(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPersistentApplications:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.pm.ApplicationInfo> _result = this.getPersistentApplications(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_resolveContentProvider:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
android.content.pm.ProviderInfo _result = this.resolveContentProvider(_arg0, _arg1);
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
case TRANSACTION_querySyncProviders:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<java.lang.String> _arg0;
_arg0 = data.createStringArrayList();
java.util.List<android.content.pm.ProviderInfo> _arg1;
_arg1 = data.createTypedArrayList(android.content.pm.ProviderInfo.CREATOR);
this.querySyncProviders(_arg0, _arg1);
reply.writeNoException();
reply.writeStringList(_arg0);
reply.writeTypedList(_arg1);
return true;
}
case TRANSACTION_queryContentProviders:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
java.util.List<android.content.pm.ProviderInfo> _result = this.queryContentProviders(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getInstrumentationInfo:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.content.pm.InstrumentationInfo _result = this.getInstrumentationInfo(_arg0, _arg1);
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
case TRANSACTION_queryInstrumentation:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
java.util.List<android.content.pm.InstrumentationInfo> _result = this.queryInstrumentation(_arg0, _arg1);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_installPackage:
{
data.enforceInterface(DESCRIPTOR);
android.net.Uri _arg0;
if ((0!=data.readInt())) {
_arg0 = android.net.Uri.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
android.content.pm.IPackageInstallObserver _arg1;
_arg1 = android.content.pm.IPackageInstallObserver.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.installPackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_deletePackage:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.IPackageDeleteObserver _arg1;
_arg1 = android.content.pm.IPackageDeleteObserver.Stub.asInterface(data.readStrongBinder());
int _arg2;
_arg2 = data.readInt();
this.deletePackage(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_addPackageToPreferred:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.addPackageToPreferred(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_removePackageFromPreferred:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.removePackageFromPreferred(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPreferredPackages:
{
data.enforceInterface(DESCRIPTOR);
int _arg0;
_arg0 = data.readInt();
java.util.List<android.content.pm.PackageInfo> _result = this.getPreferredPackages(_arg0);
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_addPreferredActivity:
{
data.enforceInterface(DESCRIPTOR);
android.content.IntentFilter _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.IntentFilter.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
android.content.ComponentName[] _arg2;
_arg2 = data.createTypedArray(android.content.ComponentName.CREATOR);
android.content.ComponentName _arg3;
if ((0!=data.readInt())) {
_arg3 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg3 = null;
}
this.addPreferredActivity(_arg0, _arg1, _arg2, _arg3);
reply.writeNoException();
return true;
}
case TRANSACTION_clearPackagePreferredActivities:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.clearPackagePreferredActivities(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPreferredActivities:
{
data.enforceInterface(DESCRIPTOR);
java.util.List<android.content.IntentFilter> _arg0;
_arg0 = new java.util.ArrayList<android.content.IntentFilter>();
java.util.List<android.content.ComponentName> _arg1;
_arg1 = new java.util.ArrayList<android.content.ComponentName>();
java.lang.String _arg2;
_arg2 = data.readString();
int _result = this.getPreferredActivities(_arg0, _arg1, _arg2);
reply.writeNoException();
reply.writeInt(_result);
reply.writeTypedList(_arg0);
reply.writeTypedList(_arg1);
return true;
}
case TRANSACTION_setComponentEnabledSetting:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setComponentEnabledSetting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getComponentEnabledSetting:
{
data.enforceInterface(DESCRIPTOR);
android.content.ComponentName _arg0;
if ((0!=data.readInt())) {
_arg0 = android.content.ComponentName.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.getComponentEnabledSetting(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setApplicationEnabledSetting:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
this.setApplicationEnabledSetting(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_getApplicationEnabledSetting:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.getApplicationEnabledSetting(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_freeStorageAndNotify:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.content.pm.IPackageDataObserver _arg1;
_arg1 = android.content.pm.IPackageDataObserver.Stub.asInterface(data.readStrongBinder());
this.freeStorageAndNotify(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_freeStorage:
{
data.enforceInterface(DESCRIPTOR);
long _arg0;
_arg0 = data.readLong();
android.app.PendingIntent _arg1;
if ((0!=data.readInt())) {
_arg1 = android.app.PendingIntent.CREATOR.createFromParcel(data);
}
else {
_arg1 = null;
}
this.freeStorage(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_deleteApplicationCacheFiles:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.IPackageDataObserver _arg1;
_arg1 = android.content.pm.IPackageDataObserver.Stub.asInterface(data.readStrongBinder());
this.deleteApplicationCacheFiles(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_clearApplicationUserData:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.IPackageDataObserver _arg1;
_arg1 = android.content.pm.IPackageDataObserver.Stub.asInterface(data.readStrongBinder());
this.clearApplicationUserData(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getPackageSizeInfo:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
android.content.pm.IPackageStatsObserver _arg1;
_arg1 = android.content.pm.IPackageStatsObserver.Stub.asInterface(data.readStrongBinder());
this.getPackageSizeInfo(_arg0, _arg1);
reply.writeNoException();
return true;
}
case TRANSACTION_getSystemSharedLibraryNames:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getSystemSharedLibraryNames();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_enterSafeMode:
{
data.enforceInterface(DESCRIPTOR);
this.enterSafeMode();
reply.writeNoException();
return true;
}
case TRANSACTION_isSafeMode:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isSafeMode();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_systemReady:
{
data.enforceInterface(DESCRIPTOR);
this.systemReady();
reply.writeNoException();
return true;
}
case TRANSACTION_hasSystemUidErrors:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.hasSystemUidErrors();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements android.content.pm.IPackageManager
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
public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PackageInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getPackageInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PackageInfo.CREATOR.createFromParcel(_reply);
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
public int getPackageUid(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getPackageUid, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int[] getPackageGids(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getPackageGids, _data, _reply, 0);
_reply.readException();
_result = _reply.createIntArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PermissionInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getPermissionInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PermissionInfo.CREATOR.createFromParcel(_reply);
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
public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.PermissionInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(group);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryPermissionsByGroup, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.PermissionInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.PermissionGroupInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getPermissionGroupInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.PermissionGroupInfo.CREATOR.createFromParcel(_reply);
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
public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.PermissionGroupInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getAllPermissionGroups, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.PermissionGroupInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ApplicationInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getApplicationInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ApplicationInfo.CREATOR.createFromParcel(_reply);
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
public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ActivityInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((className!=null)) {
_data.writeInt(1);
className.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getActivityInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
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
public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ActivityInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((className!=null)) {
_data.writeInt(1);
className.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getReceiverInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ActivityInfo.CREATOR.createFromParcel(_reply);
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
public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ServiceInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((className!=null)) {
_data.writeInt(1);
className.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getServiceInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ServiceInfo.CREATOR.createFromParcel(_reply);
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
public int checkPermission(java.lang.String permName, java.lang.String pkgName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(permName);
_data.writeString(pkgName);
mRemote.transact(Stub.TRANSACTION_checkPermission, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int checkUidPermission(java.lang.String permName, int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(permName);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_checkUidPermission, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public boolean addPermission(android.content.pm.PermissionInfo info) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((info!=null)) {
_data.writeInt(1);
info.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addPermission, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void removePermission(java.lang.String name) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
mRemote.transact(Stub.TRANSACTION_removePermission, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(pkg1);
_data.writeString(pkg2);
mRemote.transact(Stub.TRANSACTION_checkSignatures, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String[] getPackagesForUid(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getPackagesForUid, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.lang.String getNameForUid(int uid) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(uid);
mRemote.transact(Stub.TRANSACTION_getNameForUid, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int getUidForSharedUser(java.lang.String sharedUserName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(sharedUserName);
mRemote.transact(Stub.TRANSACTION_getUidForSharedUser, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ResolveInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resolveIntent, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ResolveInfo.CREATOR.createFromParcel(_reply);
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
public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ResolveInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryIntentActivities, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName caller, android.content.Intent[] specifics, java.lang.String[] specificTypes, android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ResolveInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((caller!=null)) {
_data.writeInt(1);
caller.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeTypedArray(specifics, 0);
_data.writeStringArray(specificTypes);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryIntentActivityOptions, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.content.pm.ResolveInfo> queryIntentReceivers(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ResolveInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryIntentReceivers, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.ResolveInfo resolveService(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ResolveInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resolveService, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ResolveInfo.CREATOR.createFromParcel(_reply);
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
public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ResolveInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((intent!=null)) {
_data.writeInt(1);
intent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeString(resolvedType);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryIntentServices, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ResolveInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.PackageInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getInstalledPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.PackageInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ApplicationInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getInstalledApplications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ApplicationInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Retrieve all applications that are marked as persistent.
     * 
     * @return A List&lt;applicationInfo> containing one entry for each persistent
     *         application.
     */
public java.util.List<android.content.pm.ApplicationInfo> getPersistentApplications(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ApplicationInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getPersistentApplications, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ApplicationInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.ProviderInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(name);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_resolveContentProvider, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.ProviderInfo.CREATOR.createFromParcel(_reply);
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
/**
     * Retrieve sync information for all content providers.
     * 
     * @param outNames Filled in with a list of the root names of the content
     *                 providers that can sync.
     * @param outInfo Filled in with a list of the ProviderInfo for each
     *                name in 'outNames'.
     */
public void querySyncProviders(java.util.List<java.lang.String> outNames, java.util.List<android.content.pm.ProviderInfo> outInfo) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStringList(outNames);
_data.writeTypedList(outInfo);
mRemote.transact(Stub.TRANSACTION_querySyncProviders, _data, _reply, 0);
_reply.readException();
_reply.readStringList(outNames);
_reply.readTypedList(outInfo, android.content.pm.ProviderInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
}
public java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String processName, int uid, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.ProviderInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(processName);
_data.writeInt(uid);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryContentProviders, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.ProviderInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
android.content.pm.InstrumentationInfo _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((className!=null)) {
_data.writeInt(1);
className.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getInstrumentationInfo, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = android.content.pm.InstrumentationInfo.CREATOR.createFromParcel(_reply);
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
public java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String targetPackage, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.InstrumentationInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(targetPackage);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_queryInstrumentation, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.InstrumentationInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Install a package.
     *
     * @param packageURI The location of the package file to install.
     * @param observer a callback to use to notify when the package installation in finished.
     * @param flags - possible values: {@link #FORWARD_LOCK_PACKAGE},
     * {@link #REPLACE_EXISITING_PACKAGE}
     */
public void installPackage(android.net.Uri packageURI, android.content.pm.IPackageInstallObserver observer, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((packageURI!=null)) {
_data.writeInt(1);
packageURI.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_installPackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Delete a package.
     *
     * @param packageName The fully qualified name of the package to delete.
     * @param observer a callback to use to notify when the package deletion in finished.
     * @param flags - possible values: {@link #DONT_DELETE_DATA}
     */
public void deletePackage(java.lang.String packageName, android.content.pm.IPackageDeleteObserver observer, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_deletePackage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void addPackageToPreferred(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_addPackageToPreferred, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void removePackageFromPreferred(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_removePackageFromPreferred, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<android.content.pm.PackageInfo> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_getPreferredPackages, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(android.content.pm.PackageInfo.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void addPreferredActivity(android.content.IntentFilter filter, int match, android.content.ComponentName[] set, android.content.ComponentName activity) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((filter!=null)) {
_data.writeInt(1);
filter.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(match);
_data.writeTypedArray(set, 0);
if ((activity!=null)) {
_data.writeInt(1);
activity.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_addPreferredActivity, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public void clearPackagePreferredActivities(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_clearPackagePreferredActivities, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public int getPreferredActivities(java.util.List<android.content.IntentFilter> outFilters, java.util.List<android.content.ComponentName> outActivities, java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getPreferredActivities, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
_reply.readTypedList(outFilters, android.content.IntentFilter.CREATOR);
_reply.readTypedList(outActivities, android.content.ComponentName.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * As per {@link android.content.pm.PackageManager#setComponentEnabledSetting}.
     */
public void setComponentEnabledSetting(android.content.ComponentName componentName, int newState, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((componentName!=null)) {
_data.writeInt(1);
componentName.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(newState);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setComponentEnabledSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * As per {@link android.content.pm.PackageManager#getComponentEnabledSetting}.
     */
public int getComponentEnabledSetting(android.content.ComponentName componentName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((componentName!=null)) {
_data.writeInt(1);
componentName.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_getComponentEnabledSetting, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * As per {@link android.content.pm.PackageManager#setApplicationEnabledSetting}.
     */
public void setApplicationEnabledSetting(java.lang.String packageName, int newState, int flags) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeInt(newState);
_data.writeInt(flags);
mRemote.transact(Stub.TRANSACTION_setApplicationEnabledSetting, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * As per {@link android.content.pm.PackageManager#getApplicationEnabledSetting}.
     */
public int getApplicationEnabledSetting(java.lang.String packageName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
mRemote.transact(Stub.TRANSACTION_getApplicationEnabledSetting, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
/**
     * Free storage by deleting LRU sorted list of cache files across
     * all applications. If the currently available free storage
     * on the device is greater than or equal to the requested
     * free storage, no cache files are cleared. If the currently
     * available storage on the device is less than the requested
     * free storage, some or all of the cache files across
     * all applications are deleted (based on last accessed time)
     * to increase the free storage space on the device to
     * the requested value. There is no guarantee that clearing all
     * the cache files from all applications will clear up
     * enough storage to achieve the desired value.
     * @param freeStorageSize The number of bytes of storage to be
     * freed by the system. Say if freeStorageSize is XX,
     * and the current free storage is YY,
     * if XX is less than YY, just return. if not free XX-YY number
     * of bytes if possible.
     * @param observer call back used to notify when
     * the operation is completed
     */
public void freeStorageAndNotify(long freeStorageSize, android.content.pm.IPackageDataObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(freeStorageSize);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_freeStorageAndNotify, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Free storage by deleting LRU sorted list of cache files across
     * all applications. If the currently available free storage
     * on the device is greater than or equal to the requested
     * free storage, no cache files are cleared. If the currently
     * available storage on the device is less than the requested
     * free storage, some or all of the cache files across
     * all applications are deleted (based on last accessed time)
     * to increase the free storage space on the device to
     * the requested value. There is no guarantee that clearing all
     * the cache files from all applications will clear up
     * enough storage to achieve the desired value.
     * @param freeStorageSize The number of bytes of storage to be
     * freed by the system. Say if freeStorageSize is XX,
     * and the current free storage is YY,
     * if XX is less than YY, just return. if not free XX-YY number
     * of bytes if possible.
     * @param opFinishedIntent PendingIntent call back used to
     * notify when the operation is completed.May be null
     * to indicate that no call back is desired.
     */
public void freeStorage(long freeStorageSize, android.app.PendingIntent opFinishedIntent) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeLong(freeStorageSize);
if ((opFinishedIntent!=null)) {
_data.writeInt(1);
opFinishedIntent.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_freeStorage, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Delete all the cache files in an applications cache directory
     * @param packageName The package name of the application whose cache
     * files need to be deleted
     * @param observer a callback used to notify when the deletion is finished.
     */
public void deleteApplicationCacheFiles(java.lang.String packageName, android.content.pm.IPackageDataObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_deleteApplicationCacheFiles, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Clear the user data directory of an application.
     * @param packageName The package name of the application whose cache
     * files need to be deleted
     * @param observer a callback used to notify when the operation is completed.
     */
public void clearApplicationUserData(java.lang.String packageName, android.content.pm.IPackageDataObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_clearApplicationUserData, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get package statistics including the code, data and cache size for
     * an already installed package
     * @param packageName The package name of the application
     * @param observer a callback to use to notify when the asynchronous
     * retrieval of information is complete.
     */
public void getPackageSizeInfo(java.lang.String packageName, android.content.pm.IPackageStatsObserver observer) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(packageName);
_data.writeStrongBinder((((observer!=null))?(observer.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getPackageSizeInfo, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
/**
     * Get a list of shared libraries that are available on the
     * system.
     */
public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getSystemSharedLibraryNames, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void enterSafeMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_enterSafeMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean isSafeMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isSafeMode, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public void systemReady() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_systemReady, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
public boolean hasSystemUidErrors() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_hasSystemUidErrors, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_getPackageInfo = (IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getPackageUid = (IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getPackageGids = (IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_getPermissionInfo = (IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_queryPermissionsByGroup = (IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getPermissionGroupInfo = (IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_getAllPermissionGroups = (IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getApplicationInfo = (IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_getActivityInfo = (IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_getReceiverInfo = (IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_getServiceInfo = (IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_checkPermission = (IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_checkUidPermission = (IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_addPermission = (IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_removePermission = (IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_checkSignatures = (IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getPackagesForUid = (IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_getNameForUid = (IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_getUidForSharedUser = (IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_resolveIntent = (IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_queryIntentActivities = (IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_queryIntentActivityOptions = (IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_queryIntentReceivers = (IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_resolveService = (IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_queryIntentServices = (IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_getInstalledPackages = (IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_getInstalledApplications = (IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getPersistentApplications = (IBinder.FIRST_CALL_TRANSACTION + 27);
static final int TRANSACTION_resolveContentProvider = (IBinder.FIRST_CALL_TRANSACTION + 28);
static final int TRANSACTION_querySyncProviders = (IBinder.FIRST_CALL_TRANSACTION + 29);
static final int TRANSACTION_queryContentProviders = (IBinder.FIRST_CALL_TRANSACTION + 30);
static final int TRANSACTION_getInstrumentationInfo = (IBinder.FIRST_CALL_TRANSACTION + 31);
static final int TRANSACTION_queryInstrumentation = (IBinder.FIRST_CALL_TRANSACTION + 32);
static final int TRANSACTION_installPackage = (IBinder.FIRST_CALL_TRANSACTION + 33);
static final int TRANSACTION_deletePackage = (IBinder.FIRST_CALL_TRANSACTION + 34);
static final int TRANSACTION_addPackageToPreferred = (IBinder.FIRST_CALL_TRANSACTION + 35);
static final int TRANSACTION_removePackageFromPreferred = (IBinder.FIRST_CALL_TRANSACTION + 36);
static final int TRANSACTION_getPreferredPackages = (IBinder.FIRST_CALL_TRANSACTION + 37);
static final int TRANSACTION_addPreferredActivity = (IBinder.FIRST_CALL_TRANSACTION + 38);
static final int TRANSACTION_clearPackagePreferredActivities = (IBinder.FIRST_CALL_TRANSACTION + 39);
static final int TRANSACTION_getPreferredActivities = (IBinder.FIRST_CALL_TRANSACTION + 40);
static final int TRANSACTION_setComponentEnabledSetting = (IBinder.FIRST_CALL_TRANSACTION + 41);
static final int TRANSACTION_getComponentEnabledSetting = (IBinder.FIRST_CALL_TRANSACTION + 42);
static final int TRANSACTION_setApplicationEnabledSetting = (IBinder.FIRST_CALL_TRANSACTION + 43);
static final int TRANSACTION_getApplicationEnabledSetting = (IBinder.FIRST_CALL_TRANSACTION + 44);
static final int TRANSACTION_freeStorageAndNotify = (IBinder.FIRST_CALL_TRANSACTION + 45);
static final int TRANSACTION_freeStorage = (IBinder.FIRST_CALL_TRANSACTION + 46);
static final int TRANSACTION_deleteApplicationCacheFiles = (IBinder.FIRST_CALL_TRANSACTION + 47);
static final int TRANSACTION_clearApplicationUserData = (IBinder.FIRST_CALL_TRANSACTION + 48);
static final int TRANSACTION_getPackageSizeInfo = (IBinder.FIRST_CALL_TRANSACTION + 49);
static final int TRANSACTION_getSystemSharedLibraryNames = (IBinder.FIRST_CALL_TRANSACTION + 50);
static final int TRANSACTION_enterSafeMode = (IBinder.FIRST_CALL_TRANSACTION + 51);
static final int TRANSACTION_isSafeMode = (IBinder.FIRST_CALL_TRANSACTION + 52);
static final int TRANSACTION_systemReady = (IBinder.FIRST_CALL_TRANSACTION + 53);
static final int TRANSACTION_hasSystemUidErrors = (IBinder.FIRST_CALL_TRANSACTION + 54);
}
public android.content.pm.PackageInfo getPackageInfo(java.lang.String packageName, int flags) throws android.os.RemoteException;
public int getPackageUid(java.lang.String packageName) throws android.os.RemoteException;
public int[] getPackageGids(java.lang.String packageName) throws android.os.RemoteException;
public android.content.pm.PermissionInfo getPermissionInfo(java.lang.String name, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.PermissionInfo> queryPermissionsByGroup(java.lang.String group, int flags) throws android.os.RemoteException;
public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(java.lang.String name, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) throws android.os.RemoteException;
public android.content.pm.ApplicationInfo getApplicationInfo(java.lang.String packageName, int flags) throws android.os.RemoteException;
public android.content.pm.ActivityInfo getActivityInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
public android.content.pm.ActivityInfo getReceiverInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
public android.content.pm.ServiceInfo getServiceInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
public int checkPermission(java.lang.String permName, java.lang.String pkgName) throws android.os.RemoteException;
public int checkUidPermission(java.lang.String permName, int uid) throws android.os.RemoteException;
public boolean addPermission(android.content.pm.PermissionInfo info) throws android.os.RemoteException;
public void removePermission(java.lang.String name) throws android.os.RemoteException;
public int checkSignatures(java.lang.String pkg1, java.lang.String pkg2) throws android.os.RemoteException;
public java.lang.String[] getPackagesForUid(int uid) throws android.os.RemoteException;
public java.lang.String getNameForUid(int uid) throws android.os.RemoteException;
public int getUidForSharedUser(java.lang.String sharedUserName) throws android.os.RemoteException;
public android.content.pm.ResolveInfo resolveIntent(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ResolveInfo> queryIntentActivities(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ResolveInfo> queryIntentActivityOptions(android.content.ComponentName caller, android.content.Intent[] specifics, java.lang.String[] specificTypes, android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ResolveInfo> queryIntentReceivers(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public android.content.pm.ResolveInfo resolveService(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ResolveInfo> queryIntentServices(android.content.Intent intent, java.lang.String resolvedType, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.PackageInfo> getInstalledPackages(int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.ApplicationInfo> getInstalledApplications(int flags) throws android.os.RemoteException;
/**
     * Retrieve all applications that are marked as persistent.
     * 
     * @return A List&lt;applicationInfo> containing one entry for each persistent
     *         application.
     */
public java.util.List<android.content.pm.ApplicationInfo> getPersistentApplications(int flags) throws android.os.RemoteException;
public android.content.pm.ProviderInfo resolveContentProvider(java.lang.String name, int flags) throws android.os.RemoteException;
/**
     * Retrieve sync information for all content providers.
     * 
     * @param outNames Filled in with a list of the root names of the content
     *                 providers that can sync.
     * @param outInfo Filled in with a list of the ProviderInfo for each
     *                name in 'outNames'.
     */
public void querySyncProviders(java.util.List<java.lang.String> outNames, java.util.List<android.content.pm.ProviderInfo> outInfo) throws android.os.RemoteException;
public java.util.List<android.content.pm.ProviderInfo> queryContentProviders(java.lang.String processName, int uid, int flags) throws android.os.RemoteException;
public android.content.pm.InstrumentationInfo getInstrumentationInfo(android.content.ComponentName className, int flags) throws android.os.RemoteException;
public java.util.List<android.content.pm.InstrumentationInfo> queryInstrumentation(java.lang.String targetPackage, int flags) throws android.os.RemoteException;
/**
     * Install a package.
     *
     * @param packageURI The location of the package file to install.
     * @param observer a callback to use to notify when the package installation in finished.
     * @param flags - possible values: {@link #FORWARD_LOCK_PACKAGE},
     * {@link #REPLACE_EXISITING_PACKAGE}
     */
public void installPackage(android.net.Uri packageURI, android.content.pm.IPackageInstallObserver observer, int flags) throws android.os.RemoteException;
/**
     * Delete a package.
     *
     * @param packageName The fully qualified name of the package to delete.
     * @param observer a callback to use to notify when the package deletion in finished.
     * @param flags - possible values: {@link #DONT_DELETE_DATA}
     */
public void deletePackage(java.lang.String packageName, android.content.pm.IPackageDeleteObserver observer, int flags) throws android.os.RemoteException;
public void addPackageToPreferred(java.lang.String packageName) throws android.os.RemoteException;
public void removePackageFromPreferred(java.lang.String packageName) throws android.os.RemoteException;
public java.util.List<android.content.pm.PackageInfo> getPreferredPackages(int flags) throws android.os.RemoteException;
public void addPreferredActivity(android.content.IntentFilter filter, int match, android.content.ComponentName[] set, android.content.ComponentName activity) throws android.os.RemoteException;
public void clearPackagePreferredActivities(java.lang.String packageName) throws android.os.RemoteException;
public int getPreferredActivities(java.util.List<android.content.IntentFilter> outFilters, java.util.List<android.content.ComponentName> outActivities, java.lang.String packageName) throws android.os.RemoteException;
/**
     * As per {@link android.content.pm.PackageManager#setComponentEnabledSetting}.
     */
public void setComponentEnabledSetting(android.content.ComponentName componentName, int newState, int flags) throws android.os.RemoteException;
/**
     * As per {@link android.content.pm.PackageManager#getComponentEnabledSetting}.
     */
public int getComponentEnabledSetting(android.content.ComponentName componentName) throws android.os.RemoteException;
/**
     * As per {@link android.content.pm.PackageManager#setApplicationEnabledSetting}.
     */
public void setApplicationEnabledSetting(java.lang.String packageName, int newState, int flags) throws android.os.RemoteException;
/**
     * As per {@link android.content.pm.PackageManager#getApplicationEnabledSetting}.
     */
public int getApplicationEnabledSetting(java.lang.String packageName) throws android.os.RemoteException;
/**
     * Free storage by deleting LRU sorted list of cache files across
     * all applications. If the currently available free storage
     * on the device is greater than or equal to the requested
     * free storage, no cache files are cleared. If the currently
     * available storage on the device is less than the requested
     * free storage, some or all of the cache files across
     * all applications are deleted (based on last accessed time)
     * to increase the free storage space on the device to
     * the requested value. There is no guarantee that clearing all
     * the cache files from all applications will clear up
     * enough storage to achieve the desired value.
     * @param freeStorageSize The number of bytes of storage to be
     * freed by the system. Say if freeStorageSize is XX,
     * and the current free storage is YY,
     * if XX is less than YY, just return. if not free XX-YY number
     * of bytes if possible.
     * @param observer call back used to notify when
     * the operation is completed
     */
public void freeStorageAndNotify(long freeStorageSize, android.content.pm.IPackageDataObserver observer) throws android.os.RemoteException;
/**
     * Free storage by deleting LRU sorted list of cache files across
     * all applications. If the currently available free storage
     * on the device is greater than or equal to the requested
     * free storage, no cache files are cleared. If the currently
     * available storage on the device is less than the requested
     * free storage, some or all of the cache files across
     * all applications are deleted (based on last accessed time)
     * to increase the free storage space on the device to
     * the requested value. There is no guarantee that clearing all
     * the cache files from all applications will clear up
     * enough storage to achieve the desired value.
     * @param freeStorageSize The number of bytes of storage to be
     * freed by the system. Say if freeStorageSize is XX,
     * and the current free storage is YY,
     * if XX is less than YY, just return. if not free XX-YY number
     * of bytes if possible.
     * @param opFinishedIntent PendingIntent call back used to
     * notify when the operation is completed.May be null
     * to indicate that no call back is desired.
     */
public void freeStorage(long freeStorageSize, android.app.PendingIntent opFinishedIntent) throws android.os.RemoteException;
/**
     * Delete all the cache files in an applications cache directory
     * @param packageName The package name of the application whose cache
     * files need to be deleted
     * @param observer a callback used to notify when the deletion is finished.
     */
public void deleteApplicationCacheFiles(java.lang.String packageName, android.content.pm.IPackageDataObserver observer) throws android.os.RemoteException;
/**
     * Clear the user data directory of an application.
     * @param packageName The package name of the application whose cache
     * files need to be deleted
     * @param observer a callback used to notify when the operation is completed.
     */
public void clearApplicationUserData(java.lang.String packageName, android.content.pm.IPackageDataObserver observer) throws android.os.RemoteException;
/**
     * Get package statistics including the code, data and cache size for
     * an already installed package
     * @param packageName The package name of the application
     * @param observer a callback to use to notify when the asynchronous
     * retrieval of information is complete.
     */
public void getPackageSizeInfo(java.lang.String packageName, android.content.pm.IPackageStatsObserver observer) throws android.os.RemoteException;
/**
     * Get a list of shared libraries that are available on the
     * system.
     */
public java.lang.String[] getSystemSharedLibraryNames() throws android.os.RemoteException;
public void enterSafeMode() throws android.os.RemoteException;
public boolean isSafeMode() throws android.os.RemoteException;
public void systemReady() throws android.os.RemoteException;
public boolean hasSystemUidErrors() throws android.os.RemoteException;
}

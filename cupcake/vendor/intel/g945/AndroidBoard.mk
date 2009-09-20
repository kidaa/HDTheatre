
####################################################################

# Lets install our own init.rc files :)
# We will also make the nfs tarball depend on it so that it's always pulled in.

LOCAL_PATH := vendor/intel/g945
include $(CLEAR_VARS)

target_init_rc_file := $(TARGET_ROOT_OUT)/init.rc
$(target_init_rc_file) : $(LOCAL_PATH)/init.rc | $(ACP)
	$(transform-prebuilt-to-target)
ALL_PREBUILT += $(target_init_rc_file)

target_hw_init_rc_file := $(TARGET_ROOT_OUT)/init.g945.rc
$(target_hw_init_rc_file) : $(LOCAL_PATH)/init.g945.rc | $(ACP)
	$(transform-prebuilt-to-target)
ALL_PREBUILT += $(target_hw_init_rc_file)

target_alsa_conf_file := $(TARGET_OUT_ETC)/asound.conf
$(target_alsa_conf_file) : $(LOCAL_PATH)/asound.conf | $(ACP)
	$(transform-prebuilt-to-target)
ALL_PREBUILT += $(target_alsa_conf_file)

ifeq ($(TARGET_USE_NETWORKFILESYSTEM),true)

nfs_tar := $(PRODUCT_OUT)/nfs.tar
INSTALLED_NFSTARBALL_TARGET := $(nfs_tar).bz2
$(INSTALLED_NFSTARBALL_TARGET): PRIVATE_NFS_TAR := $(nfs_tar)
$(INSTALLED_NFSTARBALL_TARGET) : $(target_init_rc_file) $(target_hw_init_rc_file) $(target_alsa_conf_file)

else

INSTALLED_NFSTARBALL_TARGET := 

endif


####################################################################
### Include input devices specific files

include $(CLEAR_VARS)

file := $(TARGET_OUT_KEYLAYOUT)/AT_Translated_Set_2_keyboard.kl
ALL_PREBUILT += $(file)
$(file): $(LOCAL_PATH)/AT_Translated_Set_2_keyboard.kl | $(ACP)
	$(transform-prebuilt-to-target)

include $(CLEAR_VARS)
LOCAL_SRC_FILES := AT_Translated_Set_2_keyboard.kcm
include $(BUILD_KEY_CHAR_MAP)

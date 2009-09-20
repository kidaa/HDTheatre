# Copyright 2005 The Android Open Source Project

LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)

LOCAL_SRC_FILES:= \
	inferiors.c \
	mem-break.c \
	proc-service.c \
	regcache.c \
	remote-utils.c \
	server.c \
	target.c \
	utils.c \
	linux-i386-low.c \
	i387-fp.c \
	linux-low.c \
	hostio.c \
	hostio-errno.c \
	signals.c \
	version.c \
	reg-i386-linux.c

LOCAL_CFLAGS += -DGDBSERVER

LOCAL_C_INCLUDES := $(LOCAL_PATH)/../regformats $(LOCAL_PATH)/../../include $(LOCAL_PATH)/../../bfd
LOCAL_MODULE:= gdbserver

LOCAL_FORCE_STATIC_EXECUTABLE := true

LOCAL_STATIC_LIBRARIES := libc libthread_db

include $(BUILD_EXECUTABLE)


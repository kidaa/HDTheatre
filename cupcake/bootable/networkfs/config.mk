ifeq ($(TARGET_ARCH),x86)
ifeq ($(TARGET_USE_NETWORKFILESYSTEM),true)


networkfs_root := bootable/networkfs

$(INSTALLED_NFSTARBALL_TARGET) : $(networkfs_root)/config.mk \
				$(INSTALLED_SYSTEMTARBALL_TARGET)
	@echo ----- Making network file system tarbal ------
	rm -rf $(TARGET_NFS_OUT)
	mkdir -p $(TARGET_NFS_OUT)
	mkdir -p $(TARGET_NFS_ROOT_OUT)
	cp -fR $(TARGET_ROOT_OUT)/* $(TARGET_NFS_ROOT_OUT)
	tar -jxvf $(INSTALLED_SYSTEMTARBALL_TARGET) -C $(TARGET_NFS_ROOT_OUT)
	$(MKTARBALL) $(FS_GET_STATS) \
		$(TARGET_NFS_OUT) root $(PRIVATE_NFS_TAR) \
		$(INSTALLED_NFSTARBALL_TARGET)


endif
endif # TARGET_ARCH == x86

.PHONY: nfs_tarball
nfs_tarball : $(INSTALLED_NFSTARBALL_TARGET)

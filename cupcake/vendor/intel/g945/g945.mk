# TODO: Need to setup a proper inheritance tree for this class of
# products...
#
# For now, reuse the generic (phone) infrastructure.
#

$(call inherit-product, $(SRC_TARGET_DIR)/product/generic.mk)

PRODUCT_NAME := g945 
PRODUCT_DEVICE := g945
PRODUCT_POLICY := android.policy_mid
PRODUCT_PROPERTY_OVERRIDES += \
        ro.com.android.dataroaming=true


SUMMARY = "Custom package group for vendor layer"

LICENSE = "MIT"

PACKAGE_ARCH = "${VENDOR_LAYER_EXTENSION}"

inherit packagegroup

DEPENDS = " virtual/kernel make-mod-scripts"

PV = "1.0.0"
PR = "r0"

RDEPENDS_${PN} = " \
        pi-bluetooth \
        sysint-soc \
        westeros-soc-drm \
        "

# Include MACHINE specific packagegroup.
RDEPENDS_${PN}:append:raspberrypi4 = " \
        packagegroup-kernel-modules-raspberrypi4 \
        packagegroup-hal-raspberrypi4 \
        "

# These packages shall be moved to OSS layer in future.
RDEPENDS_${PN}:append:rdkv-oss = " \
        cairo \
        essos \
        gstreamer1.0 \
        gstreamer1.0-libav \
        gstreamer1.0-plugins-bad \
        gstreamer1.0-plugins-bad-meta \
        gstreamer1.0-plugins-base \
        gstreamer1.0-plugins-base-meta \
        gstreamer1.0-plugins-good \
        gstreamer1.0-plugins-good-meta \
        gstreamer1.0-rtsp-server \
        libdrm \
        libepoxy \
        libmms \
        pango \
        pulseaudio \
        wayland-default-egl \
        westeros \
        westeros-simplebuffer \
        westeros-simpleshell \
        westeros-sink \
        "

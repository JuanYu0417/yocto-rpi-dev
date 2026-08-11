SUMMARY = "Custom image for raspberry project"
LICENSE = "MIT"

inherit core-image

IMAGE_FEATURES += " \
    ssh-server-openssh \
    package-management \
"

IMAGE_INSTALL:append = " \
    vim \
    nano \
    htop \
    less \
    curl \
"

IMAGE_ROOTFS_EXTRA_SPACE = "65536"

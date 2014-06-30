SECTION = "core"
DESCRIPTION = "rapid ipv4 set for connman"
RDEPENDS_${PN} = ""
# The license is meant for this recipe and the files it installs.
# RNDIS is part of the kernel, udhcpd is part of busybox
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/LICENSE;md5=3f40d7994397109285ec7b81fdeb3b58"

PR = "r1"

PACKAGE_ARCH = "all"

SRC_URI = " \
    file://setstatic.sh \
"

do_install() {
    install -d ${D}/${prefix}/
    install -m 0644 ${WORKDIR}/setstatic.sh ${D}/${prefix}/
}

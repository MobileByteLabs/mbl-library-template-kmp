package io.github.template

import platform.Foundation.NSProcessInfo

/**
 * Apple platform implementation (iOS, macOS, tvOS, watchOS)
 */
actual fun getPlatformName(): String {
    val info = NSProcessInfo.processInfo
    val osName = info.operatingSystemName()
    val osVersion = info.operatingSystemVersionString
    return "$osName $osVersion"
}

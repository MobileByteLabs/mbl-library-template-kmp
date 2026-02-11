package io.github.template

import kotlin.test.Test
import kotlin.test.assertEquals

class LinuxGreetingTest {

    @Test
    fun testLinuxPlatformName() {
        val platformName = getPlatformName()
        assertEquals("Linux", platformName)
    }
}

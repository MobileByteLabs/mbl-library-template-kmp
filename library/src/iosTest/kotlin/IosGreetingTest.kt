package io.github.template

import kotlin.test.Test
import kotlin.test.assertTrue

class IosGreetingTest {

    @Test
    fun testIosPlatformName() {
        val platformName = getPlatformName()
        assertTrue(platformName.isNotBlank())
    }
}

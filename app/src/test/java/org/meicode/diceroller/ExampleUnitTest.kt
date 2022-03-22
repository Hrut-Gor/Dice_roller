package org.meicode.diceroller

import org.junit.Test


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun generates_number() {
        val dice = Dice(6)
        dice.roll()
        assertTrue()

    }

    private fun assertTrue() {
        TODO("Not yet implemented")
    }

}

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {



    @Test
    fun add() {
        //WallService.clear()
        val res = WallService.add(getPost1(0))
        assertNotEquals(0, res.id);
    }

    @Test
    fun updateIdExists() {
        //WallService.clear()
        WallService.add(getPost1(0))

        val deleted = WallService.update(getPost2(1));

        assertTrue(deleted)
    }

    @Test
    fun updateIdNotExists() {
        //WallService.clear()
        WallService.add(getPost1(0))

        val deleted = WallService.update(getPost2(33));

        assertFalse(deleted)
    }
}
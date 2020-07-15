package SixKyu;
import static org.junit.jupiter.api.Assertions.*;

import SixKyu.SupermarketQueue;
import org.junit.jupiter.api.Test;

class SupermarketQueueTest {

    @Test
    public void testNormalCondition() {
        assertEquals(9, SupermarketQueue.solveSuperMarketQueue(new int[] { 2, 2, 3, 3, 4, 4 }, 2));
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, SupermarketQueue.solveSuperMarketQueue(new int[] {}, 1));
    }

    @Test
    public void testSingleTillManyCustomers() {
        assertEquals(15, SupermarketQueue.solveSuperMarketQueue(new int[] { 1, 2, 3, 4, 5 }, 1));
    }

    @Test
    public void testNormalCondition3() {
        assertEquals(10, SupermarketQueue.solveSuperMarketQueue(new int[] { 10, 2, 3, 3 }, 2));
    }

    @Test
    public void testNormalCondition2() {
        assertEquals(14, SupermarketQueue.solveSuperMarketQueue(new int[] { 6,6,6,7,3,2,4,5 }, 3));
    }
}
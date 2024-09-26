import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MCSTest {
    int[] sample = new int[] {-2,11,-4,13,-5,2};
    @Test
    void testQuadratic() {
        assertEquals(20,MCS.maxSubsequenceSum_quadratic(sample));
    }

    @Test
    void testLinear() {
        assertEquals(20,MCS.maxSubsequenceSum_linear(sample));
    }
}
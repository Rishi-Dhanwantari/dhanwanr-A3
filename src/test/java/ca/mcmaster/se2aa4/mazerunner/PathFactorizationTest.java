package ca.mcmaster.se2aa4.mazerunner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test for if paths are properly factorized.
 */

class PathFactorizationTest {

    @Test
    void testPathFactorization() {
        Path path = new Path();
        path.addMovement("FFFRFRFFLLFFRFF");

        String factorizedPath = "3FRFR2F2L2FR2F";
        
        assertTrue(factorizedPath.equals(path.getFactorizedPath()));
    }
}
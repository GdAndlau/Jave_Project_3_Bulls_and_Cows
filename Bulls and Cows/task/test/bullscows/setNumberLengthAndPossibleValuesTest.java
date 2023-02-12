package bullscows;

import junit.framework.TestCase;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import org.junit.Assert;

public class setNumberLengthAndPossibleValuesTest extends TestCase {

    @ParameterizedTest
    @ValueSource(ints = {1, 0, 5, 0,1, -4, 80})
    public void testSetLength(int length) {
        Boolean isTrue = false;

        if(length >= 1) isTrue = true;
        assertTrue(isTrue);
    }
}
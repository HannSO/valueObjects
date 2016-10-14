import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by hannahsmyth-osbourne on 14/10/2016.
 */
public class EuroTest {

    @Test
     public void verifyObjectsAreDiff(){
        assertFalse(new Euro(10) == new Euro(10)) ;
    }

    @Test
    public void verifyValuesAreSameWithEqualsMethod(){
        assertEquals(new Euro(10), new Euro(10));
    }


    @Test
    public void verifyValuesAreNotSameWithEqualsMethod(){
        assertNotEquals(new Euro(10), new Euro(5));
    }

    @Test
    public void verifyValuesDiffWhenComparedToNull(){
        assertNotEquals(new Euro(10), null);

    }
    // When you compare null to another value of object, you get null pointer exception.

    @Test
    public void verifyValuesDiffWhenComparedToDifferentObject(){
        assertNotEquals(new Euro(10), new Object());
    }

    @Test
    public void verifyValuesSameWhenAdditionIsUsedCorrectly(){
        assertEquals(new Euro(10), new Euro(7).add(new Euro (3)));
    }

    @Test
    public void verifyValuesDiffWhenAdditionUsedIncorrectly(){
        assertNotEquals(new Euro(10), new Euro(5).add(new Euro(2)));
    }

    @Test
    public void verifyDiffWhenCompareEuroAndDollar(){
        assertNotEquals(new Euro(10), new Dollar(10));
    }

    @Test
    public void verifySameWhenCompareDiffCurrencySameVal(){
        assertEquals(new Euro(10), new Dollar(13.5));
    }

}
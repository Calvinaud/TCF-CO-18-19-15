package unice.polytech.si4.cl.g15.cookieOnDemand;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CoDTest {

    @Test
    public void getInstanceNotNull() throws Exception {
        CoD c = CoD.getInstance();
        assertNotNull(c);
    }

    @Test
    public void getInstanceSame() throws Exception {
        CoD c = CoD.getInstance();
        CoD c2 = CoD.getInstance();
        assertEquals(c, c2);
    }

}
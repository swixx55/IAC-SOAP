package mypackage;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BMIServiceImplTest {
    @Test
    public void geldigeInput() {
        Request req = new Request();
        req.setGewicht(BigInteger.valueOf(50));
        req.setLeeftijd(BigInteger.valueOf(25));
        BMIServiceImpl wsi = new BMIServiceImpl();
        Response result = wsi.calculatePower(req);
        BigInteger result2 = result.getResult();
        int actualResult = result2.intValue();
        assertEquals(1250, actualResult);
    }
}
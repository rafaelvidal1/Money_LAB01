package money;

import org.junit.Test;
import static org.junit.Assert.*;

public class MoneyTest {
    
    
    @Test
    public void testAdd() {
        Currency _Tcurrency = new Currency(); 
        
        Money m12 = new Money(_Tcurrency);
        m12.set(12,"BRL");
        
        Money m14 = new Money(_Tcurrency);
        m14.set(14,"BRL");
        
        Money Expec_Result = new Money(_Tcurrency);
        Expec_Result.set(26,"BRL");
        
        Money Result = m12.add(m14);
        
        assertEquals(Expec_Result.getAmount(),Result.getAmount());
    }
}
package de.mes;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class Module2Test {
    
    private final Module2 module;

    public Module2Test(Module2 module) {
        this.module = module;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
      return Arrays.asList(new Object[][] {
          { new Module2() },
      });
    } 

    
    @Test
    public void testReactorMethod(){
        Assert.assertEquals(Module2.MODULE_NAME,  this.module.get());
    }
        
}

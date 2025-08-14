package test.java.ME.VPC.H.dnn;

import ME.VPC.M.app.App;
import S_A.pheromone.IMV_SIQ;
import dnn.WriteDNNMap;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class WriteDNNMapTest {

    @Test
    void testDoWriteDNNMap() {
        WriteDNNMap.doWriteDNNMap("stringPath", new App());
    }

    @Test
    void testDoWriteDNNMap2() {
        WriteDNNMap.doWriteDNNMap("stringPath", new App(), new HashMap<String, IMV_SIQ>(){{put("String", new IMV_SIQ());}});
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme
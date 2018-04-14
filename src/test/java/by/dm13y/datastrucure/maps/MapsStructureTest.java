package by.dm13y.datastrucure.maps;

import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;


public class MapsStructureTest {
    @Test
    public void diff_hashMap_vs_linkedHashMap(){
        Map<String, String> hashMap = new HashMap<>();
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            hashMap.put(String.valueOf(i), String.valueOf(i));
            linkedHashMap.put(String.valueOf(i), String.valueOf(i));
        }
        /**
         * diff values between hashMap and linkedHashMap
         * linkedHashMap - fori order
         * hashMap - shuffle order
         */
        assertEquals(hashMap.values(),linkedHashMap.values());
    }
}
package HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HashMapTest {
    private HashMap<String,Integer> map;
    @BeforeEach
    void setUp () {
        map = new HashMap();
        map.put("Диана", 12);
        map.put("Камила", 22);
        map.put("Фарангиз", 15);
        map.put("Ника", 19);
        map.put("Люба", 8);
        map.put("Маша", 10);
    }
    @Test
    void put () {
        map.put("Степан", 20);
        Assertions.assertTrue(map.containsKey("Степан"));
    }
    @Test
    void containsKey() {
        map.put("Катя", 21);
        Assertions.assertTrue(map.containsKey("Катя"));
    }
    @Test
    void containsValue () {
        Assertions.assertTrue(map.containsValue(19));
    }
    @Test
    void remove () {
        Assertions.assertEquals(8, map.remove("Люба"));
        Assertions.assertFalse(map.containsKey("Люба"));
    }
    @Test
    void get () {
        Assertions.assertEquals(map.get("Ника"), 19);
    }
    @Test
    void size () {
        Assertions.assertEquals(6,map.size());
    }
}
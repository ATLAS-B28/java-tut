package Experimental;

import party.iroiro.luajava.Lua;
import party.iroiro.luajava.lua51.Lua51;
import party.iroiro.luajava.value.LuaValue;
import org.junit.jupiter.api.Assertions;
import java.math.BigDecimal;

public class Chandra {
    public static void main(String[] args) {
        try(Lua chandra = new Lua51()) {
            System.out.println(chandra);
            LuaValue l = chandra.from(1);
            chandra.set("a",l);
            chandra.set("b",2);
            chandra.set("c", new BigDecimal(3));
            Assertions.assertEquals(
                    6,
                    chandra.eval("return a + b + c:longValue()")[0].toInteger()
            );

        }
    }
}

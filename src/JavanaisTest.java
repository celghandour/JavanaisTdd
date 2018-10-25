import org.junit.Test;

import static org.junit.Assert.*;

public class JavanaisTest {



    @Test
    public void CryptTest (){

        Translator translator = new Translator();

        String string ="Bonjour Benjamin Pavard,il y'a moyen de chanter avant l'intervienw par exemple".replaceAll("( )+", " ");

        String string1 = translator.crypt(string);

       assertTrue(string1.equals("Bavonjavour Bavenjavamavin Pavavavard,avil avy'ava mavoyen dave chavantaver avavavant l'avintavervavienw pavar avexavemplave"));


       String string2=translator.deCrypt(string1);


        assertEquals(string,string2);

    }

}

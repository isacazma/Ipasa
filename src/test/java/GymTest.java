import model.User;
import org.junit.jupiter.api.Test;

import static model.User.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class GymTest {



    @Test
//    Hier test ik of een User meteen in een lijst word gestopt wanneer het word aan gemaakt
    void addLijst(){
        User kees = new User("kees","geheim","manager");
        allUsers.add(kees);
        User henk = new User("henk","geheim","lid");
        assertTrue(User.getAllUser().contains(henk));
        assertTrue(User.getAllUser().contains(kees));
        assertFalse(User.getdit().contains(kees));
        assertEquals(3, User.getAllUser().size());
    }

@Test
void TestTwee(){
    User keesa = new User("kees","geheim","manager");
    assertFalse(User.getdit().contains(keesa));
    assertEquals(5, User.getAllUser().size());
    verwijderUser(keesa);

    }
//    Test hier of er een roll die niet 1 van de 3 zijn meteenm lid word
@Test
    void TestDrie(){
    assertEquals(3, User.getAllUser().size());
    User maan = new User("maan","zon","ik doe lekkergek");

    assertTrue(maan.getRole().equals("lid"));
}

@Test
    void testDriePlus(){
    User karel = new User("karel","leider","manager");
    assertTrue(karel.getRole().equals("manager"));

}

}

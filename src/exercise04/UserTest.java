package exercise04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testUser() {
        String userName = "staffanPaffan";
        String password = "solemio";

        User user = new User(userName, password);
    }

    @Test
    public void testGetUserName() {
        //Arrang
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";

        User user = new User(userName, password);

        //Act
        //Hämta användarnamn
        String actual = user.getUserName();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals("staffanPaffan", actual);
        assertEquals(userName, actual);
    }

    @Test
    public void testGetPassword() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Hämta password
        String actual = user.getPassword();

        //Kontrollera att password är korrekt
        assertEquals(password, actual);
    }

    @Test
    public void testSetUserName() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra användarnamn -> GrodanBoll
        String newUserName = "GrodanBoll";
        user.setUserName(newUserName);

        //Hämta användarnamn
        String actual = user.getUserName();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals("GrodanBoll", actual);
    }

    @Test
    public void testSetShortUserName() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra användarnamn -> GrodanBoll
        String newUserName = "lok";
        user.setUserName(newUserName);

        //Hämta användarnamn
        String actual = user.getUserName();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals("staffanPaffan", actual);
    }

    @Test
    public void testSetPassword() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "kokosen";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals(newPassword, actual);
    }


}

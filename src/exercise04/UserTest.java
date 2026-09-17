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

        //Hämta typeOfUser
        String actual = user.getPassword();

        //Kontrollera att typeOfUser är korrekt
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
    public void testSetPassword7chars() {
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

    @Test
    public void testSetPassword20chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "hejarhejarhejarhejar";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals(newPassword, actual);
    }

    @Test
    public void testSetPassword21chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "hejarhejarhejarhejare";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals(password, actual);
    }

    @Test
    public void testSetPassword6chars() {
        //Skapa ett objekt
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        //Ändra lösenord -> kokosen
        String newPassword = "tangon";
        user.setPassword(newPassword);

        //Hämta lösenord
        String actual = user.getPassword();

        //Assert
        //Kontrollera att användarnamnet är korrekt
        assertEquals(password, actual);
    }

    @Test
    public void testGetTypeOfUser() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String actual = user.getTypeOfUser();

        assertEquals("normal", actual);
    }

    @Test
    public void testSetTypeOfUser() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "onormal";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals("normal", actual);
    }

    @Test
    public void testSetTypeOfUserAdmin() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "admin";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals(newTypeOfUser, actual);
    }

    @Test
    public void testSetTypeOfUserSuper() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "super";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals(newTypeOfUser, actual);
    }


    @Test
    public void testSetTypeOfUserBackToNormal() {
        String userName = "staffanPaffan";
        String password = "solemio";
        User user = new User(userName, password);

        String newTypeOfUser = "admin";
        user.setTypeOfUser(newTypeOfUser);

        newTypeOfUser = "normal";
        user.setTypeOfUser(newTypeOfUser);

        String actual = user.getTypeOfUser();

        assertEquals(newTypeOfUser, actual);
    }




}

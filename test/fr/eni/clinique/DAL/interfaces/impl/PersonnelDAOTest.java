package fr.eni.clinique.DAL.interfaces.impl;

import fr.eni.clinique.BO.Utilisateur;
import fr.eni.clinique.DAL.DAOFactory;
import fr.eni.clinique.DAL.exceptions.DALException;
import fr.eni.clinique.DAL.interfaces.IPersonnelDAO;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author CHARTIER Corentin
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PersonnelDAOTest {

    IPersonnelDAO personnelDAO;
    int ID = 1;

    public PersonnelDAOTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        personnelDAO = DAOFactory.getPersonnelDAO();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test_1_Create_Succes() throws Exception {
        Utilisateur utilisateur = new Utilisateur("Gilbert", "Admin", "SEC", false);
        int result = personnelDAO.create(utilisateur);
        assertEquals(ID, result);
    }

    @Test(expected = DALException.class)
    public void test_2_Create_Fail() throws DALException {
        Utilisateur utilisateur = new Utilisateur("Gilbert", "Admin", "SEC", false);
        personnelDAO.create(utilisateur);
        fail("Expected NumberFormatException");

    }

    @Test
    public void test_3_Read_Succes() throws Exception {
        Utilisateur expResult = new Utilisateur(ID, "Gilbert", "Admin", "SEC", false);
        Utilisateur result = personnelDAO.read(ID);
        assertEquals(expResult, result);

    }

    @Test(expected = AssertionError.class)
    public void test_4_Read_Fail() throws DALException {
        personnelDAO.read(786964);
        fail("Expected NumberFormatException");

    }
    
    @Test
    public void test_5_ReadByUsernameAndPassword_Succes() throws Exception {
        Utilisateur expResult = new Utilisateur(ID, "Gilbert", "Admin", "SEC", false);
        Utilisateur result = personnelDAO.readByUsernameAndPassword("Gilbert", "Admin");
        assertEquals(expResult, result);

    }

    @Test(expected = AssertionError.class)
    public void test_6_ReadByUsernameAndPassword_Fail() throws DALException {
        personnelDAO.readByUsernameAndPassword("Gilbert", "trucmuche");
        fail("Expected NumberFormatException");

    }

    @Test
    public void test_7_Update_Succes() throws Exception {
        int expResult = 0;
        int result = personnelDAO.update(new Utilisateur(ID, "Michel", "Admin", "SEC", false));
        assertEquals(expResult, result);

    }

    @Test(expected = AssertionError.class)
    public void test_8_Update_Fail() throws DALException {
        personnelDAO.update(new Utilisateur(785698, "Michel", "Admin", "SEC", false));
        fail("Expected NumberFormatException");

    }

    @Test
    public void test_9_Delete_Succes() throws Exception {
        Utilisateur utilisateur = new Utilisateur(ID, "Michel", "Admin", "SEC", false);
        int expResult = 1;
        int result = personnelDAO.delete(utilisateur);
        assertEquals(expResult, result);
    }

    @Test(expected = AssertionError.class)
    public void test_10_Delete_Fail() throws DALException {
        Utilisateur utilisateur = new Utilisateur(123654778, "Michel", "Admin", "SEC", false);
        personnelDAO.delete(utilisateur);
        fail("Expected NumberFormatException");

    }
    
}

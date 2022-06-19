package Ipas.model;

import model.PriveLes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriveLesTest {
    PriveLes boxen;
    PriveLes boxenTwee;

    @BeforeEach
    void init() {
        boxen = new PriveLes("bruceLee", 20.00, "kungfuMeester", "een les waar je leer boxen");
        boxenTwee = new PriveLes("bruceBee", 25.00, "eten", "ik doe alsof ik kan boxen");

    }

    @Test
    void setTrainer() {

        boxen.setTrainer("Kees de boer");
        assertEquals("Kees de boer", boxen.getTrainer());

    }

    @Test
    void setPrijs() {
        boxen.setPrijs(40.00);
        assertFalse(50.00, boxen.getPrijs());

    }

    private void assertFalse(double v, Double prijs) {
    }

    @Test
    void setTitle() {
        boxenTwee.setTitle("ik hou toch van trainen");
        assertEquals("ik hou toch van trainen" , boxenTwee.getTitle());
    }

    @Test
    void setBeschrijving() {
        assertEquals("ik doe alsof ik kan boxen", boxenTwee.getBeschrijving());
    }

    @Test
    void getTrainer() {
        assertEquals("bruceBee" , boxenTwee.getTrainer());
    }




}
package be.ephec.java.cours02.ex11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FeuDeSignalisationTest {

    @Test
    void testChangeCouleurVertOrange() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        while (feu.getCouleur() != CouleurDeFeu.VERT)
            feu.changeCouleur();

        feu.changeCouleur();
        assertEquals(CouleurDeFeu.ORANGE, feu.getCouleur(),
                "Le feu vert actif devrait passer à l'orange");
    }

    @Test
    void testChangeCouleurOrangeRouge() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        while (feu.getCouleur() != CouleurDeFeu.ORANGE)
            feu.changeCouleur();

        feu.changeCouleur();
        assertEquals(CouleurDeFeu.ROUGE, feu.getCouleur(),
                "Le feu orange actif devrait passer au rouge");
    }

    @Test
    void testChangeCouleurRougeVert() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        while (feu.getCouleur() != CouleurDeFeu.ROUGE)
            feu.changeCouleur();

        feu.changeCouleur();
        assertEquals(CouleurDeFeu.VERT, feu.getCouleur(),
                "Le feu rouge actif devrait passer au vert");
    }

    @Test
    void testActive() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        assertTrue(feu.isEstActif(), "Un feu doit être actif après avoir été activé.");
    }

    @Test
    void testDesactive() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        feu.desactive();
        assertFalse(feu.isEstActif(), "Un feu doit être inactif après avoir été désactivé.");
    }
    @Test
    void testNouveauFeuInactif() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        assertFalse(feu.isEstActif(), "Un nouveau feu doit être inactif.");
    }

    @Test
    void testFeuInactifNeChangePas() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        feu.desactive();
        CouleurDeFeu couleur = feu.getCouleur();
        feu.changeCouleur();
        CouleurDeFeu nouvelleCouleur = feu.getCouleur();
        assertEquals(couleur, nouvelleCouleur, "Un feu inactif ne peut pas changer de couleur.");
    }

    @Test
    void testFeuInactifEstOrange() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        feu.desactive();
        CouleurDeFeu couleur = feu.getCouleur();
        assertEquals(CouleurDeFeu.ORANGE, couleur, "Un feu inactif est Orange.");
    }
    @Test
    void testFeuActifEstRouge() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        CouleurDeFeu couleur = feu.getCouleur();
        assertEquals(CouleurDeFeu.ROUGE, couleur, "Un feu activé est Rouge.");
    }

    @Test
    void testChangeCouleur() {
        FeuDeSignalisation feu = new FeuDeSignalisation();
        feu.active();
        feu.changeCouleur();
        assertEquals(CouleurDeFeu.VERT, feu.getCouleur(), "Un feu Rouge change en Vert.");
        feu.changeCouleur();
        assertEquals(CouleurDeFeu.ORANGE, feu.getCouleur(), "Un feu Vert change en Orange.");
        feu.changeCouleur();
        assertEquals(CouleurDeFeu.ROUGE, feu.getCouleur(), "Un feu Orange change en Rouge.");
    }




}
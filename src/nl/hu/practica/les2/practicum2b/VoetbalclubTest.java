package nl.hu.practica.les2.practicum2b;

import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {
    @org.junit.jupiter.api.Test
    void aantalPunten() {
        Voetbalclub psv = new Voetbalclub("Psv");
        psv.verwerkResultaat('w');
        psv.verwerkResultaat('w');
        psv.verwerkResultaat('w');
        psv.verwerkResultaat('g');
            assertEquals(psv.aantalPunten(), 10);
        Voetbalclub z = new Voetbalclub();
    }
}
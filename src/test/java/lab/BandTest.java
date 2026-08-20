package lab;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class BandTest {

    @Test
    void shouldCreateBandWithMembers() {

        Musician slash = new Musician("Guitar");
        Musician duff = new Musician("Bass");

        Band band = new Band(
                "Guns N' Roses",
                List.of(slash, duff)
        );

        assertEquals(2, band.getMembers().size());
    }

    @Test
    void shouldRejectEmptyBand() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Band("Guns N' Roses", List.of())
    );
    }

    @Test
    void shouldRejectNullBandName() {

        Musician  slash = new Musician("Guitar");

        assertThrows(
                IllegalArgumentException.class,
                () -> new Band(null, List.of(slash))
        );

    }

    @Test
    void shouldRejectBlankBandName() {

        Musician  slash = new Musician("Guitar");

        assertThrows(
                IllegalArgumentException.class,
                () -> new Band("  ", List.of(slash)));

    }


}
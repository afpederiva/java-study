package lab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MusicianTest {

    @Test
    void shouldCreateMusicianWithInstrument() {

        Musician musician = new Musician("Guitar");

        assertEquals("Guitar", musician.getInstrument());
    }

    @Test
    void shouldRejectBlankInstrument() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Musician("")
        );
    }

    @Test
    void shouldRejectNullInstrument() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Musician(null)
        );
    }

}
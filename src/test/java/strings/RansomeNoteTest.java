package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomeNoteTest {

    RansomeNote ransomeNote = new RansomeNote();

    @Test
    void canConstruct() {
        assertTrue(ransomeNote.canConstruct("bg",
                "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}
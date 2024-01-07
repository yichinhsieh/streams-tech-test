package com.imgarena;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.ZonedDateTime;

class matchSaveTest {
    @Test
    void saveMatch() {
        match m = new match(1, ZonedDateTime.now(), "A", "B", "summary");
        matchSave store = new matchSave();
        store.matchSaveInArray(m);

        assertEquals(store.getMatch(1), m);
    }

}
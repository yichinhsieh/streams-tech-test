package com.imgarena;

import java.time.ZonedDateTime;

public class Main {
    public static void main(String[] args) {
        // Create a match
        match match1 = new match(1, ZonedDateTime.now(), "A", "B","This is a summary of the match.");
        System.out.println(match1.getStartDate ());
        // Save the match
    }
}
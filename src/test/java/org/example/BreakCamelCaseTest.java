package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BreakCamelCaseTest {
    @Test
    public void tests() {
        assertEquals( "correct", "camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals( "correct", "camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals( "Incorrect", "camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }
}
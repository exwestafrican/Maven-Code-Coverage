package com.mkyong.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMessageBuilder {

    @Test
    void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello mkyong", obj.getMessage("mkyong"));

    }

    // @Test
    // void testNameEmpty() {

    // MessageBuilder obj = new MessageBuilder();
    // assertEquals("Please provide a name!", obj.getMessage(" "));

    // }

    // @Test
    // void testNameNull() {

    // MessageBuilder obj = new MessageBuilder();
    // assertEquals("Please provide a name!", obj.getMessage(null));

    // }

}
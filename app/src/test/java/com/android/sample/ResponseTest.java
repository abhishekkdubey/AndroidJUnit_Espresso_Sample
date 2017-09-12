package com.android.sample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by AbhishekDubey on 12-09-2017.
 */
public class ResponseTest {

    private Response response;

    @Before
    public void setUp() throws Exception {
        response = new Response();
    }


    @Test
    public void testName() {
        assertEquals(null, PrivateMemberManipulator.getFieldValue(response, "name"));
        PrivateMemberManipulator.setFieldValue(response, "name", "Abhishek");
        assertEquals("Abhishek", PrivateMemberManipulator.getFieldValue(response, "name"));
    }

    @Test
    public void testEmail() {
        assertEquals(null, PrivateMemberManipulator.getFieldValue(response, "email"));
        PrivateMemberManipulator.setFieldValue(response, "email", "abhishek11dubey@gmail.com");
        assertEquals("abhishek11dubey@gmail.com", PrivateMemberManipulator.getFieldValue(response, "email"));
    }

    @Test
    public void testId() {
        assertEquals(null, PrivateMemberManipulator.getFieldValue(response, "id"));
        PrivateMemberManipulator.setFieldValue(response, "id", "12345");
        assertEquals("12345", PrivateMemberManipulator.getFieldValue(response, "id"));
    }

}
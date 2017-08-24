package com.android.sample;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

/**
 * Created by AbhishekDubey on 24-08-2017.
 */
@RunWith(MockitoJUnitRunner.class)
public class UtilityTest extends TestCase {

    /*
        private Utility utility;


        @Before
        public void setUp() {
            utility = Utility.getInstance();
        }
    */
    @Mock
    Employee employee;

    @Test
    public void testCheckForValidFields() throws Exception {
        assertEquals(false, Utility.getInstance().checkForValidFields(null, ""));
        assertEquals(true, Utility.getInstance().checkForValidFields("testuser", "12345"));
    }

    @Test
    public void testCheckForValidFields1() throws Exception {
        assertEquals(false, Utility.getInstance().checkForValidFields("", null, null));
        assertEquals(false, Utility.getInstance().checkForValidFields("testuser", "12345", "123456"));
        assertEquals(true, Utility.getInstance().checkForValidFields("testuser", "12345", "12345"));
    }

    @Test
    public void testCheckEmployeeValidation() throws Exception {
        assertEquals(false, Utility.getInstance().isEmployeIsValid(employee));

        assertEquals(true, Utility.getInstance().isEmployeIsValid(new Employee("test", "12345")));

    }
}
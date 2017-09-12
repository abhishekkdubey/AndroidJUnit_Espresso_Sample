package com.android.sample;

import junit.framework.Assert;

import java.lang.reflect.Field;

/**
 * Helper class with static methods for manipulating fields in objects
 */
public abstract class PrivateMemberManipulator {

    private PrivateMemberManipulator() {
        // nothing to handle
    }

    /****************************************************************/

    /**
     * Set internal (private) field in object
     *
     * @param object    Object to set field value on
     * @param fieldName Name of field value
     * @param value     Value to set field to
     */
    public static void setFieldValue(final Object object, final String fieldName, final Object value) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(object, value);
        } catch (IllegalAccessException iae) {
            Assert.assertNotNull(iae);
        } catch (NoSuchFieldException nsfe) {
            Assert.assertNotNull(nsfe);
        }
    }

    public static Object getFieldValue(final Object object, final String fieldName) {
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            return field.get(object);
        } catch (IllegalAccessException iae) {
            Assert.assertNotNull(iae.getMessage(), iae);
        } catch (NoSuchFieldException nsfe) {
            Assert.assertNotNull(nsfe.getMessage(), nsfe);
        }
        return null;
    }

}

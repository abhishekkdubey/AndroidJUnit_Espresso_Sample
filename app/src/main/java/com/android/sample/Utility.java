package com.android.sample;

import android.text.TextUtils;

/**
 * Created by AbhishekDubey on 24-08-2017.
 */

public class Utility {

    private static Utility utility;

    private Utility() {
    }

    public static Utility getInstance() {
        if (utility == null) {
            synchronized (Utility.class) {
                utility = new Utility();
            }
        }
        return utility;
    }


    /**
     * Method to validate username and password
     *
     * @param login    as String
     * @param password as String
     * @return a boolean value
     */
    public boolean checkForValidFields(String login, String password) {
        boolean isValid = false;
        if (login != null && password != null && !TextUtils.isEmpty(login) && !TextUtils.isEmpty(password)) {
            isValid = true;
        }
        return isValid;
    }

    /**
     * @param login
     * @param password
     * @param confirmPassword
     * @return
     */
    public boolean checkForValidFields(String login, String password, String confirmPassword) {
        boolean isValid = false;
        // Check for a valid login,password if the user entered one.
        if (login != null && password != null && confirmPassword != null && !TextUtils.isEmpty(login) && !TextUtils.isEmpty(password) && !TextUtils.isEmpty(confirmPassword) && confirmPassword.equals(password)) {
            isValid = true;
        }

        return isValid;
    }

    public boolean isEmployeIsValid(Employee employee) {
        if (employee != null && employee.getName() != null && employee.getEmployeeId() != null && employee.getEmployeeId().length() > 2) {
            return true;
        } else {
            return false;
        }
    }

    public static final String USER_DATA = "user-data";
}

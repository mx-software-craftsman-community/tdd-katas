package org.mxscc.leapyear;

public class LeapYear {

    /**
     * Determines if a year is a leap year.
     *
     * @param year Year to analize
     * @return
     */
    public boolean isLeapYear(int year) {
        return year % 4 == 0;
    }
}

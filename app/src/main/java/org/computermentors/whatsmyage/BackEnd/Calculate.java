package org.computermentors.whatsmyage.BackEnd;

import android.widget.DatePicker;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by CryoFlar3 on 2/9/16.
 */
public class Calculate {

    public Date getDate (DatePicker date){
        Date newDate = new Date(date.getYear() - 1900, date.getMonth(), date.getDayOfMonth());

        return newDate;
    }

    public int getAge (Date date){

        Calendar dob = Calendar.getInstance();
        dob.setTime(date);
        Calendar today = Calendar.getInstance();
        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
            age--;
        } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
            age--;
        }

=======
    // Returns the date entered in to the datepicker
    public Date getDate (DatePicker datePicker){
        Date date = new Date();

        return date;
    }

    // Returns the age of the user in years
    public int getAge (Date date){
        int age = 0;

>>>>>>> origin/master
        return age;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nghia Nguyen
 */
public class ConvertDateString {

    public static String ToString(Date date) {
        SimpleDateFormat forrmater = new SimpleDateFormat("yyyy-MM-dd");
        return forrmater.format(date);
    }
}

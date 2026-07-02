package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

    public static void main(String[] args) {

        /// Exemple du cours :
        /// Calendar cal = Calendar.getInstance();
        /// cal.set(2020, 6, 7, 19, 30, 56);
        /// Date date = cal.getTime();
        Calendar calendrier = Calendar.getInstance();

        calendrier.set(2016, Calendar.MAY, 19, 23, 59, 30);  /// 19 mai 2016 à 23:59:30

        Date date = calendrier.getTime();

        ///  Exemple du cours :
        ///  SimpleDateFormat formateur = new SimpleDateFormat(“dd/MM/yyyy HH:mm:ss”); sans heures, minutes secondes
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(format1.format(date));




        Calendar aujourdHui = Calendar.getInstance();  /// Date du jour

        Date dateJour = aujourdHui.getTime();

        SimpleDateFormat format2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(format2.format(dateJour));


        ///  Date à la date du
        /// 19 mai 2016 à 23h59 et 30 secondes et affichez

        ///  Exemple du cours :
        ///  SimpleDateFormat formateur = new SimpleDateFormat("EEEE dd MMMM yyyy", Locale.FRANCE);
        ///  System.out.println(formateur.format(new Date()));

        /// Français
        SimpleDateFormat fr = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
        System.out.println(fr.format(dateJour));



        /// Russe
        SimpleDateFormat ru = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru"));
        System.out.println(ru.format(dateJour));



        /// Chinois
        SimpleDateFormat cn = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
        System.out.println(cn.format(dateJour));



        /// Allemand
        SimpleDateFormat de = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.GERMANY);
        System.out.println(de.format(dateJour));

    }

}

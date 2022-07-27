package src.Program.necessarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class necessarios {

    static NumberFormat formatarosvalores = new DecimalFormat("R$ #, ##0.00");

    public static String doubleToString(Double double){
        return formatarosvalores.format(double);
    }
    
}

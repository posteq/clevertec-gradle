package ru.clevertec;
import ru.clevertec.StringUtils.*;

public class Utils {
    private Utils(){}

    static boolean isAllPositiveNumbers(String ... str){
        for(String i : str){
            if(!StringUtils.isPositiveNumber(i))
                return false;
        }
        return true;
    }
}

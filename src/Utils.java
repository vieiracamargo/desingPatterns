public class Utils {
    public static boolean isValid(String value){
         boolean result = false;

        if(value != null){
            result = !value.trim().isEmpty();
        }

        return result;
    }
}

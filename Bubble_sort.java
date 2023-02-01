import java.io.IOException;
import java.util.logging.*;
public class Bubble_sort {
    public static String show(double[] array){
        StringBuilder stb = new StringBuilder();
        for(double number : array){
            stb.append(String.valueOf(number));
            stb.append("; ");
        }
        return stb.toString();
    }
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Bubble_sort.class.getName());
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh); 
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
    
        // double[] arr = {7, 2, 5, 6, 7, 4, 1, 9};
        double[] arr = {3, 3, 2, 1};
        double tmp;
        for(int j = arr.length - 1; j > 0; j--){
            for(int i = 0; i < j; i++){
                if(arr[i] > arr[i+1]){
                   tmp = arr[i]; arr[i] = arr[i+1]; arr[i+1] = tmp;
                }
            }
            logger.info(show(arr));
        }
    }
}
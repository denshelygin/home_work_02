package DZ2.DZ_2;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_1 {
    public static void main(String[] args) throws IOException {
        
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            //System.out.print(arr[i] + ", ");
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Log сортировки:");

        Logger loger = Logger.getLogger(task_1.class.getName());
        FileHandler fHandler = new FileHandler("test_1.txt");
        SimpleFormatter sFormatter = new SimpleFormatter();
        fHandler.setFormatter(sFormatter);
        loger.addHandler(fHandler);

        int temp;
        //for (int i = arr.length - 1; i >= 0; i--) {
        for (int i = 0; i < arr.length - 1; i++) {    
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            loger.info(Arrays.toString(arr));            
        }
        System.out.println("Сортированный массив:");
        System.out.print(Arrays.toString(arr));
    }
}

   
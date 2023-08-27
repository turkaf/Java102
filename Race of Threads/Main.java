import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }
        
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        
        int chunkSize = numbers.size() / 4;
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            int startIndex = i * chunkSize;
            int endIndex = (i + 1) * chunkSize;

            List<Integer> subList = numbers.subList(startIndex, endIndex);

            Thread thread = new Thread(new NumberProcessor(subList, evenNumbers, oddNumbers));
            threads.add(thread);
            thread.start();
        }
        
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Çift Sayılar:");
        for (Integer even : evenNumbers) {
            System.out.println(even);
        }
        
        System.out.println("Tek Sayılar:");
        for (Integer odd : oddNumbers) {
            System.out.println(odd);
        }
	}
}
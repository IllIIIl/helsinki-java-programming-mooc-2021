import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int count = 0;

        while(true){
            int input = Integer.valueOf(scanner.nextLine());

            if(input == 0){
                break;
            }
            if(input > 0){
                list.add(input);
                count++;
            }
        }
        if(list.isEmpty() == true){
            System.out.println("Cannot calculate the average");
        }else{
            for(int element: list){
                sum += element;
            }
            double average = (double)sum / count;
            System.out.println(average);
        }

    }
}
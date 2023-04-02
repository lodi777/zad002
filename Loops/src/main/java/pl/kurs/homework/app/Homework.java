package pl.kurs.homework.app;

import pl.kurs.homework.service.HomeworkService;

public class Homework {
    public static void main(String[] args) {

        HomeworkService.printNumbersRangeClosed(10);
        HomeworkService.sumNumbers(10);
        HomeworkService.sumSetNumbers(4);

        System.out.println("-----------------------------------");

        int[] array = {6, 12, 18};
        boolean result = HomeworkService.allNumbersDivisibleByTwoAndThree(array);
        System.out.println(result);

        System.out.println("power:");
        System.out.println(HomeworkService.power(2, -3));


//        int i = 0;
//        for(;;) {
//            System.out.println(i);
//            i++;
//        }
        int[] array2 = {3, 2, 1};

        boolean result2 = HomeworkService.isSorted(array2);
        System.out.println(result2);
    }


}





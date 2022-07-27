public class Main {
    public static void main(String[] args) {


        int counter = 1;
        while (counter < 11) {
            System.out.print(counter + " ");
            counter ++;

        }
        System.out.println();
        for (int i = counter -1; i > 0 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        int monthDays = 31;
        for (int i = 1; i < monthDays; i = i + 7) {
            System.out.println(i + "-е число. Необходимо подготовить отчет.");
        }

        int friday = 4;
        while (friday < monthDays) {
            System.out.println(friday + "-е число. Необходимо подготовить отчет.");
            friday = friday + 7;



        }

        System.out.println();
        System.out.println();

        int currentYear = 2022;
        int previousYear = currentYear - 200;
        int futureYear = currentYear + 100;
        for (int i = 0; i < futureYear; i = i + 79) {
            if (i > previousYear){
                System.out.println(i);
            }

            
        }
        System.out.println();
        int dayX = 0;
        while (dayX<futureYear){
            if (dayX>previousYear){
                System.out.println(dayX);

            }
            dayX+=79;
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String nedelya=scan.nextLine();

        Week monday=Week.MONDAY;
        System.out.println(monday);

        Week tuesday=Week.TUESDAY;
        System.out.println(tuesday);

        Week wednesday=Week.WEDNESDAY;
        System.out.println(wednesday);

        Week thursday=Week.THURSDAY;
        System.out.println(thursday);

        Week friday=Week.FRIDAY;
        System.out.println(friday);

        Week saturday=Week.SATURDAY;
        System.out.println(saturday);

        Week sunday=Week.SANDAY;
        System.out.println(sunday);

        switch (nedelya){
            case "Monday":
                System.out.println("Duyshonbu kunu teoria bolot");
                break;
            case "Tuesday":
                System.out.println("Sheyshembi kunu praktika bolot");
                break;
            case "Wednesday":
                System.out.println("Sharshenbi kunu praktika jana English bolot");
                break;
            case "Thursday":
                System.out.println("Beyshembi kunu teoria bolot");
                break;
            case "Friday":
                System.out.println("Juma kunu praktika bolot");
                break;
            case "Saturday":
                System.out.println("Dem alysh kun");
                break;
            case "sunday":
                System.out.println("Dem alysh kun");
                break;



        }


    }
}
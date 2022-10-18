package be.intecbrussel;

public class MainApp {

    public static void main(String[] args) {


        Day day = Day.TUESDAY;
        // System.out.println(day);


        switch (day) {
            case MONDAY:
                System.out.println("this is monday");
                break;
            case TUESDAY:
                System.out.println("this is tuesday");
                break;
            case WEDNESDAY:
                System.out.println("this is wednesday");
                break;


        }

        Day[] days = Day.values();

        for (Day dy : days) {
            System.out.println(dy + " index: " + dy.ordinal());
        }

        day.defaultDay();
        System.out.println(day.name());


        Colour colour = Colour.BLUE;
        System.out.println(colour.getColourCode());




    }
}

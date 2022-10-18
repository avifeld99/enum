package be.intecbrussel;

public enum Day {

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    Day() {
        System.out.println(this.toString());    }


    public void defaultDay() {
        System.out.println("default day is sunday!");
    }
}

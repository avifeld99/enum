package be.intecbrussel;

public enum Colour {


    // Constanten
    RED(100),
    GREEN(200),
    BLUE(300);

    // property
    private int colourCode;

    // Constructor
    private Colour(int colourCode) {
        this.colourCode = colourCode;
    }

    // Methodes
    int getColourCode() {
        return colourCode;
    }

    public void colourInfo() {
        System.out.println("Universal Colour");
    }

}

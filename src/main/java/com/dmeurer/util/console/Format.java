package com.dmeurer.util.console;

public enum Format {
    RESET(Format.ESC + "[0m"),

    FORMAT_BOLD(Format.ESC + "[1m"),
    FORMAT_DIM(Format.ESC + "[2m"),
    FORMAT_ITALIC(Format.ESC + "[3m"),
    FORMAT_UNDERLINE(Format.ESC + "[4m"),
    FORMAT_BLINK_SLOW(Format.ESC + "[5m"),
    FORMAT_BLINK_RAPID(Format.ESC + "[6m"),
    FORMAT_REVERSE(Format.ESC + "[7m"),
    FORMAT_HIDDEN(Format.ESC + "[8m"),
    FORMAT_STRIKETHROUGH(Format.ESC + "[9m"),

    FORMAT_FRACTURE(Format.ESC + "[21m"),
    FORMAT_UNDERLINE_DOUBLE(Format.ESC + "[21m"),

    FORMAT_FRAMED(Format.ESC + "[51m"),
    FORMAT_ENCIRCLED(Format.ESC + "[52m");

    

    private final String value;

    private static final char ESC = '\033';

    Format(String value) {
        this.value = value;
    }

    public String toString() {
        return this.value;
    }

    private static final int[] width = {40};

    /**
     * Prints a "display" where all style options are used.
     * <br>
     * There you can see the color with the corresponding name, and you can see what options your terminal supports.
     * <br>
     * To show style options, use <italic>com.dmeurer.util.console.Format</italic>.
     *
     * @author Dominik Meurer
     */
    public static void printFormat() {
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_BOLD") + "   " + FORMAT_BOLD + "Sample Text: FORMAT_BOLD" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_DIM") + "   " + FORMAT_DIM + "Sample Text: FORMAT_DIM" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_ITALIC") + "   " + FORMAT_ITALIC + "Sample Text: FORMAT_ITALIC" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_UNDERLINE") + "   " + FORMAT_UNDERLINE + "Sample Text: FORMAT_UNDERLINE" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_UNDERLINE_DOUBLE") + "   " + FORMAT_UNDERLINE_DOUBLE + "Sample Text: FORMAT_UNDERLINE_DOUBLE" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_BLINK_SLOW") + "   " + FORMAT_BLINK_SLOW + "Sample Text: FORMAT_BLINK_SLOW" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_BLINK_RAPID") + "   " + FORMAT_BLINK_RAPID + "Sample Text: FORMAT_BLINK_RAPID" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_REVERSE") + "   " + FORMAT_REVERSE + "Sample Text: FORMAT_REVERSE" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_HIDDEN") + "   " + FORMAT_HIDDEN + "Sample Text: FORMAT_HIDDEN" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_STRIKETHROUGH") + "   " + FORMAT_STRIKETHROUGH + "Sample Text: FORMAT_STRIKETHROUGH" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_FRACTURE") + "   " + FORMAT_FRACTURE + "Sample Text: FORMAT_FRACTURE" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_FRAMED") + "   " + FORMAT_FRAMED + "Sample Text: FORMAT_FRAMED" + RESET);
        System.out.println("  " + String.format("%-" + (width[0] - 2) + "s", "FORMAT_ENCIRCLED") + "   " + FORMAT_ENCIRCLED + "Sample Text: FORMAT_ENCIRCLED" + RESET);
    }
}

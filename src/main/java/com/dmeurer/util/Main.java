package com.dmeurer.util;

import com.dmeurer.util.console.Colors;
import com.dmeurer.util.console.Format;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Colors.printAllColors();
        Format.printFormat();

        System.out.println(Colors.backgroundRGB(100,100,255) + "Hello World!" + Colors.RESET);
    }
}

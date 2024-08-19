package com.collections;

import java.util.ArrayList;
import java.util.List;



public class Lists {
public static int indexOf(String color, List<String> list) {
    int indexColor = list.indexOf(color);
    return indexColor;
    }

    public static int indexOfByIndex(String color, List<String> colors, int i) {
    List<String> newColors = new ArrayList<String>();
    for (int j = i; j < colors.size(); j++) {
        newColors.add(colors.get(j));
    }
    if (newColors.contains(color)) {
        return newColors.indexOf(color) + i;
    }
    else {
        return -1;
    }


    }

    public static int indexOfEmpty(List<String> colors) {
        int indexSpace = colors.indexOf("");
        return indexSpace;
    }

    public static int put(String color, List<String> colors) {
        if (colors.contains("")) {

            colors.set(colors.indexOf(""), color);
            colors.remove(colors.indexOf(""));
            return colors.indexOf(color);
        }
        else {
            return -1;
        }
    }

    public static int remove(String color, List<String> colors) {
        int counter = 0;
        for (int i = 0; i < colors.size(); i++) {
            if (colors.get(i).equals(color)) {
                colors.set(i, "");
                counter++;
            }

        }
        return counter;
    }
}

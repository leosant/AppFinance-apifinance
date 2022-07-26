package com.appFinance.finance.enums;

public enum ColorCardEnum {

    BLACK("#3E3D45"),
    ORANGE("#E58F0E"),
    PURPLE("#3C246D"),
    GREEN("#1E961B"),
    RED("#8E1818");

    private String colorSpecified;
    ColorCardEnum(String colorSpecified) {
        this.colorSpecified = colorSpecified;
    }

    public String getColorSpecified() {
        return colorSpecified;
    }

    public static boolean contains(String field) {

        for (ColorCardEnum c : ColorCardEnum.values()) {
            if (c.name().equalsIgnoreCase(field)) {
                return true;
            }
        }

        return false;
    }
}

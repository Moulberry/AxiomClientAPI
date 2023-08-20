package com.moulberry.axiomclientapi;

public class Effects {

    public static final int BLUE = 1;
    public static final int RED = 2;
    public static final int OUTLINE = 4;
    public static final int REMOVAL = 8;

    public static final int SELECTION = BLUE | RED | OUTLINE;
    private static final int ALL = SELECTION | REMOVAL;

    public static boolean blueOrRed(int effects) {
        return (effects & (BLUE | RED)) != 0;
    }

    public static boolean any(int effects) {
        return (effects & ALL) != 0;
    }

}

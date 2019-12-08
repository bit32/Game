

import java.util.Scanner;

/**
 * Created by ВАСЯ on 24.11.2019.
 */
public class Krestik_Nolik {
    //SHAPE CONSTANTS
    public static final int DIMENSION = 3;
    public static final int PUSTO = 0;
    public static final int KHRESTYK = 1;
    public static final int NOLYK = 2;
    //CURRENT POSITION CONSTANTS
    public static final int GAMA_PRODOLGENIE = 0;
    public static final int GAMA_OVER_NICHIY = 1;
    public static final int GAMA_OVER_POBEDA_KRESTIKA = 2;
    public static final int GAMA_OVER_POBEDA_NOLIKA = 3;
    //FIELD
    public static final int RYD = 3, STOLB = 3;
    public static String [][] field = new String[RYD][STOLB];
    //INPUT SHAPE
    public static Scanner in = new Scanner(System.in);
    //DRAW FIELD
    public void game() {
        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                field[i][j]= "[]";
                System.out.print(field[i][j]);
            }
        }


    }

   }
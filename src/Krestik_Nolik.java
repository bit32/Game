import java.util.Scanner;

public class Krestik_Nolik {

    static char[][] field = new char[3][3];

     static Scanner  s;

    public static void main(String[] args) {

        s = new Scanner(System.in);

         char done;
         done = ' ';

          init_matrix();

        do{


            disp_matrix();

            get_player_move();

            done = check();

            if(done != ' ') break;

            get_computer_move();
            if(done != ' ') break;

        }while(done == ' ');

        if(done == 'X') System.out.println("to win!");

        else System.out.println("the game is over");

        return;

    }
    // initialization

   public static void init_matrix()
    {
        int i, j;

       for(i = 0; i < 3; i++){

            for(j = 0; j < 3; j++){

              field[i][j] = ' ';

            }

        }
    }

//draw a field
    public static void disp_matrix()
    {
        int i;

        for(i = 0; i < 3; i++){

            StringBuilder sb = new StringBuilder();

            sb.append(' ');
            sb.append(field[i][0]);

            sb.append(" |");
            sb.append(' ');
            sb.append(field[i][1]);
            sb.append(" |");
            sb.append(' ');
            sb.append( field[i][2]);

            System.out.println(sb.toString());

            if(i != 2) System.out.println(" - | - | - ");
        }

        System.out.println();
    }
  //player move
    public static void get_player_move()
    {

        int i, j;

        System.out.println("Enter the coordinates x, y: ");

        i = s.nextInt();
        j = s.nextInt();

        i--; j--;

        if(field[i][j] != ' '){
            System.out.println("Try again!\n");

            get_player_move();
        }

        else field[i][j] = 'X';
    }

  //computer move
    public static void get_computer_move()
    {

        int i  = 0 , j = 0;

        for(i = 0; i < 3; i++){

            for(j = 0; j < 3; j++){

                if(field[i][j] == ' ') break;
            }

            if(field[i][j] == ' ') break;
        }

        if(i*j == 9){
            System.out.println("drawn game!");
            System.exit(0);
        }

        else field[i][j] = 'O';
    }

   //validate
    public static char check()
    {
        int i;

        for(i = 0; i < 3; i++)

            if(field[i][0] == field[i][1] &&

                    field[i][0] == field[i][2])

                return field [i][0];
        for(i = 0; i < 3; i++)

            if(field[0][i] == field[1][i] &&
                    field[0][i] == field[2][i])

                return field [0][i];

        if(field[0][0] == field[1][1] &&
                field[1][1] == field[2][2])

            return field[0][0];

        if(field[0][2] == field[1][1] &&
                field[1][1] == field[2][0])

            return field[0][2];

        return ' ';
    }
}









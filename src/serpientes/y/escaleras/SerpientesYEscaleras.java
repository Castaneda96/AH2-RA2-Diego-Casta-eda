package serpientes.y.escaleras;

import java.io.IOException;
import java.util.Scanner;

public class SerpientesYEscaleras {
    public static void main(String[] args) throws IOException {
        int num1 [] [] = new int [8] [8];
        int num = 64;
        int posición = 0;
        char jugador[][] = new char [8][8];
        char trampas[][] = new char [8][8];
        Scanner sc = new Scanner(System.in);
        boolean tablero = true;
                            for (int i = 0; i < num1.length; i++){
                    if (tablero) {
                        for (int j = num1[i].length - 1; j >=0; j--) {
                             num1[i][j] = num;
                               num--;                         
                        }
                        tablero = false;
                    } else {
                        for (int j = 0; j < num1[i].length; j++) {
                            num1[i][j] = num;
                            num--;
                    }    
                        tablero = true;
                    }
                }
                            System.out.println("---------------------------------");
        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                if (num1 [i][j] <10) {
                    System.out.print("|  " + num1[i][j] );
                } else {
                    System.out.print("| " + num1[i][j] );
                }
            }
            for (int j = 0; j < 10; j++) {   
            }
            System.out.println("| ");
            System.out.println("| ");
            System.out.println("---------------------------------");
        }
            for (int i = 0; i < jugador.length; i++) {
                for (int j = 0; j < jugador[i].length; j++) {
                    jugador[i][j] = ' ';
                }
            }
        System.out.println("Tirar dado presiona r salir al menú presiona p");
        String Opción = sc.nextLine();
            switch (Opción) {
                case "r":
                 int  dado = (int) (Math.random() * (6-2) +2);
                    System.out.println("El resultado es "+ dado);
                    posición += dado;
                    if (posición >=7){
                    }   else if (posición >=7){
                           jugador [6][posición - 8] = '@';
                    } else { 
                        jugador [7][7 - posición] = '@';
                    }
                    break;
                            case "p":
                                    System.out.println("Bienvenido al Menú");
                                    break;
                                    
            }
        }       
    }    
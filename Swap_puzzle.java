/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap_puzzle;

import java.util.Scanner;

/**
 *
 * @author raka
 */
public class Swap_puzzle {

    /**
     * @param args the command line arguments
     */
    
    public  static int board [][] = new int [3][3];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int angka [] = new int [9];
        int a =0,x=0,y=0;
        System.out.println(" masukan angka :");
        while(a<9){
            while(x<3){
                while(y<3){
                    board [x][y] = in.nextInt();
                    y++;
                }
                y=0;
                x++;
            }
            a++;
        }
        tampil();
    }
    public static void tampil(){
        int a=0, x=0, y=0;
        while(x<3){
            while(y<3){
                System.out.print(" "+board[x][y]);
                y++;
            }
            y=0;
            System.out.println("");
            x++;
        }
    }
    
}

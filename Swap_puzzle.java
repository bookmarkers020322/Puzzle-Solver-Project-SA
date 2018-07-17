package swap_puzzle;
import java.util.Scanner;
public class Swap_puzzle {
    public static tools aste = new tools ();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =0,x=0,y=0;
        System.out.println("Masukkan angka : ");
        while(a<9){
            while(x<3){
                while(y<3){
                    aste.setboard(x,y,in.nextInt());
                    y++;
                }
                y=0;
                x++;
            }
            a++;
        }
        tampil();
        aste.cari();
        tampil();
    }
    public static void tampil(){
        int a=0, x=0, y=0;
        while(x<3){
            while(y<3){
                System.out.print(" "+aste.getboard(x,y));
                y++;
            }
            y=0;
            System.out.println("");
            x++;
        }
    }
    public static void cari(){
        int a=0, x=0, y=0,target=1;
        while(a<100){
            while(x<3){
                while(y<3){
                    if(board[x][y]==target){
                        simpan[0] = x;
                        simpan[1] = y;
                        System.out.println("posisi "+target+" ada di koordinat "+simpan[0]+" dan "+simpan[1]);
                        target++;
                        y=3;
                        x=3;
                    }
                    y++;
                }
                y=0;
                System.out.println("");
                x++;
            }
            
            a++;
            x=0;
            System.out.println(target);
            System.out.print(".");
        }
    }
    
}

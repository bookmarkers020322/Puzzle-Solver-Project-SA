package swap_puzzle;

public class tools {
    public static int board [][] = new int [3][3];
    public static int ix=0,iy=0;
    public static int simpan[]=new int[2];
    
    public void setboard(int x,int y,int isi){
        board[x][y]=isi;
    }
    public int getboard(int x,int y){
        return board [x][y];
    }
    public void cari(){
        int a=0, x=0, y=0,target=1;
        while(a<100){
            while(x<3){
                while(y<3){
                    if(board[x][y]==target){
                        simpan[0] = x;
                        simpan[1] = y;
                        penempatan(x,y,target);
                        target++;
                        break;
                    }
                    y++;
                }
                y=0;
                x++;
            }
            
            a++;
            x=0;
        }
    }
    public void penempatan(int x,int y,int target){
        Swap_puzzle yu = new Swap_puzzle();
        int yy=y,xx=x;
        while(y!=iy){
            if(y>iy){
                y--;
                System.out.println("Kiri");
            }else{
                y++;
                System.out.println("Kanan");
            }
            
            board[xx][yy]=board[x][y];
            board[x][y]=target;
            System.out.println(board[x][y]);
            yu.tampil();
            xx=x;yy=y;
        }
        while(x!=ix){
            if(x>ix){
                x--;
                System.out.println("Atas");
            }else{
                x++;
                System.out.println("Bawah");
            }
            
            board[xx][yy]=board[x][y];
            board[x][y]=target;
            System.out.println(board[x][y]);
            yu.tampil();
            xx=x;yy=y;
        }
        if(iy==2){
            iy=0;
            ix++;
        }else{iy++;}
        

    }
    
}

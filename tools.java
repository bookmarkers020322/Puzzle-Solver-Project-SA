package swap_puzzle;

public class tools {
    public static int board [][] = new int [3][3];
    public static int rules [][] = {{1,2,3},{4,5,6},{7,8,9}};
    public static int ix=0,iy=0;
    //public static int target [][] = new int [1][1];
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
                        System.out.println("posisi "+target+" ada di koordinat "+simpan[0]+" dan "+simpan[1]);
                        penempatan(x,y,target);
                        target++;
                        break;
//                        y=3;
//                        x=3;
                    }
                    y++;
                }
                y=0;
                //System.out.println("");
                x++;
//                break;
            }
            
            a++;
            x=0;
            //System.out.println(target);
            //System.out.print(".");
        }
    }
    public void penempatan(int x,int y,int target){
        Swap_puzzle yu = new Swap_puzzle();
        int langsir,yy=y,xx=x;
        System.out.println("koordinat seharus nya "+ix+" dan "+iy);
        while(y!=iy){
//            y++;
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
        if(iy==2){
            iy=0;
            ix++;
        }else{iy++;}
        

    }
    
}

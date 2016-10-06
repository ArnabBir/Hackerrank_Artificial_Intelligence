import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void next_move(int posr, int posc, String[] board){
        int [] xpos, ypos, distance = new int [board.length];
        //int ypos[board.length], distance[board.length];
        int min_index = -1;
        for (int i = 0; i < board.length; ++i ){
            if(board[i].contains("b")){ posr = i; posc = board[i].indexOf("b"); break;}
            xpos[i] = -1;
            ypos[i] = -1;
        }
        for (int i = 0; i < board.length; ++i ){
            xpos[i] = -1;
            ypos[i] = -1;
            if(board[i].contains("d") && ypos[i] == -1){ ypos[i] = i; xpos[i] = board[i].indexOf("d"); break;}
            distance[i] = Math.abs(xpos[i] - posr) + Math.abs(ypos[i] - posc);
            if(distance[min_index] > distance[i]) min_index = i;
        }
        if( posr < xpos[min_index] && posr != xpos[min_index]){ System.out.println("RIGHT"); ++posr; return;}
        if( posr > xpos[min_index] && posr != xpos[min_index]){ System.out.println("LEFT"); --posr; return;}
        if( posc < ypos[min_index] && posc != ypos[min_index]){ System.out.println("DOWN"); ++posc; return;}
        if( posc > ypos[min_index] && posc != ypos[min_index]){ System.out.println("UP"); --posc; return;}
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] pos = new int[2];
        String board[] = new String[5];
        for(int i=0;i<2;i++) pos[i] = in.nextInt();
        for(int i=0;i<5;i++) board[i] = in.next();
        next_move(pos[0], pos[1], board);
    }
}

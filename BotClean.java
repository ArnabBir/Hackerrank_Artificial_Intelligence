import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static void next_move(int posr, int posc, String[] board){
        int [] xpos = new int [board.length];
        int [] ypos = new int [board.length];
        int [] distance = new int [board.length];
        int min_index = 0, count = 0;
        boolean flag = false;
        if(count == 0)
        for (int i = 0; i < board.length; ++i ){
            if(board[i].contains("b")){ flag = true; posc = i; posr = board[i].indexOf("b"); break;}
        }
        
        
       
        for (int i = 0; i < board.length; ++i ){
            //xpos[i] = 0;
            //ypos[i] = 0;
            distance[i] = 99999999;
            if(board[i].contains("d")){ ypos[i] = i; xpos[i] = board[i].indexOf("d");}
            distance[i] = Math.abs(xpos[i] - posr) + Math.abs(ypos[i] - posc);
            if(distance[min_index] >= distance[i]) min_index = i;
        }
        if(!flag){
            System.out.println("CLEAN");
            ++count;
            xpos[min_index] = 99999999;
            ypos[min_index] = 99999999;
            distance[min_index] = 99999999;
            return;
        }
        if( posr == xpos[min_index] && posc == ypos[min_index]){
            System.out.println("CLEAN");
            distance[min_index] = 99999999;
            return;
        }
        else if( posr < xpos[min_index]){ System.out.println("RIGHT");  return;}
        else if( posr > xpos[min_index]){ System.out.println("LEFT"); return;}
        else if( posc < ypos[min_index]){ System.out.println("DOWN"); return;}
        else if( posc > ypos[min_index]){ System.out.println("UP"); return;}
        else{System.out.println("CLEAN");distance[min_index] = 99999999;}
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

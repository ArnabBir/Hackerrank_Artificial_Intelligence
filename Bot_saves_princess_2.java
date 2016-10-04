import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
static void nextMove(int n, int r, int c, String [] grid){
    int xp = -1, yp = -1;
    for(int i = 0; i < n; ++i){
        if(grid[i].contains("p") && yp == -1){ yp = i; xp = grid[i].indexOf("p"); break;}
    }
    for(int i = 0; i < n; ++i){
        if(grid[i].contains("m") ){ c = i; r = grid[i].indexOf("m"); break;}
    }

    if( r < xp && r != xp){ System.out.println("RIGHT"); ++r; return;}
    if( r > xp && r != xp){ System.out.println("LEFT"); --r; return;}
    if( c < yp && c != yp){ System.out.println("DOWN"); ++c; return;}
    if( c > yp && c != yp){ System.out.println("UP"); --c; return;}
}
    
public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];


        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

    nextMove(n,r,c,grid);

    }
}

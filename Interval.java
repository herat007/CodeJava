import java.util.*;
import java.lang.*;
import java.io.*;

public class Interval {
    public int start;
    public int end;
    
    public Interval(int start, int end){
        this.start = start;
        this.end = end;
    }
    
    public String toString(){
        return "["+start+","+end+"]";
    }
    
    public int getStart(){
        return start;
    }
    
    public int getEnd(){
        return end;
    }
}


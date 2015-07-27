 /* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Check if two words is an anagrams or not. */
class IntervalProblem
{
    
    private static class Interval {
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
	public static void main (String[] args) throws java.lang.Exception
	{
		Interval[] intervals = {new Interval(6,8), new Interval(1,9), new Interval(2,4), new Interval(4,7)};
		
		Arrays.sort(intervals,new IntervalComparator());
		java.util.Stack<Interval> s = new java.util.Stack<Interval>();
		
		s.push(intervals[0]);
		List<Interval> overlapping = new ArrayList<Interval>();
		
		for (int i = 1 ; i < intervals.length; i++)
        {
        // get interval from stack top
            Interval top = s.peek();
     
            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end > intervals[i].start)
            {
                
                overlapping.add( intervals[i] );
            }
            else if(top.end < intervals[i].start){
                s.push( intervals[i] );
            }
            // Otherwise update the ending time of top if ending of current 
            // interval is more
            else if (top.end < intervals[i].end)
            {
                top.end = intervals[i].end;
                s.pop();
                s.push(top);
            }
        }
		System.out.println(overlapping);
		System.out.println(s);
	}
	
	private static class IntervalComparator<Interval> implements Comparator<Interval> {
 
    // 	Interval[] intervals;
     
    // 	public IntervalComparator(Interval[] intervals) {
    // 		this.intervals = intervals;
    // 	}
        @Override
    	public int compare(Interval i1, Interval i2) {
    		return (i1.start - i2.start);
    	}
    }
}




import java.util.*;
import java.lang.*;
import java.io.*;
class IntervalComparator<Interval> implements Comparator<Interval> {
 
	Interval[] intervals;
 
	public IntervalComparator(Interval[] intervals) {
		this.intervals = intervals;
	}
 
	public int compare(Interval i1, Interval i2) {
		return (i1.getStart() < i2.getStart())? 1: 0; 
	}
}
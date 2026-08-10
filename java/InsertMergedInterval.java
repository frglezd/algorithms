import java.util.*;

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
};

class InsertMergedInterval {

  public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
    List<Interval> mergedIntervals = new ArrayList<>();

    if(intervals.size()<1){
      mergedIntervals.add(newInterval);
      return mergedIntervals;
    }

    //list is already sorted, so we can just add the new interval and sort again

    for(Interval item: intervals){
      if(item.end < newInterval.start ){
        mergedIntervals.add(item);      
      } else if(item.start > newInterval.end){ //no overlap, so we can add the new interval and swap it with the current item
        mergedIntervals.add(newInterval);
        newInterval = item; //swap the new interval with the current item
      } else {
        newInterval.start = Math.min(newInterval.start, item.start);
        newInterval.end = Math.max(newInterval.end, item.end);
      }
    }
    mergedIntervals.add(newInterval);//add the last interval
    return mergedIntervals;
  }

  public static void main(String[] args) {
    InsertMergedInterval mi = new InsertMergedInterval();
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 3));
    input.add(new Interval(5, 7));
    input.add(new Interval(8, 12));
    System.out.println("Merged intervals: ");
    for (Interval interval : mi.insert(input, new Interval(4, 6)))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
  }
}

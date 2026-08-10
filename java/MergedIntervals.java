import java.util.*;

  class Interval {
    int start;
    int end;

    public Interval(int start, int end) {
      this.start = start;
      this.end = end;
    }
  };

class MergedIntervals {

  public List<Interval> merge(List<Interval> intervals) {
    List<Interval> mergedIntervals = new LinkedList<Interval>();
    if(intervals.size()<2)
      return intervals;

    Interval l;

    intervals.sort((a,b) -> Integer.compare(a.start, b.start));
    for (Interval item : intervals) {
      System.out.println(item.start + " " + item.end);
    }

    l = intervals.get(0);
    for (Interval item : intervals) {
      if(item.start <= l.end){
        l.end = Math.max(l.end, item.end);
      } else {
        mergedIntervals.add(l);
        l = item;
      }
    }
    mergedIntervals.add(l);
    return mergedIntervals;
  }

    public int[][] mergeArray(int[][] intervals) {

    if(intervals.length < 2)
      return new int[0][0];
    
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));


    List<int[]> mergedIntervals = new LinkedList<>();
    int[] l = intervals[0];

    for (int[] item : intervals) {
      if(item[0] <= l[1]){
        l[1] = Math.max(l[1], item[1]);
      } else {
        mergedIntervals.add(l);
        l = item;
      }
    }
    mergedIntervals.add(l);

    return mergedIntervals.toArray(new int[mergedIntervals.size()][]);
  }

  public static void main(String[] args) {
    MergedIntervals mi = new MergedIntervals();
    List<Interval> input = new ArrayList<Interval>();
    input.add(new Interval(1, 4));
    input.add(new Interval(2, 5));
    input.add(new Interval(7, 9));
    System.out.println("Merged intervals: ");
    for (Interval interval : mi.merge(input))
      System.out.print("[" + interval.start + "," + interval.end + "] ");
  }
}
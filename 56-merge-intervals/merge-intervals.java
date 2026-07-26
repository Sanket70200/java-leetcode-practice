class Solution {
    public int[][] merge(int[][] intervals) {
      if(intervals.length<=1){
        return intervals;
      }

      Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));

      List <int[]> list=new ArrayList<>();
      int [] newintervals=intervals[0];
      list.add(newintervals);

      for(int [] interval:intervals){
        if(interval[0]<=newintervals[1]){
            newintervals[1]=Math.max(newintervals[1],interval[1]);
        }else{
            newintervals=interval;
            list.add(newintervals);
        }
      }

      return list.toArray(new int[list.size()][]);
    }
}
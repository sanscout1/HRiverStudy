package Java_Lecture.About_Collection.about_Comparator.ExComparator;

public class SampleNumber implements Comparable<SampleNumber>{
    private int first;
    private int second;
    private int third;

    public SampleNumber(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "SampleNumber{" +
                "[first=" + first +
                ", [second[=" + second +
                ", [third]=" + third +
                '}';
    }

    @Override
    public int compareTo(SampleNumber o) {
        int result = Integer.compare(first,o.first);
        if(result == 0) {
            result = Integer.compare(second,o.second);
              if(result == 0){
                  result = Integer.compare(third,o.third);
              }
        }
        return result;
    }
}

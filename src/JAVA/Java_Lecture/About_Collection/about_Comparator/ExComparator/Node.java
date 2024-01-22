package JAVA.Java_Lecture.About_Collection.about_Comparator.ExComparator;

public class Node implements Comparable<Node>{

    private String content;
    private int order;

    public Node(String content, int order) {
        this.content = content;
        this.order = order;
    }



    //오름차순 기본 표현법 , this와 비교 객체 자리 바꾸면 내림차순이 된다.
    @Override
    public int compareTo(Node o) {

        return Integer.compare(order,o.order);
    }


    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                ", order=" + order +
                '}';
    }
}

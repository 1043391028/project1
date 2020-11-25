import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeueTest {
    public static void main(String[] args) {
        Deque<Integer>  que = new LinkedList<>();
        que.addFirst(1);
        que.addFirst(2);

        int n = ((LinkedList<Integer>) que).get(1);

        System.out.println(que.getFirst());
        System.out.println(que.getLast());

        que.peek();
        System.out.println(que.getFirst());
        System.out.println(que.getLast());

       n = que.element();
        System.out.println(n);

    }

}

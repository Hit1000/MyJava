package Basic.collectionFramework;
import java.util.*;
/*
it is a sub type of queue interface the deque support adding and removel at both end of ds
therefor it is used as a stack as well as queue
1. it faster than LL and stack
2. null element is not allowed in deque
3. unlike queue we can add and remove from both side

 */
public class deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d = new ArrayDeque<>();
        d.offer(3);
        d.offerFirst(33);
        d.offerLast(23);
        d.offer(2);
        System.out.println(d);

    }
}

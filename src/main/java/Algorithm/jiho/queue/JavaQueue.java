package Algorithm.jiho.queue;

import java.util.LinkedList;
import java.util.Queue;
public class JavaQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // enqueue
        // offer, add - enQueue에 해당하는 메서드
        // queue가 가득 차 있다면: offer는 false를 반환, add는 예외 발생
        queue.offer(1);
        queue.add(2);

        // dequeue
        // remove, poll - deQueue에 해당하는 메서드
        // Queue가 비어 있다면: poll는 null을 반환, remove는 예외 발생
        System.out.println(queue.remove());
        System.out.println(queue.poll());

        // peek
        // element, peek - peek에 해당하는 메서드
        // peek가 비어있다면: peek는 null을 반환, element는 예외 발생
        System.out.println(queue.peek());   // null
        System.out.println(queue.element());    // 예외 발생
    }

}

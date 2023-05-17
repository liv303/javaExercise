package week5.day3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StackEx {

    private int[] arr = new int[10]; // 스택의 길이를 미리 지정
    private int pointer = 0;    // 값을 넣는 시점 기준
    public void push(int value) {
        this.arr[pointer++] = value;    // 값을 넣은 후 포인터 1 증가
        System.out.println(Arrays.toString(arr) + "  pointer = " + pointer);
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }
    public int pop() {
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");

        // return this.arr[--pointer];
        int temp = this.arr[pointer - 1];
        pointer--;
        return temp;
    }

    public int peek() {
        /*
        push(10);
        0  1
        10 0(pointer: 1)
        0이 출력됨. 따라서 pointer - 1 해야 함 */
        if(isEmpty()) throw new RuntimeException("스택이 비었습니다.");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        StackEx st = new StackEx();
        st.push(10);
        st.push(20);
        System.out.println("- pop: " + st.pop());
        //System.out.println(st.pop());   // Array는 음수 값이 없기 때문에 Array Index Out Of Bounds Exception
        System.out.println("- isEmpty: " + st.isEmpty());
        System.out.println("- peek: " + st.peek());
    }
}

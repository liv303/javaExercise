package Algorithm.jiho;

public class MyStack {
    // 스택에 실제 데이터가 저장되는 곳
    private final int[] arr = new int[16];
    // 현재 스택의 최고점을 파악하기 위한 top
    private int top = -1;

    public MyStack(){}

    // push: 데이터를 스택의 제일 위에 넣는 메서드. arr[++top] = data;
    public void push(int data) {
        // 0. arr가 가득 찼는지 확인
        if (arr.length - 1 == top) {
            throw new RuntimeException("stack is full");
        }
        // 1. top++;
        top++;
        // 2. arr[tp]에 data 할당
        arr[top] = data;
    }

    // pop: 데이터를 스택의 제일 위에서 회수하는 메서드. return arr[top--];
    public int pop() {
        // 0. arr가 비어 있는가(top 기준)
        if (top == -1) {
            throw new RuntimeException("stack is empty");
        }
        // 1. arr[top]의 값을 임시 저장
        int temp = arr[top];
        // 2. top의 값 1 감소
        top--;
        // 3. 임시 저장했던 값을 반환
        return temp;
    }

    // peek: return the top of stack without removing
    // without removing => do not change top
    public int peek() {
        // 0. check if stack not empty
        if (isEmpty()) {
            throw new RuntimeException("stack is empty");
        }
        // 1. return arr[top];
        return arr[top];
    }

    // isEmpty: check if stack is empty
    public boolean isEmpty() {
        // stack is empty when top == -1
        return top == -1;
    }


    public static void main(String[] args) {
        // 스택에 3개의 데이터를 넣었다가 빼기
        MyStack intStack = new MyStack();
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        System.out.println(intStack.pop()); // 7
        System.out.println(intStack.pop()); // 5
        System.out.println(intStack.isEmpty()); // false
        System.out.println(intStack.peek());    // 3
        System.out.println(intStack.pop()); // 3
    }
}

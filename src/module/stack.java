package module;

public class stack {
    /*
    200529 jhpark Stack 자료 구조 구현
    1. Stack 클래스 구현
    2. 해당 클래스 생성시 정해진 메모리 크기를 동적 할당
    3. Stack을 제어할 메소드 (push, pop) 구현
    */
    private final int[] stack;
    private final int stackSize;
    private int pointer;
    public stack(int size) {
        stack = new int[size];
        stackSize = size;
        pointer = 0;
    }
    public boolean push(int value) {
        boolean result;
        if(stackSize >= pointer) {
            stack[pointer++] = value;
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public int pop() {
        int result;
        if(0 < pointer) {
            pointer--;
            result = stack[pointer];
        } else {
            result = 0;
        }
        return result;
    }
    public boolean isEmpty() {
        boolean result;
        result = 0 == pointer;
        return result;
    }
}

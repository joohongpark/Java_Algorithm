package test;

import module.stack;

public class _stackUseExample {
    static public void exec() {
        stack s = new stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

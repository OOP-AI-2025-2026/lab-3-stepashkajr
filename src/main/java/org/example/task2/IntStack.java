package org.example.task2;

public class IntStack {

    private int[] stack;
    private int count;

    public IntStack() {
        this.stack = new int[10];
        this.count = 0;
    }

    public void push(int value) {
        if (this.count == this.stack.length) {
            this.resizeStack();
        }
        this.stack[this.count] = value;
        this.count++;
    }

    public int pop() {
        if (this.isEmpty()) {
            return 0;
        }
        this.count--;
        return this.stack[this.count];
    }

    public int peek() {
        if (this.isEmpty()) {
            return 0;
        }
        return this.stack[this.count - 1];
    }

    public int size() {
        return this.count;
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public void clear() {
        this.count = 0;
    }
    private void resizeStack() {
        int[] newStack = new int[this.stack.length * 2];
        for (int i = 0; i < this.stack.length; i++) {
            newStack[i] = this.stack[i];
        }
        this.stack = newStack;
    }
}

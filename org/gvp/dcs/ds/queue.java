package org.gvp.dcs.ds;

public class queue {
    private int[] queue;
    private int front, rear, size, capacity;

    public queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue Overflow!");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            size++;
            System.out.println(value + " enqueued to queue");
        }
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow!");
            return -1;
        } else {
            int value = queue[front];
            front = (front + 1) % capacity;
            size--;
            System.out.println(value + " dequeued from queue");
            return value;
        }
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty!");
            return -1;
        } else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

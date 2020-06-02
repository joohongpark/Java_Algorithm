package module;

public class QueueByArray {
    private int[] queue;
    private int frontPointer;
    private int rearPointer;
    private int queueSize;
    public QueueByArray(int size) {
        queue = new int[size];
        queueSize = size;
        frontPointer = -1;
        rearPointer = -1;
    }
    public boolean isEmpty() {
        return (frontPointer == -1 && rearPointer == -1);
    }
    public boolean isFull() {
        return ( (rearPointer + 1 == frontPointer) || (frontPointer == 0 && rearPointer + 1 == queueSize) );
    }
    public boolean enqueue(int data) {
        boolean returnValue = true;
        if(isEmpty()) {
            frontPointer = 0;
            rearPointer = 0;
            queue[rearPointer] = data;
        } else if (isFull()) {
            returnValue = false;
        } else if (rearPointer + 1 == queueSize && frontPointer != 0) {
            rearPointer = 0;
            queue[rearPointer] = data;
        } else {
            rearPointer++;
            queue[rearPointer] = data;
        }
        return returnValue;
    }
    public int dequeue() {
        int returnValue = 0;
        if(!isEmpty()) {
            if( (frontPointer == 0 && rearPointer == 0) || (frontPointer + 1 == queueSize && rearPointer != 0) ) {
                returnValue = queue[frontPointer];
                frontPointer = -1;
                rearPointer = -1;
            } else {
                returnValue = queue[frontPointer];
                frontPointer++;
            }
        }
        return returnValue;
    }
    public int getFrontValue() {
        int returnValue = 0;
        if(!isEmpty()) {
            returnValue = queue[frontPointer];
        }
        return returnValue;
    }
    public int usedSize() {
        int returnValue;
        if(isEmpty()) {
            returnValue = 0;
        } else if(isFull()) {
            returnValue = queueSize;
        } else if(frontPointer <= rearPointer) {
            returnValue = rearPointer - frontPointer + 1;
        } else {
            System.out.println(frontPointer + " " + rearPointer);
            returnValue = (queueSize - frontPointer) + rearPointer + 1;
        }
        return returnValue;
    }
}

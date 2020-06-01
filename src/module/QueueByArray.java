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
    public boolean enqueue(int data) {
        boolean returnValue = true;
        if( (( (rearPointer + 1) == queueSize) && (frontPointer == 0) ) // front가 0이고 rear가 배열 크기만큼 차 있을때
                || (rearPointer == (frontPointer - 1) ) ) // 또는 rear가 front가 같은 위치를 가리킬때 큐는 가득 참.
        {
            returnValue = false;
        }
        else if (frontPointer == -1) // 초기값 예외를 위함.
        {
            frontPointer = rearPointer = 0;
            queue[rearPointer] = data;
        }
        else if (rearPointer == queueSize-1 && frontPointer != 0) // 서클 순환 및 front가 0이 아닐 때
        {
            rearPointer = 0;
            queue[rearPointer] = data;
        }
        else // 그외
        {
            rearPointer++;
            queue[rearPointer] = data;
        }
        return returnValue;
    }
    public void _print() {
        for(int iter : queue) {
            System.out.println(iter);
        }
    }
}

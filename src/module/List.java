package module;

public class List {
    private int[] list = new int[0];
    public void insert(int data){
        int[] tmpList = new int[list.length + 1];
        for (int i = 0; i < list.length; i++) {
            tmpList[i] = list[i];
        }
        tmpList[list.length] = data;
        list = tmpList;
    }
    public void insertAt(int index, int data){
        int[] tmpList = new int[list.length + 1];
        for (int i = 0; i < index; i++) {
            tmpList[i] = list[i];
        }
        tmpList[index] = data;
        for (int i = index + 1; i < list.length + 1; i++) {
            tmpList[i] = list[i - 1];
        }
        list = tmpList;
    }
    public int dataAt(int index){
        return list[index];
    }
    public int search(int data) {
        int index = 0;
        for (int i = 0; i < list.length; i++) {
            if(list[i] == data) {
                index = i;
                break;
            }
        }
        return index;
    }
    public void delete(int index) {
        int[] tmpList = new int[list.length - 1];
        for (int i = 0; i < index; i++) {
            tmpList[i] = list[i];
        }
        for (int i = index + 1; i < list.length; i++) {
            tmpList[i - 1] = list[i];
        }
        list = tmpList;
    }
    public int listSize() {
        return list.length;
    }
    public void _printAll() {
        for (int value : list) {
            System.out.println(value);
        }
    }
}

class DynamicArray {

    int[] arr;
    int size;
    int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {

        // Array is full
        if (size == capacity) {
            resize();
        }

        arr[size] = n;
        size++;
    }

    public int popback() {
        size--;
        return arr[size];
    }

    public void resize() {

        int[] newArr = new int[capacity * 2];

        // Copy old elements
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
        capacity = capacity * 2;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }
}
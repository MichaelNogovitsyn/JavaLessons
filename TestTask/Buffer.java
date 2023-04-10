/**
 * Buffer
 */
public class Buffer {

    public CircularBuffer(int capacity) {
        this.capacity = (capacity < 1) ? DEFAULT_CAPACITY : capacity;
        this.data = (E[]) new Object[this.capacity];
        this.readSequence = 0;
        this.writeSequence = -1;
    }


public boolean offer(E element) {
    boolean isFull = (writeSequence - readSequence) + 1 == capacity;
    if (!isFull) {
        int nextWriteSeq = writeSequence + 1;
        data[nextWriteSeq % capacity] = element;
        writeSequence++;
        return true;
    }
    return false;
}
@Test
public void givenCircularBuffer_whenAnElementIsEnqueued_thenSizeIsOne() {
    CircularBuffer buffer = new CircularBuffer<>(defaultCapacity);

    assertTrue(buffer.offer("Square"));
    assertEquals(1, buffer.size());
}
public E poll() {
    boolean isEmpty = writeSequence < readSequence;
    if (!isEmpty) {
        E nextValue = data[readSequence % capacity];
        readSequence++;
        return nextValue;
    }
    return null;
}
@Test
public void givenCircularBuffer_whenAnElementIsDequeued_thenElementMatchesEnqueuedElement() {
    CircularBuffer buffer = new CircularBuffer<>(defaultCapacity);
    buffer.offer("Triangle");
    String shape = buffer.poll();

    assertEquals("Triangle", shape);
}
private volatile int writeSequence = -1, readSequence = 0;

public void run() {
    for (int i = 0; i < items.length;) {
        if (buffer.offer(items[i])) {
           System.out.println("Produced: " + items[i]);
            i++;
        }
    }
}
}
package Question3;
public class Queue { 
	 private int[] numbers; 
	 private int front; 
	 private int rear; 
	 private int nItems; 
	 private int maxSize; 
	 public Queue(int maxSize) { 
	 this.maxSize = maxSize; 
	 numbers = new int[maxSize]; 
	 front = 0; 
	 rear = -1; 
	 nItems = 0; 
	 } 
	 public boolean isEmpty() { 
	 return nItems == 0; 
	 } 
	 public boolean isFull() { 
	 return nItems == maxSize; 
	 } 
	 public int peek() { 
	 if (isEmpty()) { 
	 throw new IllegalStateException("Queue is empty. Cannot  peek."); 
	 } 
	 return numbers[front]; 
	 } 
	 public void enqueue(int value) { 
	 if (isFull()) { 
	 throw new IllegalStateException("Queue is full. Cannot  enqueue element " + value); 
	 } 
	 if (rear == maxSize - 1) { 
	 rear = -1; // Wrap around 
	 } 
	 numbers[++rear] = value; 
	 nItems++; 
	 }
	 public int dequeue() { 
	 if (isEmpty()) { 
	 throw new IllegalStateException("Queue is empty. Cannot  dequeue."); 
	 } 
	 int frontValue = numbers[front++]; 
	 if (front == maxSize) { 
	 front = 0; // Wrap around 
	 } 
	 nItems--; 
	 return frontValue; 
	 } 
	 public static void main(String[] args) { 
	 Queue numQueue = new Queue(4); 
	 numQueue.enqueue(0); 
	 numQueue.enqueue(1); 
	 numQueue.enqueue(2); 
	 numQueue.enqueue(3); 
	 numQueue.dequeue(); 
	 System.out.println("Front element: " + numQueue.peek());  System.out.println("Size of the queue: " + numQueue.nItems); 
	 // Printing all elements in the queue 
	 while (!numQueue.isEmpty()) { 
	 System.out.println(numQueue.dequeue()); 
	 } 
	 } 
	} 




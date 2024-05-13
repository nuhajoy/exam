package Question2;
public class Stack {
    int[] numArray;
    int top;
    int size;

    public Stack(int maxSize) {
        numArray = new int[maxSize];
        this.top = -1;
        this.size = 0;
    }

    public void push(int num) {
        if (!isFull()) {
            numArray[++top] = num;
            size++;
        } else {
            System.out.println("Full");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            size--;
            return numArray[top--];
        } else {
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return numArray[top];
        } else {
            return -1;
        }
    }

    public boolean isFull() {
        return size == numArray.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(numArray[i] + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        Stack numbers = new Stack(4);
        numbers.push(0);
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        numbers.pop();

        numbers.show();

        

    }
   
        
    
    
}

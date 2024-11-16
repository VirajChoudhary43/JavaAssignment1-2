import java.util.Scanner;

public class Assignment1_26 {
    private int[] queue;
    private int front, rear, capacity;
    public QueueUsingArray(int size) {
        capacity = size;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add more elements.");
        } else {
            rear = (rear + 1) % capacity;
            queue[rear] = value;
            System.out.println("Enqueued " + value + " to the queue.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty.");
            return -1; 
        } else {
            int dequeuedValue = queue[front];
            front = (front + 1) % capacity;
                        return dequeuedValue;
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;  
        } else {
            return queue[front];
        }
    }

    public boolean isEmpty() {
        return front == (rear + 1) % capacity;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    public int size() {
        return (rear - front + 1 + capacity) % capacity;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        QueueUsingArray queue = new QueueUsingArray(5);

        while (true) {
            System.out.println("\nQueue Operations Menu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Check if Queue is Full");
            System.out.println("6. Get Queue Size");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the element to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;

                case 2:
                    int dequeuedValue = queue.dequeue();
                    if (dequeuedValue != -1) {
                        System.out.println("Dequeued " + dequeuedValue + " from the queue.");
                    }
                    break;

                case 3:
                    int frontValue = queue.peek();
                    if (frontValue != -1) {
                        System.out.println("Front element is " + frontValue);
                    }
                    break;

                case 4:
                    if (queue.isEmpty()) {
                        System.out.println("The queue is empty.");
                    } else {
                        System.out.println("The queue is not empty.");
                    }
                    break;

                case 5:
                    if (queue.isFull()) {
                        System.out.println("The queue is full.");
                    } else {
                        System.out.println("The queue is not full.");
                    }
                    break;

                case 6:
                    System.out.println("The current queue size is: " + queue.size());
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        }
    }
}

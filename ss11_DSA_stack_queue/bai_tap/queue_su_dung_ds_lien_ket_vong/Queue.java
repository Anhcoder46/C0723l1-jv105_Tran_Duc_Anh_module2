public class Queue implements Solution {
    public Node front; // Phần tử được đưa vào đâu tiên trong hàng đợi
    public Node rear; // Phần tử được đưa vào cuối cùng trong hàng đợi

    public Queue() {
        front = null;
        rear = null;
    }

    @Override
    public void enQueue(int key) {
        Node n = new Node(key);
        if (rear == null) {
            front = rear = n;
        }
        else {
            rear.link = n;
            rear = n;
        }
    }

    @Override
    public void deQueue() {
        if (front == null) {
            System.out.println("Rỗng");
        }
        else {
            System.out.println(this.front.data);
        }
    }

    @Override
    public void displayQueue() {

    }
}

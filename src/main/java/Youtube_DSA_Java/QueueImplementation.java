package Youtube_DSA_Java;

class QueueUsingArray{
    int rear_q,front_q;
    int capacityOfQueue;
    static int[] q1;

    QueueUsingArray(int size){
        capacityOfQueue = size;
        q1 = new int[capacityOfQueue];
    }

    void enqueue(int value){
        if(rear_q == capacityOfQueue)
            System.out.println("Queue is full can't insert more elements");
        else
            q1[rear_q] = value;
            rear_q++;
    }

    void dequeue(){
        if(rear_q==0)
            System.out.println("Queue is Empty can't delete any element");
        else{
            for (int i = 0; i < rear_q-1; i++) {
                q1[i]=q1[i+1];
            }
            rear_q--;
        }
    }

    void display(){
        if(rear_q==0)
            System.out.println("Nothing to Display");
        else{
            for (int i = 0; i < rear_q; i++) {
                System.out.print(q1[i]+" ");
            }
        }
    }

}
public class QueueImplementation {
    public static void main(String[] args) {
        QueueUsingArray qA = new QueueUsingArray(5);
        qA.enqueue(2);
        qA.enqueue(8);
        qA.enqueue(9);

        qA.dequeue();

        qA.display();

    }
}

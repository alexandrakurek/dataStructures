package programowanie.dataStructures.kolejka;

public class RunnerQueue {
    public static void main (String [] arg){
        Queue myQueue = new Queue();
        myQueue.enQueue(3);
        myQueue.enQueue(5);

        myQueue.show();

        myQueue.deQueue();
        myQueue.show();


    }
}

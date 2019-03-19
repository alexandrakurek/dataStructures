package programowanie.dataStructures.kolejka;

public class Queue {

    public int [] queue = new int[5]; // jakbysmy tego nie dodali bylby null pointer exception
    public int front;
    public int rear;
    public int queueSize;



    public void enQueue (int data){
        queue [rear] = data; // dodajemy na koniec kolejki
        rear = rear +1;
        queueSize= queueSize + 1;

    }
    public void show(){


        System.out.println("Elements :" + " ");
        for(int i=0; i<queueSize; i++){

            System.out.println( queue[front + i] + " "); // bo nie chcemy zaczynac od 0 tylko od poczatku (w przypadku jak cos wczesniej usuniemy)
        }
    }

    public int deQueue (){
        int data = queue[front];
        front = front +1;
        queueSize = queueSize -1;

        return data;



    }


}

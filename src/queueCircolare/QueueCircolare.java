/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queueCircolare;

/**
 *
 * @author rikid
 */
public class QueueCircolare {
    
    private int[] array;
    private int front;
    private int rear;
    private int size;

    public QueueCircolare(int lenght) {
        array = new int[lenght];
    }
    
    public int getSize(){
        return size;
    }
    
    public void enqueue(int val) throws Exception{
        if(isFull()){
            throw new Exception("La coda è piena. ");
        } 
        array[rear] = val;
        rear = (rear + 1)%array.length;
        size++;
        
    }
    
    public int dequeue() throws Exception{
        if(isEmpty()){
            throw new Exception("La coda è vuota. ");
        }
        int val = array[front];
        front = (front + 1)%array.length;
        size--;
        return val;
        
    }
    
    public boolean isFull(){
        return size == array.length;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    
    
}

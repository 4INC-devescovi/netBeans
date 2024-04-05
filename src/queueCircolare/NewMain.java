/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queueCircolare;

/**
 *
 * @author rikid
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        QueueCircolare coda = new QueueCircolare(3);
        
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            coda.enqueue(5);
            System.out.println("\nE' stato inserito un valore");
        }catch(Exception e){
            System.out.println("\nNon e' stato inserito un valore");
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            coda.enqueue(6);
            System.out.println("\nE' stato inserito un valore");
        }catch(Exception e){
            System.out.println("\nNon e' stato inserito un valore");
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            coda.enqueue(7);
            System.out.println("\nE' stato inserito un valore");
        }catch(Exception e){
            System.out.println("\nNon e' stato inserito un valore");
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            System.out.println("\ndequeue: " + coda.dequeue());
        }catch(Exception e){
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            coda.enqueue(7);
            System.out.println("\nE' stato inserito un valore");
        }catch(Exception e){
            System.out.println("\nNon e' stato inserito un valore");
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            coda.enqueue(7);
            System.out.println("\nE' stato inserito un valore");
        }catch(Exception e){
            System.out.println("\nNon e' stato inserito un valore");
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            System.out.println("\ndequeue: " + coda.dequeue());
        }catch(Exception e){
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            System.out.println("\ndequeue: " + coda.dequeue());
        }catch(Exception e){
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            System.out.println("\ndequeue: " + coda.dequeue());
        }catch(Exception e){
        }
        System.out.println("isEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
        try{
            System.out.println("\ndequeue: " + coda.dequeue());
        }catch(Exception e){
            System.out.println("\nLista vuota. ");
        }
        System.out.println("\nisEmpty: " + coda.isEmpty());
        System.out.println("isFull: " + coda.isFull());
        
        
    }
    
}

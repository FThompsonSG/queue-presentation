package com.sparta.queuepresentation;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class App
{
    public static void main( String[] args ) {

        // Create LinkedList
        LinkedList<Song> playlist = new LinkedList<>();

        // Add Songs to playlist
        playlist.add(new Song("Bullet Theory", "Funeral for a Friend", 3.23, "Casually Dressed and Deep in Conversation"));
        playlist.add(new Song("Bad Blood", "Taylor Swift", 3.48, "1989"));
        playlist.add(new Song("Dreams", "Fleetwood Mac", 4.11, "Rumours"));
        playlist.add(new Song("Angry", "The Rolling Stones", 3.30, "Hackney Diamonds"));

        // Get first and last elements
        System.out.println(playlist.getFirst());
        System.out.println(playlist.getLast());
        System.out.println("---------------------------");

        // Remove last element and print to confirm removal
        playlist.removeLast();
        System.out.println(playlist.getLast());
        System.out.println("---------------------------");

        // Add songs to front of queue and end of queue and for loop to print all elements of LinkedList
        playlist.offerFirst(new Song("Let It Be", "The Beatles", 2.90, "Let It Be"));
        playlist.offerLast(new Song("I Wonder", "Kanye West", 2.90, "Graduation"));
        for (Song song : playlist) {
            System.out.println(song);
        }
        System.out.println("---------------------------");

        // Get specific element from playlist
        System.out.println(playlist.get(1));
        System.out.println("---------------------------");


        // Create PriorityQueue
        PriorityQueue<Supermarket> supermarketQueue = new PriorityQueue<>();

        // Add Supermarkets to supermarketQueue
        supermarketQueue.add(new Supermarket("Tesco", 4.3));
        supermarketQueue.add(new Supermarket("Sainsburys", 7.9));
        supermarketQueue.add(new Supermarket("Morrisons", 2.1));
        supermarketQueue.add(new Supermarket("Waitrose", 11.5));

        // Use .size method to return the size of queue
//        System.out.println("Size of the queue: " + supermarketQueue.size());

        // Instantiate Iterator to iterate through queue
        Iterator<Supermarket> iterator = supermarketQueue.iterator();

        // While loop to print elements in order of distance using .poll which retrieves and removes head of queue
//        while (iterator.hasNext()) {
//            System.out.println("Supermarket in Queue: " + supermarketQueue.poll().toString());
//        }

    }
}

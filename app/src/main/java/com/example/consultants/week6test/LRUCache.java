package com.example.consultants.week6test;

import java.util.HashMap;

public class LRUCache {

    //node for linked list implementation, with pointers to previous and next
    class Node{
        int key;
        int value;
        Node previous;
        Node next;

        public Node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    int cacheSize;
    HashMap<Integer, Node> map;
    Node head=null;
    Node end=null;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
    }

    //when node is accessed, remove from its position in the linked list, and add to head
    public int get(int key) {
        if(map.containsKey(key)){
            Node n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }

        return -1;
    }

    //removing node, updates previous and next pointers
    public void remove(Node n){
        if(n.previous != null){
            n.previous.next = n.next;
        }else{
            head = n.next;
        }

        if(n.next != null){
            n.next.previous = n.previous;
        }else{
            end = n.previous;
        }

    }

    public void setHead(Node n){
        n.next = head;
        n.previous = null;

        if(head!=null){
            head.previous = n;
        }

        head = n;

        if(end == null)
            end = head;
    }

    //sets value into the LRU cache
    public void set(int key, int value) {
        //if value is already contained, just move this node that was accessed to the head
        if(map.containsKey(key)){
            Node old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            //create new node (set to head) and remove the end, if the cachesize is full
            Node created = new Node(key, value);
            if(map.size() >= cacheSize){
                map.remove(end.key);
                remove(end);
                setHead(created);

            }else{
                setHead(created);
            }

            map.put(key, created);
        }
    }
}

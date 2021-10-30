package com.company;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        LList naya=new LList();

        for (int i = 0; i < n; i++) {
            naya.add(new Node(sc.nextInt()));
        }
        naya.print();
        naya.reverve();
        naya.add(new Node(100));
        System.out.println();
        naya.print();
        naya.reverve();

        System.out.println();
        naya.print();


    }//hello 1234567890
    //zwxf6ituyuni
    //xdcfvgbhnjmkl,
    //rftgyhujoikpo[lp6drcvbn
    //xtecrtvyhuoimk 
    //szxdcfyvtubiuhnokm

}
class Node{
    int data;
    Node next;
    Node(int value){
        this.data=value;
    }
    Node(){}

}
class LList{
    Node root=null;
    Node last;
    public void add(Node n){
        if(root==null){
            root=n;
            last=root;
        }
        else{
            last.next=n;
            last=last.next;
        }
    }
    public void print(){
        Node temp=root;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void reverve(){
        Node current=root;
        Node previous=null;
        while(current!=null){
            Node temp=current.next;
            current.next=previous;
            previous=current;
            current=temp;
        }
        last=root;
        root=previous;

    }
}


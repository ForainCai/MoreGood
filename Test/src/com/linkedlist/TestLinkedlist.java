package com.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

import java.util.Iterator;

public class TestLinkedlist {
	public static void main(String[] args) {  
        LinkedList<Integer> llist = new LinkedList<Integer>();  
        for (int i=0; i<100000; i++)  
//            llist.addLast(i);
        	llist.add(i);
        byCommonFor(llist) ;// ͨ��һ��forѭ��������LinkedList  
        byForEach(llist) ;  // ͨ��for-each������LinkedList  
        byIterator(llist) ; // ͨ��Iterator������LinkedList  
        byPollFirst(llist) ;    // ͨ��PollFirst()����LinkedList     
        byPollLast(llist) ; // ͨ��PollLast()����LinkedList   
        byRemoveFirst(llist) ;   // ͨ��removeFirst()����LinkedList     
        byRemoveLast(llist) ; // ͨ��removeLast()����LinkedList  
    }  
      
   
    private static void byCommonFor(LinkedList<Integer> list) {// ͨ��һ��forѭ��������LinkedList  
        if (list == null)  
            return ;  
        long start = System.currentTimeMillis();       
        int size = list.size();  
        for (int i=0; i<size; i++) {  
            list.get(i);          
        }  
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byCommonFor------->" + total+" ms");  
    }  
      
    private static void byForEach(LinkedList<Integer> list) {// ͨ��for-each������LinkedList  
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();         
        for (Integer integ:list)   
            ;   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byForEach------->" + total+" ms");  
    }  
   
    private static void byIterator(LinkedList<Integer> list) {// ͨ��Iterator������LinkedList  
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();       
        for(Iterator iter = list.iterator(); iter.hasNext();)  
            iter.next();   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byIterator------->" + total+" ms");  
    }  
   
    private static void byPollFirst(LinkedList<Integer> list) {//ͨ��PollFirst()����LinkedList     
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();  
        while(list.pollFirst() != null)  
            ;   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byPollFirst------->" + total+" ms");  
    }  
   
    private static void byPollLast(LinkedList<Integer> list) {// ͨ��PollLast()����LinkedList   
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();  
        while(list.pollLast() != null)  
            ;   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byPollLast------->" + total+" ms");  
    }  
   
    private static void byRemoveFirst(LinkedList<Integer> list) {// ͨ��removeFirst()����LinkedList  
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();  
        try {  
            while(list.removeFirst() != null)  
                ;  
        } catch (NoSuchElementException e) {  
        }   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byRemoveFirst------->" + total+" ms");  
    }  
   
    private static void byRemoveLast(LinkedList<Integer> list) {// ͨ��removeLast()����LinkedList  
        if (list == null)  
            return ;  
        long start = System.currentTimeMillis();  
        try {  
            while(list.removeLast() != null)  
                ;  
        } catch (NoSuchElementException e) {  
        }  
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byRemoveLast------->" + total+" ms");  
    } 
}

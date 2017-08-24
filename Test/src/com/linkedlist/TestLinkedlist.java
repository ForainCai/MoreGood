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
        byCommonFor(llist) ;// 通过一般for循环来遍历LinkedList  
        byForEach(llist) ;  // 通过for-each来遍历LinkedList  
        byIterator(llist) ; // 通过Iterator来遍历LinkedList  
        byPollFirst(llist) ;    // 通过PollFirst()遍历LinkedList     
        byPollLast(llist) ; // 通过PollLast()遍历LinkedList   
        byRemoveFirst(llist) ;   // 通过removeFirst()遍历LinkedList     
        byRemoveLast(llist) ; // 通过removeLast()遍历LinkedList  
    }  
      
   
    private static void byCommonFor(LinkedList<Integer> list) {// 通过一般for循环来遍历LinkedList  
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
      
    private static void byForEach(LinkedList<Integer> list) {// 通过for-each来遍历LinkedList  
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();         
        for (Integer integ:list)   
            ;   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byForEach------->" + total+" ms");  
    }  
   
    private static void byIterator(LinkedList<Integer> list) {// 通过Iterator来遍历LinkedList  
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();       
        for(Iterator iter = list.iterator(); iter.hasNext();)  
            iter.next();   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byIterator------->" + total+" ms");  
    }  
   
    private static void byPollFirst(LinkedList<Integer> list) {//通过PollFirst()遍历LinkedList     
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();  
        while(list.pollFirst() != null)  
            ;   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byPollFirst------->" + total+" ms");  
    }  
   
    private static void byPollLast(LinkedList<Integer> list) {// 通过PollLast()遍历LinkedList   
        if (list == null)  
            return ;   
        long start = System.currentTimeMillis();  
        while(list.pollLast() != null)  
            ;   
        long end = System.currentTimeMillis();  
        long total = end - start;  
        System.out.println("byPollLast------->" + total+" ms");  
    }  
   
    private static void byRemoveFirst(LinkedList<Integer> list) {// 通过removeFirst()遍历LinkedList  
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
   
    private static void byRemoveLast(LinkedList<Integer> list) {// 通过removeLast()遍历LinkedList  
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

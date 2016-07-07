package com.tdd.exercise;

import java.util.Stack;

/**
 * Created by lejeuh01 on 06/07/2016.
 */
public class RecentlyUsedList {
    Stack<String> myList;

    public RecentlyUsedList(){
    myList= new Stack<String>();
    }


    public void add(String item){
       if(myList.search(item) == -1 ){
           myList.push(item);
       }
    }

    public int size(){
        return myList.size();
    }


    public String lastIn() {
        return myList.peek();
    }


    public String retrieveAll() {
        String allitems="";
        for(String obj : myList)
        {
            allitems= allitems.concat(obj +"\n");
        }
        return allitems;
    }

}

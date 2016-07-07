package com.tdd.exercise;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * Created by lejeuh01 on 06/07/2016.
 */
public class RecentlyUsedListTest {

    RecentlyUsedList recentList= new RecentlyUsedList();

    @Test
    public void canAddAnItem(){
        recentList.add("Hello");
        assertThat(recentList.size() , is(1));
    }

    @Test
    public void addNextItemToTop(){
        recentList.add("Hello");
        recentList.add("Hello 2");
        assertThat(recentList.lastIn(), is("Hello 2"));
    }

    @Test
    public void mostRecentItemComesFirst(){
        recentList.add("Hello 1");
        recentList.add("Hello 2");
        recentList.add("Hello 3");
        assertThat(recentList.lastIn(), is("Hello 3"));
    }

    @Test
    public void duplicatesArePrevented(){
        recentList.add("Hello 1");
        recentList.add("Hello 2");
        recentList.add("Hello 3");
        recentList.add("Hello 3");
        assertThat(recentList.size(), is(3));
    }

    @Test
    public void listItems(){
        recentList.add("Hello 2");
        recentList.add("Hello 3");
        assertThat(recentList.retrieveAll(), is("Hello 2\nHello 3\n"));
    }

}

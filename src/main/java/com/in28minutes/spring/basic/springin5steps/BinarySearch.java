package com.in28minutes.spring.basic.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class BinarySearch{

    private SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm = sortAlgorithm;

    }


    public int  binarySort (int[] givenArray,int targetNumber){
        //we will use bubble sort and Quick short, so we need to implement both


        int[] sortedArrayWithBubble=  sortAlgorithm.sortArray(givenArray);



        return 3;
    }
}

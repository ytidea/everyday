package com.abchina.datastructrue;
import java.util.ListIterator;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

public class ArrayLinked {
    private final int N=10;
    private List<Integer> iL;
    public void addArrayList(ArrayList<Integer> iL){
        for(int i=0;i<N;i++){
            iL.add(Integer.valueOf(i));
 //           iL.add(0,Integer.valueOf(i));
        }
    }

    public void addLinkList(LinkedList<Integer> iL){
        for(int i=0;i<N;i++){
            iL.add(Integer.valueOf(i));
//            iL.add(0,Integer.valueOf(i));
        }
    }

    public static void removeEvent(List<Integer> iL){
        Iterator<Integer> iterator=iL.iterator();
        while(iterator.hasNext()){
            if(iterator.next()%2==0){
                iterator.remove();
            }
        }
    }

    public static void removeEventFromEndtoFront(List<Integer> iL){
        ListIterator<Integer> iterator=iL.listIterator();
        Integer i;
        while(iterator.hasPrevious()){
            i=iterator.previous();
            System.out.println(i);
            if(i%2==0){
                iterator.remove();
            }
        }
    }

    public static void printList(List<Integer> iL){
        ListIterator<Integer> listIterator = iL.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }

    public static void printListEndtoFront(List<Integer> iL){
        ListIterator<Integer> listIterator = iL.listIterator(iL.size());
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }



    public static void main(String[] args){
        LinkedList<Integer> iLink=new LinkedList<>();
        ArrayList<Integer> iArray=new ArrayList<>();
        ArrayLinked aL=new ArrayLinked();
        long beforeTime;
        long endTime;

        beforeTime=System.currentTimeMillis();
        aL.addArrayList(iArray);
        aL.addLinkList(iLink);
        endTime=System.currentTimeMillis();
        System.out.println("spend time:"+(endTime-beforeTime));

 //       printList(iArray);
        printListEndtoFront(iArray);
        beforeTime=System.currentTimeMillis();
//        removeEvent(iArray);
//        removeEvent(iLink);
        removeEventFromEndtoFront(iArray);
        endTime=System.currentTimeMillis();
        System.out.println("spend time:"+(endTime-beforeTime));

    }
}

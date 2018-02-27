package com.zzy.study;

import org.junit.Test;

import java.util.*;

/**
 * Created by Fairyland on 2018/1/31.
 */
public class SortTest {

    @Test
    public void hashMapSortTest(){
       /* Map<String,String> hashMap = new HashMap<String,String>();

        hashMap.put("ssr","小飞机");
        hashMap.put("song","歌曲");
        hashMap.put("8","八");
        hashMap.put("1","壹");
        System.out.println(hashMap);//{song=歌曲, 1=壹, ssr=小飞机, 8=八}*/

        /*hashMap.put("5","wu");
        hashMap.put("3","san");
        hashMap.put("6","liu");
        System.out.println(hashMap);//{3=san, 5=wu, 6=liu}*/

        /*hashMap.put("b","币");
        hashMap.put("a","啊");
        hashMap.put("c","吃");
        System.out.println(hashMap);//{a=啊, b=币, c=吃}*/



    }

    @Test
    public void treeMapSortTest(){
        Map<String,String> treeMap = new TreeMap<String, String>();

        treeMap.put("ssr","小飞机");
        treeMap.put("song ","歌曲");
        treeMap.put("8","八");
        treeMap.put("1","壹");
        System.out.println(treeMap);//{1=壹, 8=八, song =歌曲, ssr=小飞机}
    }

    @Test
    public void arrayListSortTest(){
        List<String> arrayList = new ArrayList<String>();

        arrayList.add("b");
        arrayList.add("a");
        arrayList.add("c");
        System.out.println(arrayList);

        Collections.sort(arrayList);
        System.out.println(arrayList);

        Collections.sort(arrayList, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });



    }




}

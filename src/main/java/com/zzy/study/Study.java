package com.zzy.study;

import org.junit.Test;

import java.text.DecimalFormat;
import java.util.*;

/**
 * Created by Fairyland on 2017/7/13.
 */
public class Study {

    @Test
    public void UUIDTest(){
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString().length());

    }

    @Test
    public void StringTest(){
        String str = "/web/static/image/";
        System.out.println(str);
        String s = "\\";
        System.out.println(s);
    }

    @Test
    public void PathTest(){

        System.out.println(System.getProperty("user.dir"));

    }

    @Test
    public void SystemTest(){
        System.out.println(System.getProperty("os.name"));
        Properties props=System.getProperties();
        System.out.println(props);

    }

    @Test
    public void SplitTest(){
        String str = "/a/b/c/d/";
        String[] ss = str.split("/");
        System.out.println(Arrays.toString(ss));
    }

    @Test
    public void MathTest(){
        double i = Math.sqrt(4);
        int a = 1;
        double b = 1.0;
        System.out.println(a == b);
    }

    @Test
    public void FormatNumberWithComma(){
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.println(df.format(1345678900));
    }

    @Test
    public void parseIntTest(){
        String s = "0023";
        int i = Integer.parseInt(s);
        System.out.println(i);
    }

    @Test
    public void arrayPrint(){
        String[] strs = {"abc","def","123","456"};
        System.out.println(strs);
        System.out.println(Arrays.toString(strs));//[abc, def, 123, 456]

    }

    @Test
    public void listPrint(){
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("ghi");
        System.out.println(list);//[abc, def, ghi]

    }

    @Test
    public void mapPrint(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("key1","value1");
        map.put("key12","value12");
        map.put("key123","value123");
        map.put(null,"1");
        map.put("h","22");
        //HashMap不保证输出顺序和放置顺序一致，LinkedHashMap可实现此需求
        System.out.println(map);//{key1=value1, null=1, key12=value12, h=22, key123=value123}


        Map<String,String> linkMap = new LinkedHashMap<String, String>();
        linkMap.put("1","aaa");
        linkMap.put("3","aaa");
        linkMap.put("2","aaa");
        linkMap.put("b","aaa");
        linkMap.put("a","aaa");
        System.out.println(linkMap);//{1=aaa, 3=aaa, 2=aaa, b=aaa, a=aaa}

    }

    @Test
    public void setPrint(){
        Set<String> set = new HashSet<String>();
        set.add("abc");
        set.add("123");
        set.add("nihao");
        System.out.println(set);//[123, abc, nihao]
    }

    @Test
    public void catchTest(){
        String[] strs = {"a","b"};
        try {
            System.out.println(strs[2]);
        }catch(Exception e){
            e.printStackTrace();
            String s = e.getMessage();
            System.out.println("异常了");
            System.out.println(s);

        }

    }

    @Test
    public void catchTest2(){

        try{//被try包裹的代码在发生异常后，不会被继续执行，会跳到try外的代码继续执行
            System.out.println(8/0);
            System.out.println(3);//发生异常后，try里的代码不再执行
        }catch(Exception e){
            e.printStackTrace();

        }
        System.out.println(2);
        System.out.println(1);
    }

    @Test
    public void addTest(){
        TestBean tb = new TestBean();
        List<TestBean> ltb = new ArrayList<TestBean>();
        for(int i=0;i<5;i++){
            try {
                tb = TestBean.class.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            tb.setCode(i+"");
            ltb.add(tb);
        }
        System.out.println(ltb);


    }

    @Test
    public void newInstanceTest(){
        List<String> sl = new ArrayList<String>();
        sl.add("123");

        try {
            List<Integer> il = ArrayList.class.newInstance();
            il.add(4);

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }


    }


    @Test
    public void RandomNumber(){
        for (int i = 0; i <8 ; i++) {
           if(i<5)
                System.out.print((int)(Math.random()*10000)+",");
           if(i>=5)
               System.out.print("?,");

        }
    }




}

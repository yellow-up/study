package com.zzy.study;

/**
 * Created by Fairyland on 2017/10/18.
 */
public class FinallyTest {
    public static void main(String... parm){
        System.out.println("这是main方法");
        try {
            FinallyTest ft = new FinallyTest();
            //int i = ft.fun1(5);
            //System.out.println("mian的输出："+i);
           // TestBean tb = new TestBean("0000");
            TestBean tb = new TestBean(null,null,new StringBuilder("9999"),0);
           // System.out.println("main的输出："+ft.fun1(tb));
           // System.out.println("main的输出："+ft.fun2(tb));
            System.out.println("main的输出："+ft.fun3(tb));

           // String str = "abc";
           // ft.changeString(str);
           // System.out.println(str);//String是不可变类

            //System.out.println(ft.changeTestBean(tb));

            StringBuilder sb = new StringBuilder("0000");
            ft.changeSb(sb);
           // System.out.println(sb);
            int i = 9;
            ft.changeInt(i);
//            System.out.println(i);

            Integer in = 9;
            ft.changeInteger(in);
           // System.out.println(in);

        }catch(Exception e){

        }finally {

        }
    }

    public int fun1(int i){
        try {
            //返回的是i的copy，在finally里操作i不会对这里的返回值造成影响
            return i;

        }finally {
            ++i;
            System.out.println(i);
            System.out.println("进入了finally");
            //这里在再进行返回时，返回的就是操作后的i了。
            //return i;
        }
    }

    public TestBean fun1(TestBean tb){

        try {
            //返回的是对象引用的copy
            return tb;

        }finally {
            tb.setCode("九死一生");
            System.out.println(tb);
            System.out.println("进入了finally");
        }
    }

    public int fun2(TestBean tb){
        try {
            //返回的是对象引用的copy
            return tb.getNum();

        }finally {
            tb.setCode("九死一生");
            tb.setNum(999);
            System.out.println(tb);
            System.out.println("进入了finally");
        }

    }

    public Object fun3(TestBean tb){
        try {
            //返回的是对象引用的copy
            return tb.getData();

        }finally {
            tb.setCode("九死一生");
            tb.setNum(999);
            ((StringBuilder)tb.getData()).append("changed");
            System.out.println(tb);
            System.out.println("进入了finally");
        }
    }



    public String changeString(String str){//

        return str+"_changed";//Stirng是不可变类，操作str时会创建一个新对象，此时返回的是新对象的引用，主方法里的str仍指向原先的对象。
    }

    public TestBean changeTestBean(TestBean tb){
        tb.setCode(tb.getCode()+"_chenged");
        return  tb;
    }

    public StringBuilder changeSb(StringBuilder sb){
        sb.append("_changed");
        return sb;

    }

    public int changeInt(int i){

        return ++i;
    }

    public Integer changeInteger(Integer i){
        return ++i;
    }

}

package chapter07;import java.sql.Time;import java.util.concurrent.TimeUnit;import java.util.concurrent.atomic.AtomicIntegerArray;/** * * @author tengfei.fangtf * @version $Id: AtomicIntegerArrayTest.java, v 0.1 2015-8-1 ����12:04:44 tengfei.fangtf Exp $ */public class AtomicIntegerArrayTest {    static int[]              value = new int[] { 1, 2 };    static AtomicIntegerArray ai    = new AtomicIntegerArray(value);    public static void main(String[] args) {        System.out.println(ai.get(0));        ai.getAndSet(0, 3);        System.out.println(ai.get(0));        System.out.println(value[0]);        try {            Thread.sleep(3000);        } catch (InterruptedException e) {            e.printStackTrace();        }        System.out.println(value[0]);    }}
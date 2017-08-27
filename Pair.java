package generic;

import hell.ArrayAlg;
import hell.employee;
import org.jetbrains.annotations.Contract;

import javax.swing.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/29.
 */
public class Pair<T> {
    private T a;

    public T getA() {
        return a;
    }

    public void setA(Pair<? extends employee> a) {

    }
    @Contract(pure = true)
    @SafeVarargs
    public static <E> E[] array(E... array){
        return array;
    }

    public static void main(String[] args){
        System.out.println(GenericFunc.func(1));
        GenericFunc gen=new GenericFunc();
        Pair<String> pa=new Pair<>();
        System.out.println(pa.getClass().getName());
        Pair<String>[] table=array(pa);
        Timer t = new Timer(1000,  System.out::println);
        t.start();

    }

}

class GenericFunc extends Pair<Integer>{

    public static <T extends Comparable & Serializable> String func(T a){
        return a.getClass().getName();
    }

}

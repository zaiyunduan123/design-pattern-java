package com.jiang.design.原型模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 10:57 AM
 */
public class PrototypeClass implements Cloneable {
    //覆盖父类Obejct方法
    @Override
    public  PrototypeClass clone()  {
        PrototypeClass prototypeClass = null;
        try{
            prototypeClass = (PrototypeClass) super.clone();
        }catch (CloneNotSupportedException e){
           e.printStackTrace();
        }
        return prototypeClass;
    }
}

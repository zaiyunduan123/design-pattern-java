package com.jiang.design.组合模式;

import java.util.ArrayList;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 5:44 PM
 *
 *  树枝构件
 */
public class Composite extends Component {
    //构建容器
    private ArrayList<Component> componentArrayList = new ArrayList<Component>();
    //增加一个叶子构件
    public void add(Component component){
        this.componentArrayList.add(component);
    }
    //删除一个叶子构件
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }
    //获得分支下的所有叶子构件
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }

}

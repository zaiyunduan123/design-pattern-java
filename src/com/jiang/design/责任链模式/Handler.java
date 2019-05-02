package com.jiang.design.责任链模式;

/**
 * @Author jiangyunxiong
 * @Date 2019/5/2 12:15 PM
 *
 * 抽象处理者
 */
public abstract class Handler {
    private Handler nextHandler;
    public final Response handleMessage(Request request){
        Response response =null;
        //判断是否是自己的处理级别
        if (this.getHandleLevel().equals(request.getRequestLevel())) {
            response=this.echo(request);
        }else{
            if (this.nextHandler!=null){
                response=this.nextHandler.handleMessage(request);
            }else{

            }
        }
        return response;
    }

    //设置下一个处理者是谁
    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    //每个处理者都一个处理级别
    protected abstract Level getHandleLevel();

    //每个处理都必须实现处理任务
    protected abstract Response echo(Request request);
}

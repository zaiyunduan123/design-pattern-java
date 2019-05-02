## 中介者模式
### 介绍
集中相关对象之间复杂的沟通和控制方式。

用一个中介对象封装一系列的对象交互，中介者使各对象不需要显示地互相作用，从而使其耦合松散，而且可以独立地改变他们的交互


JDK
- All scheduleXXX() methods of java.util.Timer
- java.util.concurrent.Executor#execute()
- submit() and invokeXXX() methods of java.util.concurrent.ExecutorService
- scheduleXXX() methods of java.util.concurrent.ScheduledExecutorService
- java.lang.reflect.Method#invoke()

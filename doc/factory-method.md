## 工厂方法模式
### 介绍
定义了一个创建对象的接口，但由子类决定要实例化哪个类。工厂方法把实例化操作推迟到子类。

工厂方法模式设计到一下四个角色的概念：

1. 抽象工厂角色
工厂方法模式的核心，创建产品的类必须实现该接口
2. 具体工厂角色
该角色实现了抽象工厂接口，具体如何创建产品就是在该类中实现
3. 抽象产品角色
所有产品的超类，负责实现产品共性的抽象定义
4. 具体产品角色
该角色实现了抽象产品接口，负责具体不同产品的业务逻辑

### 代码


### 优点

JDK
- java.util.Calendar
- java.util.ResourceBundle
- java.text.NumberFormat
- java.nio.charset.Charset
- java.net.URLStreamHandlerFactory
- java.util.EnumSet
- javax.xml.bind.JAXBContext

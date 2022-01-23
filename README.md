## 一.基础

1. 关键字与标识符，一般全小写的就是关键字

2. 命名规则`硬性规范`
> * 标识符包含`英文字母26个（区分大小写），0-9数字，$（美元符号）和_下划线`
> * 标识符不能以数字开头
> * 标识符不能是关键字

3. 命名规范 `软性建议`
> * 类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）
> * 变量名规范：首字母小写，后面每个单词首字母大写（小驼峰式）
> * 方法名规范：同变量名

4. 变量分类
> * 1.字符串常量
> * 2.整数常量
> * 3.浮点数常量
> * 4.字符常量
> * 5.布尔常量：true，false
> * 6.空常量：null

5. 基本格式
```java
public class DocuemtName {
    public static void main(String[] args){
    ......    
    }
}
```

6. 两个单引号之间必须有且仅有一个字符，没有不行
7. 单引号中不能有两个字符，只能有一个
8. 空常量不能直接打印输出

9. 在public变量名时候注意不能跨目录

10. 点运算符（.）将一个对象同它的某一种方法连接起来  
``` {object.method(parameters)  //method}```

11. 对象
> * 对象同时包括方法和字段（数据）
> * 类是任意数目的对象的说明
> * 创建一个对象，要将关键字new和类的名称连用 `new function`
> * 调用一个对象的方法，要使用点运算符

12. java中所有函数都属于某个类的方法，因此java中的main方法必须有一个外壳类，也就是
```
public class welcome {          //此处welcome为外壳类
    public static void main(String[] args)
    {
        ......
    }
}
```

13. java中的main方法必须是静态的

14. 需要程序结束之后运行其他内容的时候需要用到 ```System.exit```

15. ```System.out.println()```输出之后默认换行,而```System.out.print()```输出默认不换行，输出还是跟在后面

---

## 二.数据类型

| 类型 | 存储需求|取值范围                                |
|------|---------|----------------------------------------|
|int   | 4 bit   |-2147483648~2147483647                  |
|short | 2 bit   |-32768~32767                            |
|long  | 8 bit   |-9223372036854775808~9223372036854775807|
|byte  | 1 bit   |-128~127                                |.浮点型

| 类型 | 存储需求| 取值范围                                 |
|------|---------|------------------------------------------|
|float |4 bit    | ±3.40282347E+38F(有效位数为6~7)          |
|double|8 bit    | ±1.79769313486231570E+308(有效位数为15位)|
.用于表示出错的三个浮点数字
> * 正无穷大
> * 负无穷大
> * NaN(不是一个数字)
> * Math.sin
> * Math.cos
> * Math.tan
> * Math.atan
> * Math.atan2
> * Math.exp
> * Math.log
> * Math.log10
> * Math.PI
> * Math.E

1. 在使用Math函数的时候需要在顶部添加
```import static java.lang.Math.*```
2. 对浮点数进行射入运算以便于得到最接近的整数，使用Math.round（注意在对数值直接进行强制转化的时候并不会自动四舍五入）

```
public class Qzlxzh{
    public static void main(String[] args) {
        double x = 9.8127381367;
        int nx = (int) Math.round(x);
        System.out.print(nx);
    }
}           //在这里由于x值接近9，使用Math.round取值进行int强制类型转化得到10
```

```
public class Qzlxzh{
    public static void main(String[] args) {
        double x = 9.8127381367;
        int nx = (int) x;
        System.out.print(nx);
    }
}           //直接强制类型转化的时候得到值9

```

> ++n 表示在运行的时候先自增再运算
> n++ 表示在运行时先运算再自增
> 不能使用Java保留字作为变量名
> 声明变量之后必须要初始化变量方可使用，否则在C++，Java中均会报错

3. C++区分变量的声明和定义 但是Java中不区分
```
int i = 10;     //这是一个定义
extern int i = 10;      //这是一个声明
```
4. final关键字表示这个常量只能被赋值一次，常量名使用全大写
---

## 三.类与对象
1. 对象与类是Java中面向对象的两个最基本概念，一个类可以有多个对象
2. 类有两大成员：属性与方法
3. 类名需要符合Java标识符的命名规范
4. Java中允许多个类出现在同一个源文件中，但最多只能有一个类是public的，如果有一个public类，那么源文件必须与类名保持相同

5. ``` 修饰符 + 类型 + 变量名 ```来定义一个类


## 四.数组
1. 数组也是数据结构的一种，用来存储同一类型值的集合，通过下标可以访问数组中的元素。

2. 声明数组变量时需要指出数组类型（数据元素类型紧跟[]和数组变量的名字）,使用`new`运算符进行数组创建

3. 创建完一个数组并且没有附任何初值的时候那么数组中所有的元素都会初始化为0，而boolean数组的值会初始化为false，对象数组的元素会初始化为特殊值null

4. 一旦创建数组就不能改变它的大小，如果经常需要更改的话参考`数组列表（array list）`

5. 增强for循环`for each`,语法：
```java
for(variable : collection) statement
```

6. 初始化数组给值的时候可以不调用 new ，可以初始化一个<font color = red>匿名数组 </font>：`n = new int[] {1,2,3,4,5}` 这样创建的数组会利用括号中提供的值进行初始化，数组大小就是初始值的个数

7. 可以使用`=`将一个数组变量拷贝给另一个数组变量（非数组本身），这时两个变量引用的是同一个数组

8. 如果想要拷贝数组本体（也就是数组所有值）到一个新的数组中去的话就要使用`Arrays类的copyOf方法`，语法：
```java
int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length) //其中luckyNumbers.length代表所创建的新的数组的大小，通常可以使用这个方法来增加数组的大小，多余的值会被进行默认赋值
```

9. 命令行参数
每一个Java程序都带一个String arg[]参数的main方法，这个参数是可以接收一个字符串数组，也就是命令行参数
```java
public class Message
{
    public static void main(String args[])
    {
        if(args.length == 0 || args[0].equals("-h"))
            System.out.print("Hello,");
        else if(args[0].equals("-g"))
            System.out.print("Goodbye,");
        for(int i = 1; i < args.length; i++)
            System.out.print(" " + args[i]);
        System.out.println("!")
    }
}
```
!(Java命令行参数)[1.png]
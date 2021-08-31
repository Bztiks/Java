﻿# Jvav踩坑记

标签():Java

---

### 1.关键字与标识符，一般全小写的就是关键字

### 2.命名规则`硬性规范`
> * 标识符包含`英文字母26个（区分大小写），0-9数字，$（美元符号）和_下划线`
> * 标识符不能以数字开头
> * 标识符不能是关键字

### 3.命名规范 `软性建议`
> * 类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）
> * 变量名规范：首字母小写，后面每个单词首字母大写（小驼峰式）
> * 方法名规范：同变量名

### 4.变量分类
>1.字符串常量
>2.整数常量
>3.浮点数常量
>4.字符常量
>5.布尔常量：true，false
>6.空常量：null

### 5.基本格式
```
public class DocuemtName {
    public static void main(String[] args){
    ......    
    }
}
```

### 6.两个单引号之间必须有且仅有一个字符，没有不行
### 7.单引号中不能有两个字符，只能有一个
### 8.空常量不能直接打印输出

### 9.在public变量名时候注意不能跨目录

### 10.点运算符（.）将一个对象同它的某一种方法连接起来

### 11.对象
>对象同时包括方法和字段（数据）
>类是任意数目的对象的说明
>创建一个对象，要将关键字new和类的名称连用 `new function`
>调用一个对象的方法，要使用点运算符

### 12.java中所有函数都属于某个类的方法，因此java中的main方法必须有一个外壳类，也就是
```
public class welcome {
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for(int i = 0; i < greeting.length(); i++ )
            System.out.print("=");
    }
}
```
package com.company;

public class Main {

    public static void main(String[] args) {
        class Student {
            void  compare(){
               boolean a = 100>10;
               boolean b = 100<10;
               //java中, 条件成立返回true,否则返回false, 即布尔类型.
               if (a){
                   System.out.println("100<10 是对的");
               }else{
                   System.out.println("100<10是错的");
               }
            }
            void  test(){
                System.out.println("fad");
            }
        }

        /*
        * IDEA快捷键:
        *   1) IDEA能够将你光标所在地的代码,逐步向外框选,只要不停地ctrl+w;
        *   2) 定义数组之后,另起一行输入itar,按tab箭,for循环自动生成;
        *   3) ctrl+ shift + backspace, 光标会迅速移动到刚才修改的位置;
        *   4) 若开始是把光标选中某个字符串或者变量名,点击ctrl+shift+F7,idea会将所有包含该字符串的地方高亮.然后可以使用f3或者是shift+f3进行前后遍历;
        *   5) 若想查看最近访问过得文件,按Ctrl+e,出现列表,回车打开相应文件;
        *   6) 迅速查找某个东西在项目中的所有出处,只需要按住alt+F7,编辑区源代码所有引用该变量的地方就会高亮显示,同时idea下方弹出项目下查找结果列表;
        *   7) 代码批量改名: shift + f6
        */

        /*
        * java的跨平台性: 一次编译,到处运行[在windows编写的程序,无须任何修改即可在linux下运行]
                ----得力于java虚拟机[jvm],跨平台的是java程序,不是jvm[jvm是c/c++开发的,是编译后的机器码,不具备跨平台,不同平台下需要不同版本的jvm]
                ----运行之后,可以看到有编译的.class文件,此为编译生成的字节码,是不可执行的文件,字节码文件不能直接运行,必须幼jvm编译成机器码才能运行.
                ----编写的java源码,编译后会生成.class文件,称为字节码文件[java虚拟机就是负责将字节码文件翻译成特定平台下的机器码然后运行]
                ps: 编译的结果不是生成机器码,而是生成字节码,字节码不能直接运行,必须通过jvm的再次翻译才能运行.

          java的开发环境搭建
            1) jdk[java开发工具箱]--> 是一系列工具的集合,这些工具是编译java源码、运行java程序所必须的,例如jvm,基础类库,编译器,打包工具等.
            jdk提供的工具包: javac.exe[java编译器]
                           java.exe[java解释器]
                           javadoc.exe[java文档生成器]
                           jdb.exe[java调试器]
            2) java的安装中
               查看界面,有开发工具[编译器,打包工具等] + 源代码[基础类库] + 公共JRE ->默认安装,必不可少.
            3) 环境变量:
                a. cmd命令行,输入QQ,会出现"QQ"不是内部或外部命令,也不是可运行的程序或批处理文件;
                   若进入到qq安装目录下的bin文件夹下,在打开dos,再输入QQ, 就会发现弹出了QQ的登录窗口.
                b. 如何在任意目录下输入QQ就弹出QQ登录窗口??
                c. 环境变量: 用户变量[只适用于当前用户使用] + 系统变量[任何用户都可以用]
                d. 配置环境比那里之后,切记要重新开一个DOS窗口,用原来的是不行的.
        * */

        /*
        * 1) 在java中,仅仅通过类来定义变量不会分配内存空间,必须使用new 关键字来完成内存空间的分配.
        * 2) 类的实例化[图纸跟零件的关系]
        * 3) 将某个功能的代码块定义成方法,将具有相似功能的方法定义在类中,多个源文件可以位于一个文件夹---->[包].
        * 4) 包的命名: 以自己域名的倒写形式
        *    java.lang: 基础类,例如Object,Math,String,System等-->java编译器默认为所有的java程序导入JDK中的java.lang包中的所有类,其中定义了常用类,
        *               比如System,String等,因此我们可以直接使用这些类而不必显示导入,但是使用其他类必须先导入.
        *    java.util: 提供集合框架,事件模型等各种实用工具类;
        *    java.io: 系统的输入/输出
        *    其他的包不做介绍了, 需要的话请查看api官网:https://docs.oracle.com/javase/7/docs/api/
        * 5) import只能导入包所包含的类,而不能导入包,一般不导入单独的类,而是导入包下的所有的类,比如import java.util.*
        * 6) java类的文件搜索
        *
        *
        * java的数据类型以及变量的定义
        * 1) java中共有8种基本数据类型[4整型+2浮点+1字符+1布尔] ---string不包含在里面喲,需要注意的是!
        */

        Student stul = new Student();
        stul.compare();
        stul.test();
    }
}

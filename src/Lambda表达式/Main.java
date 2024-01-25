package Lambda表达式;

import Lambda表达式.entity.Study;
import Lambda表达式.entity.Study2;

/*
* 如果一个接口中有且只有一个待实现的抽象方法，那么我们可以将匿名内部类简写为Lambda表达式：
* */
public class Main {
    public static void main(String[] args) {

        Study study = (int a) -> {
            System.out.println("我是学习方法");
        };

        Study study2=(int a)-> System.out.println("我是学习方法");
        Study study3=(a -> System.out.println("hello"));

        Study2 study4=(a)->{
            System.out.println("我是学习方法");
            return "我今天学到了"+a;    //实际上这里面就是方法体，该咋写咋写
        };
        System.out.println(study4.study(10));
        test(a-> System.out.println(a));

    }
    public static void test(Study study){
        study.study(10);
    }

}


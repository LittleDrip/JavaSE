package 方法引用;

import 方法引用.entity.Study;
import 方法引用.entity.Test;

public class Main {
    public static void main(String[] args) {
        Study study=(a,b)-> a+b;
        Study study1=(a,b)->Integer.sum(a,b);//让接口的方法直接用现成的
        System.out.println(study.sum(10,20));
        /*Integer.sum的参数和返回值，跟我们在Study中定义的完全一样，所以说我们可以直接使用方法引用：*/
        Study study2=Integer::sum;  //使用双冒号来进行方法引用，静态方法使用 类名::方法名 的形式
        System.out.println(study2.sum(2,3));

//        ----------------------------------------------------------------------
        Main main=new Main();
        Test test=main::lbwnb;   //成员方法因为需要具体对象使用，所以说只能使用 对象::方法名 的形式
        System.out.println(test.study());

//        ----------------------------------------------------------------------
        Test test1=String::new;//构造方法拿来引用,没错，构造方法也可以被引用，使用new表示
        System.out.println(test1.study().isEmpty());

    }
    public  String lbwnb(){
        return "lbwnb";
    }
}

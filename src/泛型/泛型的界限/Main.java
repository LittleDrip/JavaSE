package 泛型.泛型的界限;

import 泛型.泛型的界限.entity.Score;

public class Main {
    public static void main(String[] args) {
       ///Score<String> 类型形参 'java.lang.String' 不在其界限内；应扩展 'java.lang.Number'
        Score<? extends Integer> score=new Score<>(" "," ",10);
//        Score<? super Number> score2 = new Score<Object>("数据结构与算法基础", "EP074512", 10);
        score.getValue();

    }
}

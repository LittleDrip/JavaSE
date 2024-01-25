package 泛型;

import 泛型.entity.Score;

public class Main {
    public static void main(String[] args) {
        Score<String> score=new Score<>("数学","123","优秀");

        Score<?> score1 = new Score<>("数学","123","优秀");
        Score<int[]> score2 = new Score<>("数学","123",new int[10]);

        //但是注意，如果使用通配符，那么由于类型不确定，所以说具体类型同样会变成Object
        System.out.println(score1.getValue());//Object类型
//        ————————————————————————————————————————————————————————————————————


    }

}

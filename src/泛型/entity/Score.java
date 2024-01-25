package 泛型.entity;

public class Score<T>  {
    String name;
    String id;
    T value;//T是类型参数 T会根据使用时提供的类型自动变成对应类型

    public Score(String name, String id, T value) { //这里T可以是任何类型，但是一旦确定，那么就不能修改了
        this.name = name;
        this.id = id;
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

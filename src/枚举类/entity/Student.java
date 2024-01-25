package 枚举类.entity;

public class Student {
    private Status status;//封装一下，保存状态

    public Student() {
    }

    public Student(Status status) {
        this.status = status;
    }

    /**
     * 获取
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * 设置
     * @param status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        return "Student{status = " + status + "}";
    }
}

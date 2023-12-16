public class Course {
    private String name;
    private String code;
    private int maxCapacity;

    protected static int numEnrolled = 0;

    public Course() {
    }

    public Course(String name, String code, int maxCapacity) {
        this.name = name;
        this.code = code;
        this.maxCapacity = maxCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}

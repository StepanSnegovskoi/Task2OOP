public class Education {
     private Group group;
     private Course course;
     private String time;

    public static int a;
    public static int b;

    static {
        a = 1;
        b = 2;
    }

    {
        this.group = new Group();
        this.course = new Course();
        this.time = "Неизвестно";
    }

    public Education(Group group, Course course, String time) {
        this.group = group;
        this.course = course;
        this.time = time;
    }

    public Education(Group group, Course course) {
        this.group = group;
        this.course = course;
    }

    public Education(Group group) {
        this.group = group;
    }

    public Education() {

    }


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Education{" +
                "group=" + group +
                ", course=" + course +
                ", time='" + time + '\'' +
                '}';
    }
}

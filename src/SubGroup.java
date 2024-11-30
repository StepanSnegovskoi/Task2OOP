import java.util.List;

public class SubGroup extends Group {
    private int subGroup;

    public static int a;
    public static int b;

    static {
        a = 1;
        b = 2;
    }

    {
        this.subGroup = -1;
    }

    public SubGroup(int number, List<Student> students, int peopleCount, String direction, int subGroup) {
        super(number, students, peopleCount, direction);
        this.subGroup = subGroup;
    }

    public SubGroup(int number, List<Student> students, int peopleCount, String direction) {
        super(number, students, peopleCount, direction);
    }

    public SubGroup(int number, List<Student> students, int peopleCount){
        super(number, students, peopleCount);
    }

    public SubGroup(int number, List<Student> students){
        super(number, students);
    }

    public SubGroup(int number){
        super(number);
    }

    public SubGroup(){
        super();
    }



    public int getSubGroup() {
        return subGroup;
    }

    public void setSubGroup(int subGroup) {
        this.subGroup = subGroup;
    }


}

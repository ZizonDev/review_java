package Chapter07_CollectionFramework;

public class StudentInfo implements Comparable<StudentInfo>{
    public String name;
    public int score;
    public StudentInfo(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(StudentInfo o) {
        if(this.score < o.score) return 1;
        else if(this.score == o.score) return this.name.compareTo(o.name);
        else return -1;
    }
}

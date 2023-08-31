package Chapter07_CollectionFramework;

import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        TreeSet<StudentInfo> set = new TreeSet<>();
        set.add(new StudentInfo("허윤진", 95));
        set.add(new StudentInfo("김채원", 100));
        set.add(new StudentInfo("사쿠라", 64));
        set.add(new StudentInfo("카즈하", 77));
        set.add(new StudentInfo("홍은채", 77));
        for(StudentInfo e : set) System.out.print(e.name + " ");
    }
}

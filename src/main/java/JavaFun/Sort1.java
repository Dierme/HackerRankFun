package JavaFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
}

//Complete the code
public class Sort1
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //sort
        //if the goal is to sort in ascending order, comparator should return:
        // x, x > 0 if s1 is greater than s2
        // x, x < 0 if s1 is less than s2
        studentList.sort((s1, s2) -> {
            if(s1.getCgpa() == s2.getCgpa()){
                if(s2.getName().compareTo(s1.getName()) == 0){
                    return s2.getId() - s1.getId();
                }
                return s2.getName().compareTo(s1.getName());
            }
            if(s1.getCgpa() - s2.getCgpa() > 0){
                return 1;
            }
            return -1;
        });

        for(Student st: studentList){
            System.out.println(st.getName());
        }
    }
}

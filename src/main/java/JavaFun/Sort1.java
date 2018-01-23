package JavaFun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
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

        studentList.sort((s1, s2) -> {
            if(s1.getCgpa() == s2.getCgpa()){
                if(s2.getFname().compareTo(s1.getFname()) == 0){
                    return s2.getId() - s1.getId();
                }
                return s1.getFname().compareTo(s2.getFname());
            }
            if(s2.getCgpa() - s1.getCgpa() > 0){
                return 1;
            }
            return -1;
        });

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}

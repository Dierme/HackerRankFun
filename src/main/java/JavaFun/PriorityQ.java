package JavaFun;

import java.util.*;

import JavaFun.Student;

class Priorities{
    public List<Student> getStudents(List<String> events){

        // highest CGPA is served first.
        // Same CGPA -> served by name in ascending case-sensitive alphabetical order.
        // Same CGPA && name -> served in ascending order of the id.

        PriorityQueue<Student> queue = new PriorityQueue<Student>((s1, s2) -> {
            if(s1.getCgpa() == s2.getCgpa())
                if(s1.getName().equals(s2.getName()))
                    return s2.getId() - s1.getId();
                else
                    return s1.getName().compareTo(s2.getName());
            else
                if(s2.getCgpa() - s1.getCgpa() > 0)
                    return 1;
                else
                    return -1;
        });

        for (String event: events) {
            Scanner scan = new Scanner(event);

            String command = scan.next();

            switch (command){
                case "ENTER" :
                    String name = scan.next();
                    double cgpa = scan.nextDouble();
                    int id = scan.nextInt();
                    queue.add(new Student(id,name,cgpa));
                    break;
                case "SERVED":
                    if(queue.isEmpty())
                        break;
                    queue.remove();
//                    String rname = queue.remove().getName();
//                    System.out.println(rname);
                    break;
                default:
                    throw new RuntimeException("Unrecognized operation: " + command);
            }
        }

        LinkedList<Student> Slist = new LinkedList<>();

        int s = queue.size();
        for(int i = 0; i < s; i++){
            Slist.addLast(queue.remove());
        }
        return Slist;
    }
}

public class PriorityQ {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName() + " : " + st.getCgpa());
            }
        }
    }
}

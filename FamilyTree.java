package FamilyTree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Iterable<Human> {
    private ArrayList<Human> treeHuman;

    public FamilyTree(){

    }

    
        public StudyGroup() {
            studentList = new ArrayList<>();
        }
    
        public void addStudent(Student student) {
            studentList.add(student);
        }
    
        @Override
        public Iterator<Student> iterator() {
            return new StudyGroupIterator(studentList);
        }
    
        public List<Student> getStudentList() {
            return studentList;
        }


    // public void preOrder(Human tree, String spase) {
    //     if (tree != null)
    //         System.out.println(spase + tree.getName());
    //     else {
    //         System.out.println(spase + "nil");
    //         return;
    //     }

    //     for (int i = 0; i < tree.getFamily().size(); i++) {
    //         preOrder(tree.getFamily().get(i).getH2(), spase + "");
    //     }
    // }
}

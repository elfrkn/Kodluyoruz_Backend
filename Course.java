public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int not;
    int sozlu;

    Course(String name,String code,String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        this.not=0;
        this.sozlu=0;


    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher=teacher;
        }else{
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }


    }

    void printTeacher(){
        this.teacher.print();

    }


}

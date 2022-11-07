public class OgrenciNotSistemi {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Mahmut Hoca","532136383","TRH");
        Teacher t2=new Teacher("Selim hoca","102","FZK");
        Teacher t3=new Teacher("Kül yutmaz","1111","BIO");

        Course tarih=new Course("tarih","101","TRH",t1);
        tarih.addTeacher(t1);
        Course fizik=new Course("Fizik","102","FZK",t2);
        fizik.addTeacher(t2);
        Course biyoloji=new Course("Biyoloji","103","BIO",t3);
        biyoloji.addTeacher(t3);

        Student st1=new Student("Şaban","123","4",tarih,fizik,biyoloji,tarih,fizik,biyoloji);
        st1.addBulkExamNote(100,60,86);
        st1.sozluNote(60,90,80);
        st1.isPass();

        Student st2=new Student("Düdük Necmi","234","4",tarih,fizik,biyoloji,tarih,fizik,biyoloji);
        st2.addBulkExamNote(50,30,79);
        st2.sozluNote(80,60,50);
        st2.isPass();


    }
}

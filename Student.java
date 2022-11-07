public class Student {
    Course c1;
    Course c2;
    Course c3;
    Course s1;
    Course s2;
    Course s3;

    String name;
    String stuNo;
    String classes;
    Boolean isPass;
    Double avarage;
    Double sozluavarage;
    Double d1,d2,d3;

    Student(String name,String stuNo,String classes,Course c1,Course c2,Course c3,Course s1,Course s2,Course s3){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
        this.d1=d1;
        this.d2=d2;
        this.d3=d3;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3){
        if(note1>=0 && note1<=100){
            this.c1.not=note1;
        }
       if(note2>=0 && note2<=100){
           this.c2.not=note2;
       }
       if(note3>=0 && note3<=100){
           this.c3.not=note3;
       }
    }

    void sozluNote(int sozlu1,int sozlu2,int sozlu3){
        if(sozlu1>=0 && sozlu1<=100){
            this.s1.sozlu=sozlu1;
        }
        if(sozlu2>=0 && sozlu2<=100){
            this.s2.sozlu=sozlu2;
        }
        if(sozlu3>=0 && sozlu3<=100){
            this.s3.sozlu=sozlu3;
        }
    }

    void isPass(){
        System.out.println("====================");
        this.d1=(this.s1.sozlu*0.20)+(this.c1.not *0.80);
        this.d2=(this.s2.sozlu*0.20)+(this.c2.not *0.80);
        this.d3=(this.s3.sozlu*0.20)+(this.c3.not *0.80);
        this.avarage=(d1+d2+d3) / 3.0;



        if(this.avarage>55){
            System.out.println("Sınıfı başarılı şekilde geçtiniz!");
        }else{
            System.out.println("Sınıfta kaldınız.");
        }
        printNote();
    }


    void printNote(){

        System.out.println(this.c1.name +"Notu:\t"+ this.d1 );
        System.out.println(this.c2.name +"Notu:\t"+ this.d2 );
        System.out.println(this.c3.name +"Notu:\t"+ this.d3 );
        System.out.println("Ortalamanız:" + this.avarage);


    }
}


public class Main {

    public static void main(String[] args) {

        Student Ivan = new Student("");
        SchoolTeacherWorker TamaraDmitrievna = new SchoolTeacherWorker("����������");
        UniversityTeacherWorker AlekseyAleksandrovich = new UniversityTeacherWorker("���");
        IrbisTeacherWorker GalinaAlekseevna = new IrbisTeacherWorker();
        TamaraDmitrievna.prepareLesson();
        TamaraDmitrievna.teach(Ivan);
        System.out.println("�����");
        AlekseyAleksandrovich.prepareLesson();
        AlekseyAleksandrovich.teach(Ivan);
        System.out.println("� �������");
        GalinaAlekseevna.prepareLesson();
        GalinaAlekseevna.teach(Ivan);

    }
}

public class Main {

    public static void main(String[] args) {

        Student Ivan = new Student("");
        SchoolTeacherWorker TamaraDmitrievna = new SchoolTeacherWorker("Математика");
        UniversityTeacherWorker AlekseyAleksandrovich = new UniversityTeacherWorker("ООП");
        IrbisTeacherWorker GalinaAlekseevna = new IrbisTeacherWorker();
        TamaraDmitrievna.prepareLesson();
        TamaraDmitrievna.teach(Ivan);
        System.out.println("Затем");
        AlekseyAleksandrovich.prepareLesson();
        AlekseyAleksandrovich.teach(Ivan);
        System.out.println("И наконец");
        GalinaAlekseevna.prepareLesson();
        GalinaAlekseevna.teach(Ivan);

    }
}
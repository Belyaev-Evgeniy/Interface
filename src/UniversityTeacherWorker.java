public class UniversityTeacherWorker implements ITeacherWorker{

    private String courseName;

    public UniversityTeacherWorker(String courseName) {
        this.courseName = courseName;
    }

    void workOnDoctorskaya(){
        System.out.println("Отсутствует по <<университетски>>");
    }

    void speakAboutPutin(){
        System.out.println("Промывание мозгов политикой");
    }

    @Override
    public void prepareLesson() {
        workOnDoctorskaya();
    }

    @Override
    public void teach(Student Ivan) {
        speakAboutPutin();
        Ivan.learn(courseName);
    }
}

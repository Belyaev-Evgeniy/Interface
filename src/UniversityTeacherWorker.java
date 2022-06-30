public class UniversityTeacherWorker implements ITeacherWorker{

    private String courseName;

    public UniversityTeacherWorker(String courseName) {
        this.courseName = courseName;
    }

    void workOnDoctorskaya(){
        System.out.println("����������� �� <<��������������>>");
    }

    void speakAboutPutin(){
        System.out.println("���������� ������ ���������");
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

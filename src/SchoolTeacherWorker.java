public class SchoolTeacherWorker implements ITeacherWorker {
    private String lessonName;

    public SchoolTeacherWorker(String lessonName) {
        this.lessonName = lessonName;
    }

    void speakWithOtherTeachers() {
        System.out.println("����������� ��� �����");
    }

    @Override
    public void prepareLesson() {
        System.out.println("��������� ������ " + lessonName);
    }

    @Override
    public void teach(Student Ivan) {
        speakWithOtherTeachers();
        Ivan.learn(lessonName);
    }
}

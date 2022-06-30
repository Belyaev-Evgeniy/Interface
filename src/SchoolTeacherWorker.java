public class SchoolTeacherWorker implements ITeacherWorker{
    private String lessonName = "���";

    void speakWithOtherTeachers(){
        System.out.println("����������� ��� �����");
    }

    @Override
    public void prepareLesson() {
        System.out.println("��������� ������ " + lessonName);
    }

    @Override
    public void teach() {
        speakWithOtherTeachers();
        Student.learn(lessonName);
    }


}

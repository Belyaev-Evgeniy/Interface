public class SchoolTeacherWorker implements ITeacherWorker{
    private String lessonName = "ИВТ";

    void speakWithOtherTeachers(){
        System.out.println("Отсутствует пол урока");
    }

    @Override
    public void prepareLesson() {
        System.out.println("Повторяет лекцию " + lessonName);
    }

    @Override
    public void teach() {
        speakWithOtherTeachers();
        Student.learn(lessonName);
    }


}

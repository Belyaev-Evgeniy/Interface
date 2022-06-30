public class SchoolTeacherWorker implements ITeacherWorker {
    private String lessonName;

    public SchoolTeacherWorker(String lessonName) {
        this.lessonName = lessonName;
    }

    void speakWithOtherTeachers() {
        System.out.println("Отсутствует пол урока");
    }

    @Override
    public void prepareLesson() {
        System.out.println("Повторяет лекцию " + lessonName);
    }

    @Override
    public void teach(Student Ivan) {
        speakWithOtherTeachers();
        Ivan.learn(lessonName);
    }
}

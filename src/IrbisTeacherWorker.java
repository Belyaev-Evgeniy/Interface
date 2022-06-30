public class IrbisTeacherWorker implements ITeacherWorker{

    private String courseName;

    {
        courseName = "Java";
    }

    void readHabr(){
        System.out.println("Афк 20 минут в статье");
    }

    void doIrbisTasks(){
        readHabr();
    }

    @Override
    public void prepareLesson() {
        doIrbisTasks();
    }

    @Override
    public void teach() {
        Student.learn(courseName);
    }
}

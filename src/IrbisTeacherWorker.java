public class IrbisTeacherWorker implements ITeacherWorker{

    private String courseName;

    {
        courseName = "Java";
    }

    void readHabr(){
        System.out.println("��� 20 ����� � ������");
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

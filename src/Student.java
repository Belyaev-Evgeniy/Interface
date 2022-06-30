public class Student {

   private String knowledge;

    public Student(String knowledge) {
        this.knowledge = knowledge;
    }


    void learn(String knowledge){
        System.out.println("Учит " + knowledge);
    }
}

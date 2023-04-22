public class Student {
    private String name; //- имя студента,
    private int age;//- возраст,
    private String education;//- название вуза,
    private double averageScore;//- средний балл,
    private String favouriteSubject;//- любимый предмет.
    public Student(String name, int age, String education, double average_score, String favourite_subject){
        this.name = name;
        this.age = age;
        this.education = education;
        this.averageScore = average_score;
        this.favouriteSubject = favourite_subject;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public String getName(){
        return this.name;
    }
}

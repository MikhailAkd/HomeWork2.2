public class StudentsHufflepuff extends StudentsHogwarts {
    private int diligence;
    private int loyalty;
    private int honesty;

    private int skillRatingHufflepuff() {
        return diligence + loyalty + honesty;
    };

    public void studentsRatingHufflepuff (StudentsHufflepuff studentsHufflepuff){
        int skillRatingHufflepuffOne = skillRatingHufflepuff();
        int skillRatingHufflepuffTwo = studentsHufflepuff.skillRatingHufflepuff();
        if (skillRatingHufflepuffOne > skillRatingHufflepuffTwo) {
            System.out.println("Среди студентов факультета Пуффендуй " + getName() + " " +  getSurname() + "(" + skillRatingHufflepuffOne + ")" + " имеет более высокий рейтинг, чем " + studentsHufflepuff.getName() + " " +  studentsHufflepuff.getSurname() + "(" + skillRatingHufflepuffTwo + ")");
        } else if (skillRatingHufflepuffOne < skillRatingHufflepuffTwo) {
            System.out.println("Среди студентов факультета Пуффендуй " + studentsHufflepuff.getName() + " " +  studentsHufflepuff.getSurname() + "(" + skillRatingHufflepuffTwo + ")" + " имеет более высокий рейтинг, чем " + getName() + " " +  getSurname() + "(" + skillRatingHufflepuffOne + ")");
        } else {
            System.out.println("Студенты имеют одинаковый рейтинг");
        }
        System.out.println();
    }

    public StudentsHufflepuff(String name, String surname, int magicalPotential, int transgressionSkill, int diligence, int loyalty, int honesty) {
        super(name, surname, magicalPotential, transgressionSkill);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return super.toString() + " | Трудолюбие: " + diligence + " | Верность: " + loyalty + " | Честность: " + honesty + " |";
    }
}

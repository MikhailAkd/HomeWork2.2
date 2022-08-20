public class StudentsGryffindor extends StudentsHogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    private int skillRatingGryffindor() {
        return nobility + honor + bravery;
    };

    public void studentsRatingGryffindor (StudentsGryffindor studentsGryffindor){
        int skillRatingGryffindorOne = skillRatingGryffindor();
        int skillRatingGryffindorTwo = studentsGryffindor.skillRatingGryffindor();
        if (skillRatingGryffindorOne > skillRatingGryffindorTwo) {
            System.out.println("Среди студентов факультета Гриффиндор " + getName() + " " +  getSurname() + "(" + skillRatingGryffindorOne + ")" + " имеет более высокий рейтинг, чем " + studentsGryffindor.getName() + " " +  studentsGryffindor.getSurname() + "(" + skillRatingGryffindorTwo + ")");
        } else if (skillRatingGryffindorOne < skillRatingGryffindorTwo) {
            System.out.println("Среди студентов факультета Гриффиндор " + studentsGryffindor.getName() + " " +  studentsGryffindor.getSurname() + "(" + skillRatingGryffindorTwo + ")" + " имеет более высокий рейтинг, чем " + getName() + " " +  getSurname() + "(" + skillRatingGryffindorOne + ")");
        } else {
            System.out.println("Студенты имеют одинаковый рейтинг");
        }
        System.out.println();
    }

    public StudentsGryffindor(String name, String surname, int magicalPotential, int transgressionSkill, int nobility, int honor, int bravery) {
        super(name, surname, magicalPotential, transgressionSkill);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return super.toString() + " | Благородство: " + nobility + " | Честь: " + honor + " | Храбрость: " + bravery + " |";
    }
}
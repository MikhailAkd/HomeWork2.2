public class StudentsRavenclaw extends StudentsHogwarts {
    private int intelligence;
    private int wisdom;
    private int wit;
    private int creativity;

    private int skillRatingRavenclaw() {
        return intelligence + wisdom + wit + creativity;
    };

    public void studentsRatingRavenclaw (StudentsRavenclaw studentsRavenclaw){
        int skillRatingRavenclawOne = skillRatingRavenclaw();
        int skillRatingRavenclawTwo = studentsRavenclaw.skillRatingRavenclaw();
        if (skillRatingRavenclawOne > skillRatingRavenclawTwo) {
            System.out.println("Среди студентов факультета Когтевран " + getName() + " " +  getSurname() + "(" + skillRatingRavenclawOne + ")" + " имеет более высокий рейтинг, чем " + studentsRavenclaw.getName() + " " +  studentsRavenclaw.getSurname() + "(" + skillRatingRavenclawTwo + ")");
        } else if (skillRatingRavenclawOne < skillRatingRavenclawTwo) {
            System.out.println("Среди студентов факультета Когтевран " + studentsRavenclaw.getName() + " " +  studentsRavenclaw.getSurname() + "(" + skillRatingRavenclawTwo + ")" + " имеет более высокий рейтинг, чем " + getName() + " " +  getSurname() + "(" + skillRatingRavenclawOne + ")");
        } else {
            System.out.println("Студенты имеют одинаковый рейтинг");
        }
        System.out.println();
    }

    public StudentsRavenclaw(String name, String surname, int magicalPotential, int transgressionSkill, int intelligence, int wisdom, int wit, int creativity) {
        super(name, surname, magicalPotential, transgressionSkill);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " | Ум: " + intelligence + " | Мудрость: " + wisdom + " | Остроумие: " + wit + " | Креативность: " + creativity + " |";
    }
}
public abstract class StudentsHogwarts {
    private String name;
    private String surname;
    private int magicalPotential;
    private int transgressionSkill;

    private int generalSkillRating() {
        return magicalPotential + transgressionSkill;
    };

    public void printStudents() {
        System.out.println(this);
    }

    public void studentsRating (StudentsHogwarts studentsHogwarts){
        int generalSkillRatingOne = generalSkillRating();
        int generalSkillRatingTwo = studentsHogwarts.generalSkillRating();
        if (generalSkillRatingOne > generalSkillRatingTwo) {
            System.out.println("Среди студентов Хогвартса " + getName() + " " + getSurname() + "(" + generalSkillRatingOne + ")" + " имеет более высокий рейтинг, чем " + studentsHogwarts.getName() + " " +  studentsHogwarts.getSurname() + "(" + generalSkillRatingTwo + ")");
        } else if (generalSkillRatingOne < generalSkillRatingTwo) {
            System.out.println("Среди студентов Хогвартса " + studentsHogwarts.getName() + " " +  studentsHogwarts.getSurname() + "(" + generalSkillRatingTwo + ")" + " имеет более высокий рейтинг, чем " + getName() + " " +  getSurname() + "(" + generalSkillRatingOne + ")");
        } else {
            System.out.println("Студенты имеют одинаковый рейтинг");
        }
        System.out.println();
    }

    public StudentsHogwarts(String name, String surname, int magicalPotential, int transgressionSkill) {
        this.name = name;
        this.surname = surname;
        this.magicalPotential = magicalPotential;
        this.transgressionSkill = transgressionSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMagicalPotential() {
        return magicalPotential;
    }

    public void setMagicalPotential(int magicalPotential) {
        this.magicalPotential = magicalPotential;
    }

    public int getTransgressionSkill() {
        return transgressionSkill;
    }

    public void setTransgressionSkill(int transgressionSkill) {
        this.transgressionSkill = transgressionSkill;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " " + surname + " | Магический потенциал: " + magicalPotential + " | Навык трансгрессии: " + transgressionSkill;
    }
}

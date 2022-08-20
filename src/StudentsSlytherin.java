public class StudentsSlytherin extends StudentsHogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    private int skillRatingSlytherin() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    };

    public void studentsRatingSlytherin (StudentsSlytherin studentsSlytherin){
        int skillRatingSlytherinOne = skillRatingSlytherin();
        int skillRatingSlytherinTwo = studentsSlytherin.skillRatingSlytherin();
        if (skillRatingSlytherinOne > skillRatingSlytherinTwo) {
            System.out.println("Среди студентов факультета Слизерин " + getName() + " " +  getSurname() + "(" + skillRatingSlytherinOne + ")" + " имеет более высокий рейтинг, чем " + studentsSlytherin.getName() + " " +  studentsSlytherin.getSurname() + "(" + skillRatingSlytherinTwo + ")");
        } else if (skillRatingSlytherinOne < skillRatingSlytherinTwo) {
            System.out.println("Среди студентов факультета Слизерин " + studentsSlytherin.getName() + " " + studentsSlytherin.getSurname() + "(" + skillRatingSlytherinTwo + ")" + " имеет более высокий рейтинг, чем " + getName() + " " +  getSurname() + "(" + skillRatingSlytherinOne + ")");
        } else {
            System.out.println("Студенты имеют одинаковый рейтинг");
        }
        System.out.println();
    }

    public StudentsSlytherin(String name, String surname, int magicalPotential, int transgressionSkill, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, surname, magicalPotential, transgressionSkill);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public String toString() {
        return super.toString() + " | Хитрость: " + cunning + " | Решительность: " + determination + " | Амбициозность: " + ambition + " | Находчивость: " + resourcefulness + " | Жажда власти: " + thirstForPower + " |";
    }
}

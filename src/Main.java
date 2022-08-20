public class Main {
    public static void main(String[] args) {
        StudentsGryffindor garry = new StudentsGryffindor("Harry","Potter", 8,6,8,8, 8 );
        StudentsGryffindor hermione = new StudentsGryffindor("Hermione", "Granger",7,8,7,7,6);
        StudentsGryffindor ron = new StudentsGryffindor("Ron", "Weasley", 6, 5, 7, 8, 7);

        StudentsHufflepuff zachariah = new StudentsHufflepuff("Zachariah", "Smith",5, 5, 5, 4, 4);
        StudentsHufflepuff cedric = new StudentsHufflepuff("Cedric","Diggory",7, 7,8, 8, 8);
        StudentsHufflepuff justin = new StudentsHufflepuff("Justin","Finch-Fletchley",5,5,6, 6, 6);

        StudentsRavenclaw zhou = new StudentsRavenclaw("Zhou", "Chang",6,5,7,6,5,5);
        StudentsRavenclaw padma = new StudentsRavenclaw("Padma","Patil",6, 4,4,4,4,6);
        StudentsRavenclaw marcus = new StudentsRavenclaw("Marcus", "Belby",4,6,4,5,4,4);

        StudentsSlytherin draco = new StudentsSlytherin("Draco", "Malfoy", 6,6,5, 6,9,5,9);
        StudentsSlytherin graham = new StudentsSlytherin("Graham", "Montague",4,4,5,4, 5, 4, 5);
        StudentsSlytherin gregory = new StudentsSlytherin("Gregory", "Goyle",4, 4, 4, 5, 4, 5, 6);

        garry.printStudents();
        System.out.println();

        draco.printStudents();
        System.out.println();

        garry.studentsRatingGryffindor(hermione);
        System.out.println();

        draco.studentsRatingSlytherin(gregory);
        System.out.println();

        garry.studentsRating(draco);
    }
}
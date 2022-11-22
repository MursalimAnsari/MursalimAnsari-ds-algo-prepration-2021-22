package interviewquestions.immutable;

// STEPS TO CREATE AN IMMUTABLE CLASS IN JAVA ::

/*
*  1. CREATE A CLASS USING THE FINAL KEYWORD AS IT CAN NOT BE INHERITED AND OVERRIDING CONCEPT WILL BE LOCKED
*  2. MAKE ALL THE MEMBERS OF THE CLASS AS FINAL
*  3. DEFINE ALL GETTERS, BUT NOT DEFINE THE SETTER METHODS
*  4. MAKE A CONSTRUCTOR AND INITIALISE ALL THE MEMBER VARIABLES IN CONSTRUCTOR AND USE DEEP COPY TO INITIALISE
*/

 //1 make class final
 final class Student {
    //2 make all variables final
     final private int id;
    final private String name;


    //3  initialise variables using constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    // make all the getters and remove all setter methods if available
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }


 }

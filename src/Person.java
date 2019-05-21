class Person {

    private String name;


    public String getName() { //returns the person's name

        return this.name;
    }

    public void setName(String personName) { //changes the NAME property to the passed value

        this.name = personName;
    }

    public void sayHello() { //prints a message to the console using the person's name
        String out = String.format("Hello, ", this.getName());
        System.out.println(out);
    }

    public Person(String personName) { //constructor that accepts a string value and sets the person's name to the passed string
        this.name = personName;
        sayHello();
    }

    public static void main(String[] args) { //creates a new Person object and tests the above methods
        Person alexandra = new Person("Alexandra");
        alexandra.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());

    }
}




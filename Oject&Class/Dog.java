public class Dog {
    String owner_name;
    String breed;
    boolean hasOwner;
    int age;
    
    public Dog(String ownername,String dogBreed, boolean dogOwned, int dogYears) {
      System.out.println("Constructor invoked!");
      owner_name = ownername;
      breed = dogBreed;
      hasOwner = dogOwned;
      age = dogYears;

    }
}    
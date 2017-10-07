package practice5;

 class people{
  String peopleName;
  int peopleAge, weight;

  public void working (){
      for (int i = 0; i<3; i++){
          System.out.println("My name is " + peopleName + " and I  am " + peopleAge + "years old");
      }
  }
  public void danceing(String peopleName, int peopleAge){
      System.out.println(peopleName + " loves Bollywod Dancing and she is " + peopleAge + " years old");
  }

  int calculatePeopleAge(){
      int yearsLeft = 65 - peopleAge;
      System.out.println("years left " + yearsLeft);
      return yearsLeft;
  }

  int getPeopleAge(){
      System.out.println();
      return peopleAge;
  }
  public String getPeopleName(){
      System.out.println("My name is " + peopleName);
      return peopleName;
  }
}

public class Classes {
    public static void main(String[] args) {
        people asia = new people();
        asia.peopleName= "Nepal Boss";
        asia.peopleAge = 33;
        asia.weight = 80;
        asia.working();
        asia.danceing("Mousumi ", 33);
        int peopleAge = asia.getPeopleAge();
        System.out.println("my age is " + peopleAge);

        people europe = new people();
        europe.peopleName = "John Smith";
        europe.peopleAge = 22;
        String peopleName = europe.getPeopleName();
        int yearsLeft = europe.calculatePeopleAge();
        System.out.println("My name is " + peopleName + " and I  am " + peopleAge + "years old");
        System.out.println(asia.peopleName);
        System.out.println(europe.peopleName);

    }

}

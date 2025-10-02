public class Dog implements Animal{
  @Override
  public String getAnimalArt() {
      return "       \\    ^  ^\n" +
             "        \\   ^__^\n" +
             "         \\  (oo)\\_______   /\n " +
             "           (__)\\       )\\/\n" +
             "                ||----w |\n" +
             "                ||     ||";
  }


  @Override
  public String toString() {
    return "dog";
  }
}

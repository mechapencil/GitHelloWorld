/*  This program is intended to facilitate a demonstration the use of the us of
    Git and Github.

    To run this program easily, try a browser-based IDE like
    https://repl.it/languages/java
    
    This file is the 'main,' the primary file that runs the whole program.
*/
class Main {
  public static void main(String[] args) {

    //Initialize a Speaker object, named publicSpeaker, and set it equal to
    //the value of a new default Speaker.
    Speaker publicSpeaker = new Speaker();

    //Print out text to the console. The text in the parentheses are called
    //arguments. This function accepts string values, and variables that hold
    //string values. The argument we provide here is the 'text' string variable
    //belonging to our publicSpeaker object.
    System.out.println(publicSpeaker.text);
  }
}

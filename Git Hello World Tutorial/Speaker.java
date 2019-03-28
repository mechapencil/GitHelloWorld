/*This class defines our Speaker object.

An object is an 'instance of a class. Think of it like a blueprint
for a home -  you can build many identical houses (objects or
'instances') from the same blueprint (a class). For example, a Speaker
object named 'Fred' and a Speaker object named 'Jack' would be two
separate instances of the  same class.

A Speaker object has two associated values, a 'text' string and a
'name' string. A string is a 'variable' that holds a string of
character values; like letters, numbers, and symbols.
*/
public class Speaker{

//Initialize the variables text and name. They are by default
//empty strings of text.
  String text;
  String name;

/*The default constructor for the Speaker object. You call a constructor
to create an 'instance' of an object, and provide details on what state
the object will be in. You can have more than one constructor, but this
default constructor will produce the same instance of an object every time.

Here the default constructor sets the values of text and name to be equal to
the value on the right side of the equal sign.

Edit the default constructor to replace the empty strings with text. For
example, change the line [[text = "";]] to read [[text = "Hello World!"]].
*/
  public Speaker(){
    text = "Hello World!";
    name = "Ian Campbell";
  }
}

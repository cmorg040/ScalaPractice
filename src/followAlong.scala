
object followAlong extends App{

  val file = io.Source.fromFile("persons.csv")

  println("Reading CSV file...")

  for (line <- file.getLines) {

    var values = line.split(",")
    // line.split() will split a string into an array based on a delimiter.
    // E.G line.split("+") would split the string: 'Tim+40+Texas' into this array: [Tim, 40, Texas]

    println(s"${values(0)}, ${values(1)}, ${values(2)}")
    // This is just fancy string interpolation.
    // Same thing as this:
    // println(values(0) + ", " + values(1) + ", " + values(2))
    // ^You can uncomment that line and it'll print the exact same thing.
  }
}

import org.scalatest._

class HelloWorldSpec extends FlatSpec with Matchers with BeforeAndAfterAll {

 it should "Validate the number is even or odd" in {
   val enum = HelloWorld.getEventNum
   enum should be(4)
 }

}

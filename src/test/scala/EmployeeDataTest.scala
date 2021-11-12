
import com.knoldus.priyanka.EmployeeData
import org.scalatest.wordspec.AnyWordSpec


class EmployeeDataTest extends AnyWordSpec{
  "In Employee Data consultant ID"should{"be like this" in {
    val obj = new EmployeeData
    val consId: String = obj.consultant("123", "Aarya", "Sharma", 800000.0)
    assert(consId == "CONS123")
  } }
  "In Employee Data manager ID" should {"be like this" in {
    val obj = new EmployeeData
    val managerId = obj.manager("133", "Sahil", "Chanda", 16000000.0)
    assert(managerId == "MANA133")
  } }
  "In Employee Data sr manager ID"should {"be like this" in{
    val obj = new EmployeeData
    val srMangerId = obj.srManager("152", "Priyanka", "Sharma", 2100000.0)
    assert(srMangerId =="SRMA152")
  } }
  "In Employee Data President ID"should {"be like this" in{
    val obj = new EmployeeData
    val presidentId = obj.president("156", "Radhika", "Nilhani", 2600000.0)
    assert(presidentId == "POTC156")

  } }
}

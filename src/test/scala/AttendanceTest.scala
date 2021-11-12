import com.knoldus.priyanka.AttendanceService
import org.scalatest.wordspec.AnyWordSpec


class AttendanceTest extends AnyWordSpec{
  "In Attendance Service" should {"be total" in{
    val Attendance = new AttendanceService
    val total = Attendance.attendance("1582", "9:45AM", "6:45PM")
    assert(total == "9:00Hour")
  }
  }
}

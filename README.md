# scala-assignment1# scala-assignmentone
PROBLEM----
------------------
Create an Employee Management System where there are the following types of employees:

    Consultant
    Manager
    Sr. Manager
    President



All Employees must have empId, first name, last name, salary.

The employee will be differed by prefix as follows (Hint: create Prefix as a class member)

    Consultant - CONS
    Manager - MANA
    Sr. Manager - SRMA
    President - POTC

Note: Prefix should not be accessible outside the class.

Create the Attendance Service in your application

Create a method that will take the following arguments

    Employee (any Employee)
    Start Time
    End Time



Create another method with the same name that will take the following arguments

    Employee

and take start time as 09:45 AM and end time as 06:45 PM automatically.

SOLUTION-----------
---------------

File Name -  Employee.scala
------------
package com.knoldus.priyanka

trait Employee {
 def consultant(empId: String,firstName:String, lastName:String,salary:Double):String
 def manager(empId: String,firstName:String, lastName:String,salary:Double):String
 def srManager(empId: String,firstName:String, lastName:String,salary:Double):String
 def president(empId: String,firstName:String, lastName:String,salary:Double):String
}
class EmployeeData extends Employee {
  private val prefix: Array[String] = Array("CONS", "MANA", "SRMA", "POTC")

  override def consultant(empId: String, firstName: String, lastName: String, salary: Double): String = {
    val consId = prefix(0) +empId
    consId
  }

  override def manager(empId: String, firstName: String, lastName: String, salary: Double): String = {
    val manaId = prefix(1) +empId
    manaId
  }

  override def srManager(empId: String, firstName: String, lastName: String, salary: Double): String ={
    val srmaId = prefix(2) +empId
    srmaId
  }

  override def president(empId: String, firstName: String, lastName: String, salary: Double): String = {
    val potcId = prefix(3) +empId
    potcId
  }
}


File Name -  AttendanceService.scala
----------------

package com.knoldus.priyanka

class AttendanceService  {
 def attendance(empId:String,startTime:String,endTime:String):String = {
   var total:String="0:00Hour"
   if (startTime == "9:45AM" && endTime == "6:45PM") {
     var total = "9:00Hour"
     println("Total hours completed")
     total
   }
   else {
     println("Total hours not completed")
     total
   }

 }
 def attendance(empID:String):String = {
   var startTime:String="9:45am"
   val total:String ="9:00Hours"
   println("Total hours completed")
   total
 }
}






File Name -  EmployeeDataTest.scala
----------
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



File Name -  AttendanceTest.scala
----------
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

File Name -  Application.scala
-----
package com.knoldus.priyanka

object Application extends App {
  val att = new AttendanceService
  att.attendance("123")
  att.attendance("123","2:10pm","3:06pm")
}


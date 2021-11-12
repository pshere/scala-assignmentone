package com.knoldus.priyanka

object Application extends App {
   val att = new AttendanceService
   att.attendance("123")
   att.attendance("123","2:10pm","3:06pm")
}

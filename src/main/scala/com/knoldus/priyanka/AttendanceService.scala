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
    val total:String ="9:00hours"
    println("Total hours completed")
    total
  }
}

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


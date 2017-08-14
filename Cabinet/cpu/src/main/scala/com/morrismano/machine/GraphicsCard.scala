package com.morrismano.machine

class GraphicsCard(var make:String , var gram : Int) {
  this.make = make
  this.gram = gram

  def describe(): Unit = {
    println(s"the graphics cards is of the make ${make} and has a capacity of ${gram}")
  }

}

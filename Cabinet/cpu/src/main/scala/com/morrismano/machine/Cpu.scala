package com.morrismano.machine

class Cpu(var name:String , var id: String) {
  this.name = name
  this.id = id

  def identify(): Unit = {
    println("Something some bullshit man")
  }
}
package com.m2.storage

class M2Byte {
  var data = scala.collection.mutable.MutableList.fill(8)(false)

  def this(list:scala.collection.mutable.MutableList[Boolean]) {
    this()
    this.data = list
  }
}

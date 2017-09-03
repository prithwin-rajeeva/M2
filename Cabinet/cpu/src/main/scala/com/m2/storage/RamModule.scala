package com.m2.storage

import com.m2.util.Util

class RamModule(val adressSize:Int) {
  val bytes = math.round(math.pow(2, adressSize)).toInt
  var mainMemory = scala.collection.mutable.MutableList.fill(bytes.toInt)(new M2Byte())

  def spill = {
    for (i <- 0 until bytes) {
      mainMemory(i).data.map(Util.trueBoolPrint)
      if(i % 200 == 0) println
    }
  }

  /*
  utility method to move some opcodes into the memory
  */
  def moveIntoMemory(data:scala.collection.mutable.MutableList[M2Byte], location:Int): Unit = {
    var k = 0
    for(i <- location until location + data.length ; k <- 0 until data.length) {
      var memoryByte = mainMemory(i)
      for(j <- 0 until 7) {
        memoryByte.data(j) = data(k).data(j)
      }
    }
  }
}

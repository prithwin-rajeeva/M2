package com.morrismano.machine

import com.morrismano.model.RamChip

object Runner {
  def main(args : Array[String]): Unit = {
    var timePass = new Cpu("sdfsdf","sdfsd")
    var ramchip = new RamChip();
    ramchip.setCapacity(34)
    ramchip.setMake("MorrisRam")
    println(s"the make of the ram is ${ramchip.getMake} and the size is ${ramchip.getCapacity}")
    timePass.identify()
  }
}
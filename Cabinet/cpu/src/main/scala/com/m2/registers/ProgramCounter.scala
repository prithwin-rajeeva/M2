package com.m2.registers

class ProgramCounter(pcSize: Int) extends Register(pcSize , "PC" , "Holds the address of the next " +
  "instruction to be executed"){

  override def toString: String = s"NAME:${name}   SIZE:${size}"

}

package com.m2.registers

class DataRegister(drSize: Int) extends Register(drSize , "DR" , "Hold the memory operand"){
  override def toString: String = s"NAME:${name}   SIZE:${size}"
}

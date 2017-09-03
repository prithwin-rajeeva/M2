package com.m2.registers

class TemporaryRegister(tempSize: Int) extends Register(tempSize , "TR" , "Temporary registers holds operands"){
  override def toString: String = s"NAME:${name}   SIZE:${size}"
}

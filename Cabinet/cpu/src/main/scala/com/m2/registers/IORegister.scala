package com.m2.registers

case class IORegister(ioReadSize: Int,ioName: String) extends Register(ioReadSize , ioName,"This is either an " +
  s"input or an output register ${ioName}"){
  override def toString: String = s"NAME:${name}   SIZE:${size}"
}

package com.m2.registers

case class AddressRegister(arSize: Int) extends Register(arSize , "AR" , "Hold the address for the memory"){
  override def toString: String = s"NAME:${name}   SIZE:${size}"
}

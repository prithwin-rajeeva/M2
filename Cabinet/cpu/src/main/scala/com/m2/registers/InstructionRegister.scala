package com.m2.registers

class InstructionRegister(var sz:Int , val opcodeSize:Int) extends Register(sz,"IR" , "holds the instruction code") {
  //A fairly typical register with a fixed size
  override def toString: String = s"NAME:${name}   SIZE:${size}   OPCODE_SIZE:${opcodeSize}"

}

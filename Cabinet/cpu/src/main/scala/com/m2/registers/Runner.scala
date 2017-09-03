package com.m2.registers

import java.io.FileInputStream

import com.m2.storage.{M2Byte, RamModule}
import org.apache.commons.io.FileUtils

object Runner {

  val INSTRUCTION_REGISTER_SIZE = 16
  val OPCODE_SIZE = 4
  val DATA_REGISTER_SIZE = 16
  val ADDRESS_REGISTER_SIZE = 12
  val PROGRAM_COUNTER_SIZE = 12
  val TEMPORARY_REGISTER_SIZE = 16
  val INPR_SIZE = 8
  val OUTR_SIZE = 8

  def main(args: Array[String]): Unit = {
    println("\n\n<<<Initializing the morris mano machine Components>>>")
    println("\n\n<<<Initializing the instruction register>>>")
    var ir = new InstructionRegister(INSTRUCTION_REGISTER_SIZE , OPCODE_SIZE)
    println(ir)
    ir.spill

    println("\n\n<<<Initializing the data register>>>")
    var dr = new DataRegister(DATA_REGISTER_SIZE)
    println(dr)
    dr.spill

    println("\n\n<<<Initializing the address register>>>")
    var ar = new AddressRegister(ADDRESS_REGISTER_SIZE)
    println(ar)
    ar.spill

    println("\n\n<<<Initializing the program counter>>>")
    var pc = new ProgramCounter(PROGRAM_COUNTER_SIZE)
    println(pc)
    pc.spill

    println("\n\n<<<Initializing the temporary register>>>")
    var tr = new TemporaryRegister(TEMPORARY_REGISTER_SIZE)
    println(tr)
    tr.spill

    println("\n\n<<<Initializing the input register>>>")
    var inpr = new IORegister(INPR_SIZE , "INPR")
    println(inpr)
    inpr.spill

    println("\n\n<<<Initializing the output register>>>")
    var outr = new IORegister(INPR_SIZE , "OUTR")
    println(outr)
    outr.spill

    println("\n\n<<Initializing Memory>>")
    var ram = new RamModule(INSTRUCTION_REGISTER_SIZE - OPCODE_SIZE)

    var input = scala.collection.mutable.MutableList(true,true,true,false, true, true, true,false)
    var mByte = new M2Byte(input)
    for(i <- 0 to 100)
      ram.moveIntoMemory(scala.collection.mutable.MutableList(mByte), i)

    ram.spill

    var code = FileUtils.readFileToString(new java.io.File("/home/prajeeva/instructions.mm"))
    println("\n" + code)
  }
}

package com.m2.registers

class Register(
                var size:Int,
                var name:String,
                var description:String
              ) {
  var register = List.fill(size)(false)

  def spill = register.map((x:Boolean) => if(x) 1 else 0).map(print)


}

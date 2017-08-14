package com.morrismano.groovy

class SMPSModule {
    def build = "APS power supply"
    def version = 1.0
    def wattage = 5

    def describe(n) {
        n.times {
            println(build)
        }
    }
}
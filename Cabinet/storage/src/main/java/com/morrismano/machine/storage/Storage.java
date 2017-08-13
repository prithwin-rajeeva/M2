package com.morrismano.machine.storage;

public interface Storage {
    boolean store(int sectorId);
    byte read(int sectorId);
}

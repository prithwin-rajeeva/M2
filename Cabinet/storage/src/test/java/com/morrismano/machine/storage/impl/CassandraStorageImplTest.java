package com.morrismano.machine.storage.impl;

import org.testng.annotations.Test;

public class CassandraStorageImplTest {

    @Test
    public void read() throws Exception {
        new CassandraStorageImpl().read(0);
    }

}
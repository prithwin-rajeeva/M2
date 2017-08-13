package com.morrismano.machine.storage.impl;

import com.datastax.driver.core.*;
import com.morrismano.machine.storage.Storage;

public class CassandraStorageImpl implements Storage{
    Session session = null;

    public CassandraStorageImpl() {
        Cluster.Builder builder = Cluster.builder();
        builder.addContactPoint("localhost");
        Cluster cluster = builder.build();
        session = cluster.connect();
    }

    @Override
    public boolean store(int sectorId) {
        return false;
    }

    @Override
    public byte read(int sectorId) {
        String sql = "select * from posts_db.posts";
        PreparedStatement ps = session.prepare(sql);
        BoundStatement boundQuery = ps.bind();
        ResultSet set = session.execute(boundQuery);
        return 0;
    }
}

/*-------------------------------------------------------------------------------------------------
 _______ __   _ _______ _______ ______  ______
 |_____| | \  |    |    |______ |     \ |_____]
 |     | |  \_|    |    ______| |_____/ |_____]

 Copyright (c) 2016, antsdb.com and/or its affiliates. All rights reserved. *-xguo0<@

 This program is free software: you can redistribute it and/or modify it under the terms of the
 GNU GNU Lesser General Public License, version 3, as published by the Free Software Foundation.

 You should have received a copy of the GNU Affero General Public License along with this program.
 If not, see <https://www.gnu.org/licenses/lgpl-3.0.en.html>
-------------------------------------------------------------------------------------------------*/
package com.antsdb.saltedfish.sql;

import java.util.Map;

import com.antsdb.saltedfish.nosql.Replicable;
import com.antsdb.saltedfish.nosql.Replicator;

/**
 * 
 * @author *-xguo0<@
 */
public class SystemViewReplicatorInfo extends PropertyBasedView {

    private Orca orca;

    public SystemViewReplicatorInfo(Orca orca) {
        this.orca = orca;
    }

    @Override
    public Map<String, Object> getProperties() {
        Replicator<Replicable> replicator = this.orca.getReplicator();
        if (replicator != null) {
            return replicator.getSummary();
        }
        else {
            return null;
        }
    }

}

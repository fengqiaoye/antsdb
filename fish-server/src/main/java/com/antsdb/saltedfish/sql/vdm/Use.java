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
package com.antsdb.saltedfish.sql.vdm;

public class Use extends Statement {
    String name;
    
    public Use(String name) {
        super();
        this.name = name;
    }

    @Override
    public Object run(VdmContext ctx, Parameters params) {
        Checks.namespaceExist(ctx.getOrca(), this.name);
        ctx.getSession().setCurrentNamespace(this.name);
        return null;
    }

}

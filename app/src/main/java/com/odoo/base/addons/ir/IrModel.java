/**
 * Odoo, Open Source Management Solution
 * Copyright (C) 2012-today Odoo SA (<http:www.odoo.com>)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http:www.gnu.org/licenses/>
 *
 * Created on 2/1/15 3:18 PM
 */
package com.odoo.base.addons.ir;

import android.content.Context;

import com.odoo.core.orm.OModel;
import com.odoo.core.orm.fields.OColumn;
import com.odoo.core.orm.fields.types.ODateTime;
import com.odoo.core.orm.fields.types.OVarchar;
import com.odoo.core.support.OUser;

public class IrModel extends OModel {
    public static final String TAG = IrModel.class.getSimpleName();

    OColumn name = new OColumn("Model Description", OVarchar.class).setSize(100);
    OColumn model = new OColumn("Model", OVarchar.class).setSize(100);
    OColumn state = new OColumn("State", OVarchar.class).setSize(64);

    OColumn last_synced = new OColumn("Last Synced on ", ODateTime.class)
            .setLocalColumn();

    public IrModel(Context context, OUser user) {
        super(context, "ir.model", user);
    }

    @Override
    public boolean checkForCreateDate() {
        return false;
    }

    @Override
    public boolean checkForWriteDate() {
        return false;
    }

}
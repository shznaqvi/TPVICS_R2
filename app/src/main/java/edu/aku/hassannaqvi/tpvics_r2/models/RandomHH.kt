package edu.aku.hassannaqvi.tpvics_r2.models

import android.database.Cursor
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts.RandomHHTable
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class RandomHH {
    var ID: Long = 0
    var sno: String = _EMPTY_
    var clusteCcode: String = _EMPTY_
    var hhno: String = _EMPTY_
    var headhh: String = _EMPTY_

    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): RandomHH {
        ID = jsonObject.getLong(RandomHHTable.COLUMN_ID)
        sno = jsonObject.getString(RandomHHTable.COLUMN_SNO)
        clusteCcode = jsonObject.getString(RandomHHTable.COLUMN_CLUSTER_CODE)
        hhno = jsonObject.getString(RandomHHTable.COLUMN_HH_NO)
        headhh = jsonObject.getString(RandomHHTable.COLUMN_HEAD_HH)
        return this
    }

    fun hydrate(cursor: Cursor): RandomHH {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_ID))
        sno = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_SNO))
        clusteCcode =
            cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_CLUSTER_CODE))
        hhno = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HH_NO))
        headhh = cursor.getString(cursor.getColumnIndexOrThrow(RandomHHTable.COLUMN_HEAD_HH))
        return this
    }


}
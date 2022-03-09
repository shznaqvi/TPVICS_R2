package edu.aku.hassannaqvi.tpvics_r2.models

import android.database.Cursor
import edu.aku.hassannaqvi.tpvics_r2.contracts.TableContracts.ClusterTable
import edu.aku.hassannaqvi.tpvics_r2.core.MainApp._EMPTY_
import org.json.JSONException
import org.json.JSONObject

/**
 * Created by hassan.naqvi on 11/30/2016.
 */
class Clusters {
    var ID: Long = 0
    var clusterNo: String = _EMPTY_
    var geoarea: String = _EMPTY_
    var distId: String = _EMPTY_

    var province: String = _EMPTY_
    var district: String = _EMPTY_
    var city: String = _EMPTY_
    var area: String = _EMPTY_
    var ebcode: String = _EMPTY_
    var randomized: String = _EMPTY_
    var locked: String = _EMPTY_
    var lockedBy: String = _EMPTY_
    var lockedDateTime: String = _EMPTY_
    var exphh: String = _EMPTY_
    var colflag: String = _EMPTY_
    var problemcl: String = _EMPTY_
    var partners: String = _EMPTY_
    var exphh2: String = _EMPTY_



    constructor() {
        // Default Constructor
    }

    @Throws(JSONException::class)
    fun sync(jsonObject: JSONObject): Clusters {
        clusterNo = jsonObject.getString(ClusterTable.COLUMN_CLUSTER_NO)
        geoarea = jsonObject.getString(ClusterTable.COLUMN_GEOAREA)
        distId = jsonObject.getString(ClusterTable.COLUMN_DIST_ID)

        province = jsonObject.getString(ClusterTable.COLUMN_PROVINCE)
        district = jsonObject.getString(ClusterTable.COLUMN_DISTRICT)
        city = jsonObject.getString(ClusterTable.COLUMN_CITY)
        area = jsonObject.getString(ClusterTable.COLUMN_AREA)
        ebcode = jsonObject.getString(ClusterTable.COLUMN_EB_CODE)
        randomized = jsonObject.getString(ClusterTable.COLUMN_RANDOMIZED)
        locked = jsonObject.getString(ClusterTable.COLUMN_LOCKED)
        lockedBy = jsonObject.getString(ClusterTable.COLUMN_LOCKED_BY)
        lockedDateTime = jsonObject.getString(ClusterTable.COLUMN_LOCKED_DATE_TIME)
        exphh = jsonObject.getString(ClusterTable.COLUMN_EXP_HH)
        colflag = jsonObject.getString(ClusterTable.COLUMN_COLFLAG)
        problemcl = jsonObject.getString(ClusterTable.COLUMN_PROBLEM_CL)
        partners = jsonObject.getString(ClusterTable.COLUMN_PARTNERS)
        exphh2 = jsonObject.getString(ClusterTable.COLUMN_EXPHH2)

        return this
    }

    fun hydrate(cursor: Cursor): Clusters {
        ID = cursor.getLong(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_ID))

        clusterNo = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_CLUSTER_NO))
        geoarea = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_GEOAREA))
        distId = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_DIST_ID))


        province = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_PROVINCE))
        district = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_DISTRICT))
        city = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_CITY))

        area = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_AREA))
        ebcode = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_EB_CODE))
        randomized = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_RANDOMIZED))

        locked = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_LOCKED))
        lockedBy = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_LOCKED_BY))
        lockedDateTime = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_LOCKED_DATE_TIME))

        exphh = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_EXP_HH))
        colflag = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_COLFLAG))
        problemcl = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_PROBLEM_CL))

        partners = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_PARTNERS))
        exphh2 = cursor.getString(cursor.getColumnIndexOrThrow(ClusterTable.COLUMN_EXPHH2))

        return this
    }


}
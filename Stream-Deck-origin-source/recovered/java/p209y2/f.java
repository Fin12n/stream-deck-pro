package p209y2;

import A2.g;
import D6.C0937q;
import D6.L;
import D6.M;
import D6.S;
import D6.z;
import N6.a;
import android.database.Cursor;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final List b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listC = C0937q.c();
        while (cursor.moveToNext()) {
            int i8 = cursor.getInt(columnIndex);
            int i9 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            t.f(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            t.f(string2, "cursor.getString(toColumnIndex)");
            listC.add(new e.d(i8, i9, string, string2));
        }
        return z.H0(C0937q.a(listC));
    }

    public static final Set c(g gVar, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        Cursor cursorP0 = gVar.P0("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorP0.getColumnIndex("id");
            int columnIndex2 = cursorP0.getColumnIndex("seq");
            int columnIndex3 = cursorP0.getColumnIndex("table");
            int columnIndex4 = cursorP0.getColumnIndex("on_delete");
            int columnIndex5 = cursorP0.getColumnIndex("on_update");
            List listB = b(cursorP0);
            cursorP0.moveToPosition(-1);
            Set setB = S.b();
            while (cursorP0.moveToNext()) {
                if (cursorP0.getInt(columnIndex2) == 0) {
                    int i8 = cursorP0.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<e.d> arrayList3 = new ArrayList();
                    for (Object obj : listB) {
                        if (((e.d) obj).c() == i8) {
                            arrayList3.add(obj);
                        }
                    }
                    for (e.d dVar : arrayList3) {
                        arrayList.add(dVar.b());
                        arrayList2.add(dVar.d());
                    }
                    String string = cursorP0.getString(columnIndex3);
                    t.f(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorP0.getString(columnIndex4);
                    t.f(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorP0.getString(columnIndex5);
                    t.f(string3, "cursor.getString(onUpdateColumnIndex)");
                    setB.add(new e.c(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setA = S.a(setB);
            a.a(cursorP0, null);
            return setA;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(cursorP0, th);
                throw th2;
            }
        }
    }

    public static final e.C0846e d(g gVar, String str, boolean z8) throws IllegalAccessException, IOException, InvocationTargetException {
        Cursor cursorP0 = gVar.P0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorP0.getColumnIndex("seqno");
            int columnIndex2 = cursorP0.getColumnIndex("cid");
            int columnIndex3 = cursorP0.getColumnIndex("name");
            int columnIndex4 = cursorP0.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorP0.moveToNext()) {
                    if (cursorP0.getInt(columnIndex2) >= 0) {
                        int i8 = cursorP0.getInt(columnIndex);
                        String columnName = cursorP0.getString(columnIndex3);
                        String str2 = cursorP0.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i8);
                        t.f(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i8), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                t.f(collectionValues, "columnsMap.values");
                List listR0 = z.R0(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                t.f(collectionValues2, "ordersMap.values");
                e.C0846e c0846e = new e.C0846e(str, z8, listR0, z.R0(collectionValues2));
                a.a(cursorP0, null);
                return c0846e;
            }
            a.a(cursorP0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(cursorP0, th);
                throw th2;
            }
        }
    }

    public static final Set e(g gVar, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        Cursor cursorP0 = gVar.P0("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorP0.getColumnIndex("name");
            int columnIndex2 = cursorP0.getColumnIndex("origin");
            int columnIndex3 = cursorP0.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setB = S.b();
                while (cursorP0.moveToNext()) {
                    if (t.c("c", cursorP0.getString(columnIndex2))) {
                        String name = cursorP0.getString(columnIndex);
                        boolean z8 = true;
                        if (cursorP0.getInt(columnIndex3) != 1) {
                            z8 = false;
                        }
                        t.f(name, "name");
                        e.C0846e c0846eD = d(gVar, name, z8);
                        if (c0846eD == null) {
                            a.a(cursorP0, null);
                            return null;
                        }
                        setB.add(c0846eD);
                    }
                }
                Set setA = S.a(setB);
                a.a(cursorP0, null);
                return setA;
            }
            a.a(cursorP0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(cursorP0, th);
                throw th2;
            }
        }
    }

    public static final e f(g database, String tableName) {
        t.g(database, "database");
        t.g(tableName, "tableName");
        return new e(tableName, a(database, tableName), c(database, tableName), e(database, tableName));
    }

    public static final Map a(g gVar, String str) throws IllegalAccessException, IOException, InvocationTargetException {
        String str2 = WaYxBuDSBD.syneneOMlYs;
        Cursor cursorP0 = gVar.P0("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorP0.getColumnCount() <= 0) {
                Map mapG = M.g();
                a.a(cursorP0, null);
                return mapG;
            }
            int columnIndex = cursorP0.getColumnIndex("name");
            int columnIndex2 = cursorP0.getColumnIndex(str2);
            int columnIndex3 = cursorP0.getColumnIndex("notnull");
            int columnIndex4 = cursorP0.getColumnIndex("pk");
            int columnIndex5 = cursorP0.getColumnIndex("dflt_value");
            Map mapC = L.c();
            while (cursorP0.moveToNext()) {
                String name = cursorP0.getString(columnIndex);
                String string = cursorP0.getString(columnIndex2);
                boolean z8 = cursorP0.getInt(columnIndex3) != 0;
                int i8 = cursorP0.getInt(columnIndex4);
                String string2 = cursorP0.getString(columnIndex5);
                t.f(name, "name");
                t.f(string, str2);
                mapC.put(name, new e.a(name, string, z8, i8, string2, 2));
            }
            Map mapB = L.b(mapC);
            a.a(cursorP0, null);
            return mapB;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                a.a(cursorP0, th);
                throw th2;
            }
        }
    }
}

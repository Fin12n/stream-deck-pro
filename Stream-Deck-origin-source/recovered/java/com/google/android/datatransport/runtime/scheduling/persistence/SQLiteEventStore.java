package com.google.android.datatransport.runtime.scheduling.persistence;

import Z.JTT.ryTuoS;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p131o4.AbstractC2753e;
import p131o4.AbstractC2758j;
import p131o4.InterfaceC2751c;
import p131o4.InterfaceC2752d;
import p143q0.nKy.bGZGhbtQmA;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class SQLiteEventStore implements InterfaceC2752d, p139p4.b, InterfaceC2751c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p032d4.b f17854f = p032d4.b.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SchemaManager f17855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p147q4.a f17856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p147q4.a f17857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC2753e f17858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final B6.a f17859e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        Object apply(Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f17861b;

        public c(String str, String str2) {
            this.f17860a = str;
            this.f17861b = str2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        Object a();
    }

    public SQLiteEventStore(p147q4.a aVar, p147q4.a aVar2, AbstractC2753e abstractC2753e, SchemaManager schemaManager, B6.a aVar3) {
        this.f17855a = schemaManager;
        this.f17856b = aVar;
        this.f17857c = aVar2;
        this.f17858d = abstractC2753e;
        this.f17859e = aVar3;
    }

    public static /* synthetic */ SQLiteDatabase A(Throwable th) {
        throw new p139p4.a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ List A0(SQLiteDatabase sQLiteDatabase) {
        return (List) k2(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: o4.I
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.y((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ p086j4.a H0(SQLiteEventStore sQLiteEventStore, Map map, p086j4.a.C0614a c0614a, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            j4.c.b bVarR1 = sQLiteEventStore.r1(cursor.getInt(1));
            long j8 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(p086j4.c.c().c(bVarR1).b(j8).a());
        }
        sQLiteEventStore.f2(c0614a, map);
        c0614a.e(sQLiteEventStore.U1());
        c0614a.d(sQLiteEventStore.M1());
        c0614a.c((String) sQLiteEventStore.f17859e.get());
        return c0614a.b();
    }

    public static /* synthetic */ Object O0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long Q0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object T0(Throwable th) {
        throw new p139p4.a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ Object Y(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.j(cursor.getInt(0), j4.c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object a1(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j8 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j8));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j8), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static byte[] e2(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static /* synthetic */ Integer g1(final SQLiteEventStore sQLiteEventStore, long j8, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        String[] strArr = {String.valueOf(j8)};
        k2(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: o4.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.Y(this.f30938a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object i0(final SQLiteEventStore sQLiteEventStore, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        k2(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: o4.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.z(this.f30943a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Object i1(SQLiteEventStore sQLiteEventStore, List list, com.google.android.datatransport.runtime.e eVar, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            long j8 = cursor.getLong(0);
            boolean z8 = cursor.getInt(7) != 0;
            com.google.android.datatransport.runtime.d.a aVarK = com.google.android.datatransport.runtime.d.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            if (z8) {
                aVarK.h(new p059g4.e(i2(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                aVarK.h(new p059g4.e(i2(cursor.getString(4)), sQLiteEventStore.g2(j8)));
            }
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC2758j.a(j8, eVar, aVarK.d()));
        }
        return null;
    }

    public static p032d4.b i2(String str) {
        return str == null ? f17854f : p032d4.b.b(str);
    }

    public static /* synthetic */ Boolean j0(SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.e eVar, SQLiteDatabase sQLiteDatabase) {
        Long lX1 = sQLiteEventStore.X1(sQLiteDatabase, eVar);
        return lX1 == null ? Boolean.FALSE : (Boolean) k2(sQLiteEventStore.K1().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lX1.toString()}), new b() { // from class: o4.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static String j2(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC2758j) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static /* synthetic */ Object k1(SQLiteEventStore sQLiteEventStore, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.f17856b.a()).execute();
        return null;
    }

    public static Object k2(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ p086j4.a o1(final SQLiteEventStore sQLiteEventStore, String str, final Map map, final p086j4.a.C0614a c0614a, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        return (p086j4.a) k2(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: o4.z
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.H0(this.f30948a, map, c0614a, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long p1(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ p086j4.f q1(final long j8, SQLiteDatabase sQLiteDatabase) {
        return (p086j4.f) k2(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: o4.C
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.t(j8, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Object r0(long j8, com.google.android.datatransport.runtime.e eVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j8));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{eVar.b(), String.valueOf(p155r4.a.a(eVar.d()))}) < 1) {
            contentValues.put("backend_name", eVar.b());
            contentValues.put("priority", Integer.valueOf(p155r4.a.a(eVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ p086j4.f t(long j8, Cursor cursor) {
        cursor.moveToNext();
        return p086j4.f.c().c(cursor.getLong(0)).b(j8).a();
    }

    public static /* synthetic */ List v(SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.e eVar, SQLiteDatabase sQLiteDatabase) {
        List listC2 = sQLiteEventStore.c2(sQLiteDatabase, eVar, sQLiteEventStore.f17858d.d());
        for (p032d4.d dVar : p032d4.d.values()) {
            if (dVar != eVar.d()) {
                int iD = sQLiteEventStore.f17858d.d() - listC2.size();
                if (iD <= 0) {
                    break;
                }
                listC2.addAll(sQLiteEventStore.c2(sQLiteDatabase, eVar.f(dVar), iD));
            }
        }
        return sQLiteEventStore.b2(listC2, sQLiteEventStore.d2(sQLiteDatabase, listC2));
    }

    public static /* synthetic */ byte[] w0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            byte[] bArr2 = (byte[]) arrayList.get(i8);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ List y(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(com.google.android.datatransport.runtime.e.a().b(cursor.getString(1)).d(p155r4.a.b(cursor.getInt(2))).c(e2(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object z(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.j(cursor.getInt(0), j4.c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final void B1(final SQLiteDatabase sQLiteDatabase) {
        h2(new d() { // from class: o4.k
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.d
            public final Object a() {
                return SQLiteEventStore.O0(sQLiteDatabase);
            }
        }, new b() { // from class: o4.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.T0((Throwable) obj);
            }
        });
    }

    @Override // p131o4.InterfaceC2752d
    public int C() {
        final long jA = this.f17856b.a() - this.f17858d.c();
        return ((Integer) Z1(new b() { // from class: o4.H
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.g1(this.f30904a, jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    public final long C1(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.e eVar) {
        Long lX1 = X1(sQLiteDatabase, eVar);
        if (lX1 != null) {
            return lX1.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", eVar.b());
        contentValues.put("priority", Integer.valueOf(p155r4.a.a(eVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (eVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(eVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long D1() {
        return P1() * R1();
    }

    @Override // p131o4.InterfaceC2752d
    public void E(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            K1().compileStatement("DELETE FROM events WHERE _id in " + j2(iterable)).execute();
        }
    }

    @Override // p131o4.InterfaceC2752d
    public long E1(com.google.android.datatransport.runtime.e eVar) {
        return ((Long) k2(K1().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{eVar.b(), String.valueOf(p155r4.a.a(eVar.d()))}), new b() { // from class: o4.F
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.p1((Cursor) obj);
            }
        })).longValue();
    }

    public SQLiteDatabase K1() {
        final SchemaManager schemaManager = this.f17855a;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) h2(new d() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.d
            public final Object a() {
                return schemaManager.getWritableDatabase();
            }
        }, new b() { // from class: o4.D
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.A((Throwable) obj);
            }
        });
    }

    @Override // p131o4.InterfaceC2752d
    public boolean L1(final com.google.android.datatransport.runtime.e eVar) {
        return ((Boolean) Z1(new b() { // from class: o4.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.j0(this.f30930a, eVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    public final p086j4.b M1() {
        return p086j4.b.b().b(p086j4.e.c().b(D1()).c(AbstractC2753e.f30922a.f()).a()).a();
    }

    public final long P1() {
        return K1().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    @Override // p131o4.InterfaceC2752d
    public void Q1(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + j2(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            Z1(new b() { // from class: o4.J
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
                public final Object apply(Object obj) {
                    return SQLiteEventStore.i0(this.f30906a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public final long R1() {
        return K1().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final p086j4.f U1() {
        final long jA = this.f17856b.a();
        return (p086j4.f) Z1(new b() { // from class: o4.B
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.q1(jA, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p131o4.InterfaceC2752d
    public Iterable W(final com.google.android.datatransport.runtime.e eVar) {
        return (Iterable) Z1(new b() { // from class: o4.l
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.v(this.f30928a, eVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long X1(SQLiteDatabase sQLiteDatabase, com.google.android.datatransport.runtime.e eVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(eVar.b(), String.valueOf(p155r4.a.a(eVar.d()))));
        if (eVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(eVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) k2(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: o4.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.Q0((Cursor) obj);
            }
        });
    }

    public Object Z1(b bVar) {
        SQLiteDatabase sQLiteDatabaseK1 = K1();
        sQLiteDatabaseK1.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseK1);
            sQLiteDatabaseK1.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseK1.endTransaction();
        }
    }

    public final boolean a2() {
        return P1() * R1() >= this.f17858d.f();
    }

    @Override // p139p4.b
    public Object b(p4.b.a aVar) {
        SQLiteDatabase sQLiteDatabaseK1 = K1();
        B1(sQLiteDatabaseK1);
        try {
            Object objA = aVar.a();
            sQLiteDatabaseK1.setTransactionSuccessful();
            return objA;
        } finally {
            sQLiteDatabaseK1.endTransaction();
        }
    }

    public final List b2(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC2758j abstractC2758j = (AbstractC2758j) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC2758j.c()))) {
                com.google.android.datatransport.runtime.d.a aVarL = abstractC2758j.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC2758j.c()))) {
                    aVarL.c(cVar.f17860a, cVar.f17861b);
                }
                listIterator.set(AbstractC2758j.a(abstractC2758j.c(), abstractC2758j.d(), aVarL.d()));
            }
        }
        return list;
    }

    @Override // p131o4.InterfaceC2751c
    public void c() {
        Z1(new b() { // from class: o4.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.k1(this.f30934a, (SQLiteDatabase) obj);
            }
        });
    }

    public final List c2(SQLiteDatabase sQLiteDatabase, final com.google.android.datatransport.runtime.e eVar, int i8) {
        final ArrayList arrayList = new ArrayList();
        Long lX1 = X1(sQLiteDatabase, eVar);
        if (lX1 == null) {
            return arrayList;
        }
        k2(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lX1.toString()}, null, null, null, String.valueOf(i8)), new b() { // from class: o4.w
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.i1(this.f30944a, arrayList, eVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17855a.close();
    }

    @Override // p131o4.InterfaceC2752d
    public void d0(final com.google.android.datatransport.runtime.e eVar, final long j8) {
        Z1(new b() { // from class: o4.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.r0(j8, eVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final Map d2(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i8 = 0; i8 < list.size(); i8++) {
            sb.append(((AbstractC2758j) list.get(i8)).c());
            if (i8 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        k2(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: o4.y
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.a1(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void f2(p086j4.a.C0614a c0614a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0614a.a(p086j4.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] g2(long j8) {
        return (byte[]) k2(K1().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j8)}, null, null, "sequence_num"), new b() { // from class: o4.A
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.w0((Cursor) obj);
            }
        });
    }

    public final Object h2(d dVar, b bVar) {
        long jA = this.f17857c.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e8) {
                if (this.f17857c.a() >= ((long) this.f17858d.b()) + jA) {
                    return bVar.apply(e8);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // p131o4.InterfaceC2751c
    public void j(final long j8, final j4.c.b bVar, final String str) {
        Z1(new b() { // from class: o4.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.V0(str, bVar, j8, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // p131o4.InterfaceC2752d
    public Iterable l0() {
        return (Iterable) Z1(new b() { // from class: o4.E
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.A0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // p131o4.InterfaceC2751c
    public p086j4.a o() {
        final p086j4.a.C0614a c0614aE = p086j4.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (p086j4.a) Z1(new b() { // from class: o4.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.o1(this.f30939a, str, map, c0614aE, (SQLiteDatabase) obj);
            }
        });
    }

    public final j4.c.b r1(int i8) {
        j4.c.b bVar = j4.c.b.REASON_UNKNOWN;
        if (i8 == bVar.getNumber()) {
            return bVar;
        }
        j4.c.b bVar2 = j4.c.b.MESSAGE_TOO_OLD;
        if (i8 == bVar2.getNumber()) {
            return bVar2;
        }
        j4.c.b bVar3 = j4.c.b.CACHE_FULL;
        if (i8 == bVar3.getNumber()) {
            return bVar3;
        }
        j4.c.b bVar4 = j4.c.b.PAYLOAD_TOO_BIG;
        if (i8 == bVar4.getNumber()) {
            return bVar4;
        }
        j4.c.b bVar5 = j4.c.b.MAX_RETRIES_REACHED;
        if (i8 == bVar5.getNumber()) {
            return bVar5;
        }
        j4.c.b bVar6 = j4.c.b.INVALID_PAYLOD;
        if (i8 == bVar6.getNumber()) {
            return bVar6;
        }
        j4.c.b bVar7 = j4.c.b.SERVER_ERROR;
        if (i8 == bVar7.getNumber()) {
            return bVar7;
        }
        p095k4.a.a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i8));
        return bVar;
    }

    @Override // p131o4.InterfaceC2752d
    public AbstractC2758j z1(final com.google.android.datatransport.runtime.e eVar, final com.google.android.datatransport.runtime.d dVar) {
        p095k4.a.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", eVar.d(), dVar.j(), eVar.b());
        long jLongValue = ((Long) Z1(new b() { // from class: o4.G
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return SQLiteEventStore.L0(this.f30901a, dVar, eVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC2758j.a(jLongValue, eVar, dVar);
    }

    public static /* synthetic */ Long L0(SQLiteEventStore sQLiteEventStore, com.google.android.datatransport.runtime.d dVar, com.google.android.datatransport.runtime.e eVar, SQLiteDatabase sQLiteDatabase) {
        boolean z8;
        byte[] bArr;
        if (sQLiteEventStore.a2()) {
            sQLiteEventStore.j(1L, j4.c.b.CACHE_FULL, dVar.j());
            return -1L;
        }
        long jC1 = sQLiteEventStore.C1(sQLiteDatabase, eVar);
        int iE = sQLiteEventStore.f17858d.e();
        byte[] bArrA = dVar.e().a();
        if (bArrA.length <= iE) {
            z8 = true;
        } else {
            z8 = false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jC1));
        contentValues.put(bGZGhbtQmA.JSiVWdnRBg, dVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(dVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(dVar.k()));
        contentValues.put("payload_encoding", dVar.e().b().a());
        contentValues.put("code", dVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z8));
        if (z8) {
            bArr = bArrA;
        } else {
            bArr = new byte[0];
        }
        contentValues.put("payload", bArr);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z8) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i8 = 1; i8 <= iCeil; i8++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i8 - 1) * iE, Math.min(i8 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i8));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : dVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    public static /* synthetic */ Object V0(String str, j4.c.b bVar, long j8, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) k2(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: o4.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put(ryTuoS.xCbMKy, Long.valueOf(j8));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        }
        sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j8 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        return null;
    }
}

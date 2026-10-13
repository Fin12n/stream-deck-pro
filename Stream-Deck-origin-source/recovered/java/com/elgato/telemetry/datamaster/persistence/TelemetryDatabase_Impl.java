package com.elgato.telemetry.datamaster.persistence;

import A2.g;
import A2.h;
import P2.Lsk.mHPawN;
import Z3.d;
import androidx.room.c;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p193w2.r;
import p193w2.t;
import p209y2.b;
import p209y2.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class TelemetryDatabase_Impl extends TelemetryDatabase {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile d f17680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile Z3.a f17681r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends t.b {
        public a(int i8) {
            super(i8);
        }

        @Override // w2.t.b
        public void a(g gVar) {
            gVar.L("CREATE TABLE IF NOT EXISTS `stored_events` (`insert_id` TEXT NOT NULL, `event_name` TEXT NOT NULL, `properties_json` TEXT NOT NULL, `timestamp_ms` INTEGER NOT NULL, PRIMARY KEY(`insert_id`))");
            gVar.L("CREATE TABLE IF NOT EXISTS `session_state` (`state_key` TEXT NOT NULL, `state_value` TEXT NOT NULL, PRIMARY KEY(`state_key`))");
            gVar.L("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            gVar.L("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bf6e889efa76a7f1b548751a4b9582ba')");
        }

        @Override // w2.t.b
        public void b(g gVar) {
            gVar.L("DROP TABLE IF EXISTS `stored_events`");
            gVar.L("DROP TABLE IF EXISTS `session_state`");
            List list = TelemetryDatabase_Impl.this.f36844h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r.b) it.next()).b(gVar);
                }
            }
        }

        @Override // w2.t.b
        public void c(g gVar) {
            List list = TelemetryDatabase_Impl.this.f36844h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r.b) it.next()).a(gVar);
                }
            }
        }

        @Override // w2.t.b
        public void d(g gVar) {
            TelemetryDatabase_Impl.this.f36837a = gVar;
            TelemetryDatabase_Impl.this.w(gVar);
            List list = TelemetryDatabase_Impl.this.f36844h;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r.b) it.next()).c(gVar);
                }
            }
        }

        @Override // w2.t.b
        public void e(g gVar) {
        }

        @Override // w2.t.b
        public void f(g gVar) throws IllegalAccessException, IOException, InvocationTargetException {
            b.b(gVar);
        }

        @Override // w2.t.b
        public t.c g(g gVar) {
            HashMap map = new HashMap(4);
            map.put("insert_id", new e.a("insert_id", "TEXT", true, 1, null, 1));
            map.put("event_name", new e.a("event_name", "TEXT", true, 0, null, 1));
            map.put(ajyWhveMDgQ.pupNXLtj, new e.a("properties_json", "TEXT", true, 0, null, 1));
            map.put("timestamp_ms", new e.a("timestamp_ms", "INTEGER", true, 0, null, 1));
            e eVar = new e("stored_events", map, new HashSet(0), new HashSet(0));
            e eVarA = e.a(gVar, "stored_events");
            if (!eVar.equals(eVarA)) {
                return new t.c(false, "stored_events(com.elgato.telemetry.datamaster.persistence.StoredEventEntity).\n Expected:\n" + eVar + "\n Found:\n" + eVarA);
            }
            HashMap map2 = new HashMap(2);
            map2.put("state_key", new e.a("state_key", "TEXT", true, 1, null, 1));
            map2.put(mHPawN.lXGzYuE, new e.a("state_value", "TEXT", true, 0, null, 1));
            e eVar2 = new e("session_state", map2, new HashSet(0), new HashSet(0));
            e eVarA2 = e.a(gVar, "session_state");
            if (eVar2.equals(eVarA2)) {
                return new t.c(true, null);
            }
            return new t.c(false, "session_state(com.elgato.telemetry.datamaster.persistence.SessionStateEntity).\n Expected:\n" + eVar2 + "\n Found:\n" + eVarA2);
        }
    }

    @Override // com.elgato.telemetry.datamaster.persistence.TelemetryDatabase
    public Z3.a D() {
        Z3.a aVar;
        if (this.f17681r != null) {
            return this.f17681r;
        }
        synchronized (this) {
            try {
                if (this.f17681r == null) {
                    this.f17681r = new Z3.b(this);
                }
                aVar = this.f17681r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // com.elgato.telemetry.datamaster.persistence.TelemetryDatabase
    public d E() {
        d dVar;
        if (this.f17680q != null) {
            return this.f17680q;
        }
        synchronized (this) {
            try {
                if (this.f17680q == null) {
                    this.f17680q = new Z3.e(this);
                }
                dVar = this.f17680q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // p193w2.r
    public c g() {
        return new c(this, new HashMap(0), new HashMap(0), "stored_events", "session_state");
    }

    @Override // p193w2.r
    public h h(p193w2.h hVar) {
        return hVar.f36807c.a(h.b.a(hVar.f36805a).c(hVar.f36806b).b(new t(hVar, new a(1), "bf6e889efa76a7f1b548751a4b9582ba", "2c2aec2b3e132cc1785eb9f5cabc0095")).a());
    }

    @Override // p193w2.r
    public List j(Map map) {
        return new ArrayList();
    }

    @Override // p193w2.r
    public Set p() {
        return new HashSet();
    }

    @Override // p193w2.r
    public Map q() {
        HashMap map = new HashMap();
        map.put(d.class, Z3.e.i());
        map.put(Z3.a.class, Z3.b.e());
        return map;
    }
}

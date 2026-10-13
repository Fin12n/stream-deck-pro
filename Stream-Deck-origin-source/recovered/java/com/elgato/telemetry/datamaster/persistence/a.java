package com.elgato.telemetry.datamaster.persistence;

import C6.G;
import C6.r;
import D6.C0938s;
import X3.i;
import Y3.k;
import Z2.j;
import android.content.Context;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import q7.N0;
import q7.Z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0421a f17683g = new C0421a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TelemetryDatabase f17684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z3.d f17686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z3.a f17687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p098k7.a f17688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r7.c.a f17689f;

    /* JADX INFO: renamed from: com.elgato.telemetry.datamaster.persistence.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0421a {
        public /* synthetic */ C0421a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0421a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        SessionActive("session_active"),
        SessionStartTime(SZCvugJaXc.EAitDwZCIV),
        LastHeartbeat("last_heartbeat");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ J6.a f17694f = J6.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f17695a;

        b(String str) {
            this.f17695a = str;
        }

        public final String b() {
            return this.f17695a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f17697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f17698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17699d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17701f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f17699d = obj;
            this.f17701f |= Integer.MIN_VALUE;
            return a.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f17703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17704c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17706e;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f17704c = obj;
            this.f17706e |= Integer.MIN_VALUE;
            return a.this.d(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f17708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17710d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17712f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f17710d = obj;
            this.f17712f |= Integer.MIN_VALUE;
            return a.this.f(0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17713a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f17714b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f17715c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f17716d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17718f;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f17716d = obj;
            this.f17718f |= Integer.MIN_VALUE;
            return a.this.g(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17721c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17723e;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f17721c = obj;
            this.f17723e |= Integer.MIN_VALUE;
            return a.this.k(0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f17724a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f17725b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i8, a aVar) {
            super(0);
            this.f17724a = i8;
            this.f17725b = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "Trimming " + this.f17724a + " oldest events to stay within " + this.f17725b.f17685b + " limit";
        }
    }

    public a(TelemetryDatabase database, int i8) {
        t.g(database, "database");
        this.f17684a = database;
        this.f17685b = i8;
        this.f17686c = database.E();
        this.f17687d = database.D();
        this.f17688e = p098k7.c.b(false, 1, null);
        this.f17689f = r7.c.f32534d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009b, code lost:
    
        if (r11.e(r2, r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [Y3.k, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v2, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v8, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [Y3.k] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.elgato.telemetry.datamaster.persistence.a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(k kVar, G6.d dVar) throws Throwable {
        c cVar;
        p098k7.a aVar;
        a aVar2;
        ?? r10;
        ?? r8;
        p098k7.a aVar3;
        ?? r9;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f17701f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f17701f = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f17699d;
        Object objF = H6.c.f();
        int i9 = cVar.f17701f;
        try {
            try {
                if (i9 == 0) {
                    r.b(obj);
                    aVar = this.f17688e;
                    cVar.f17696a = this;
                    cVar.f17697b = kVar;
                    cVar.f17698c = aVar;
                    cVar.f17701f = 1;
                    if (aVar.b(null, cVar) != objF) {
                        aVar2 = this;
                        r10 = kVar;
                    }
                    return objF;
                }
                if (i9 == 1) {
                    p098k7.a aVar4 = (p098k7.a) cVar.f17698c;
                    k kVar2 = (k) cVar.f17697b;
                    aVar2 = (a) cVar.f17696a;
                    r.b(obj);
                    aVar = aVar4;
                    r10 = kVar2;
                } else if (i9 == 2) {
                    p098k7.a aVar5 = (p098k7.a) cVar.f17698c;
                    k kVar3 = (k) cVar.f17697b;
                    a aVar6 = (a) cVar.f17696a;
                    r.b(obj);
                    r8 = kVar3;
                    r9 = aVar6;
                    aVar3 = aVar5;
                    Z3.d dVar2 = r9.f17686c;
                    Z3.f fVarI = r9.i(r8);
                    cVar.f17696a = aVar3;
                    cVar.f17697b = null;
                    cVar.f17698c = null;
                    cVar.f17701f = 3;
                    kVar = aVar3;
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p098k7.a aVar7 = (p098k7.a) cVar.f17696a;
                    r.b(obj);
                    kVar = aVar7;
                }
                G g8 = G.f1419a;
                kVar.e(null);
                return G.f1419a;
                cVar.f17696a = aVar2;
                cVar.f17697b = r10;
                cVar.f17698c = aVar;
                cVar.f17701f = 2;
                if (aVar2.k(1, cVar) != objF) {
                    r8 = r10;
                    aVar3 = aVar;
                    r9 = aVar2;
                    Z3.d dVar3 = r9.f17686c;
                    Z3.f fVarI2 = r9.i(r8);
                    cVar.f17696a = aVar3;
                    cVar.f17697b = null;
                    cVar.f17698c = null;
                    cVar.f17701f = 3;
                    kVar = aVar3;
                }
                return objF;
            } catch (Throwable th) {
                p098k7.a aVar8 = aVar;
                th = th;
                kVar = aVar8;
                kVar.e(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(G6.d dVar) {
        d dVar2;
        p098k7.a aVar;
        a aVar2;
        p098k7.a aVar3;
        Throwable th;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f17706e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f17706e = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f17704c;
        Object objF = H6.c.f();
        int i9 = dVar2.f17706e;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar = this.f17688e;
                dVar2.f17702a = this;
                dVar2.f17703b = aVar;
                dVar2.f17706e = 1;
                if (aVar.b(null, dVar2) != objF) {
                    aVar2 = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p098k7.a) dVar2.f17702a;
                try {
                    r.b(obj);
                    Integer numD = I6.b.d(((Number) obj).intValue());
                    aVar3.e(null);
                    return numD;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            p098k7.a aVar4 = (p098k7.a) dVar2.f17703b;
            aVar2 = (a) dVar2.f17702a;
            r.b(obj);
            aVar = aVar4;
            Z3.d dVar3 = aVar2.f17686c;
            dVar2.f17702a = aVar;
            dVar2.f17703b = null;
            dVar2.f17706e = 2;
            Object objD = dVar3.d(dVar2);
            if (objD != objF) {
                aVar3 = aVar;
                obj = objD;
                Integer numD2 = I6.b.d(((Number) obj).intValue());
                aVar3.e(null);
                return numD2;
            }
            return objF;
        } catch (Throwable th3) {
            aVar3 = aVar;
            th = th3;
            aVar3.e(null);
            throw th;
        }
    }

    public final Object e(b bVar, G6.d dVar) {
        return this.f17687d.a(bVar.b(), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008e A[Catch: all -> 0x0035, LOOP:0: B:29:0x0088->B:31:0x008e, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0031, B:28:0x0077, B:29:0x0088, B:31:0x008e), top: B:41:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(int i8, G6.d dVar) throws Throwable {
        e eVar;
        p098k7.a aVar;
        a aVar2;
        Throwable th;
        p098k7.a aVar3;
        a aVar4;
        ArrayList arrayList;
        Iterator it;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i9 = eVar.f17712f;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                eVar.f17712f = i9 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object obj = eVar.f17710d;
        Object objF = H6.c.f();
        int i10 = eVar.f17712f;
        try {
            if (i10 == 0) {
                r.b(obj);
                aVar = this.f17688e;
                eVar.f17707a = this;
                eVar.f17708b = aVar;
                eVar.f17709c = i8;
                eVar.f17712f = 1;
                if (aVar.b(null, eVar) != objF) {
                    aVar2 = this;
                }
                return objF;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p098k7.a) eVar.f17708b;
                aVar4 = (a) eVar.f17707a;
                try {
                    r.b(obj);
                    Iterable iterable = (Iterable) obj;
                    arrayList = new ArrayList(C0938s.y(iterable, 10));
                    it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(aVar4.j((Z3.f) it.next()));
                    }
                    aVar3.e(null);
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            i8 = eVar.f17709c;
            p098k7.a aVar5 = (p098k7.a) eVar.f17708b;
            aVar2 = (a) eVar.f17707a;
            r.b(obj);
            aVar = aVar5;
            Z3.d dVar2 = aVar2.f17686c;
            eVar.f17707a = aVar2;
            eVar.f17708b = aVar;
            eVar.f17712f = 2;
            Object objA = dVar2.a(i8, eVar);
            if (objA != objF) {
                p098k7.a aVar6 = aVar;
                obj = objA;
                aVar3 = aVar6;
                aVar4 = aVar2;
                Iterable iterable2 = (Iterable) obj;
                arrayList = new ArrayList(C0938s.y(iterable2, 10));
                it = iterable2.iterator();
                while (it.hasNext()) {
                    arrayList.add(aVar4.j((Z3.f) it.next()));
                }
                aVar3.e(null);
                return arrayList;
            }
            return objF;
        } catch (Throwable th3) {
            p098k7.a aVar7 = aVar;
            th = th3;
            aVar3 = aVar7;
            aVar3.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(List list, G6.d dVar) throws Throwable {
        f fVar;
        p098k7.a aVar;
        a aVar2;
        Throwable th;
        p098k7.a aVar3;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f17718f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f17718f = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f17716d;
        Object objF = H6.c.f();
        int i9 = fVar.f17718f;
        try {
            if (i9 == 0) {
                r.b(obj);
                aVar = this.f17688e;
                fVar.f17713a = this;
                fVar.f17714b = list;
                fVar.f17715c = aVar;
                fVar.f17718f = 1;
                if (aVar.b(null, fVar) != objF) {
                    aVar2 = this;
                }
                return objF;
            }
            if (i9 != 1) {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar3 = (p098k7.a) fVar.f17713a;
                try {
                    r.b(obj);
                    G g8 = G.f1419a;
                    aVar3.e(null);
                    return G.f1419a;
                } catch (Throwable th2) {
                    th = th2;
                    aVar3.e(null);
                    throw th;
                }
            }
            p098k7.a aVar4 = (p098k7.a) fVar.f17715c;
            List list2 = (List) fVar.f17714b;
            aVar2 = (a) fVar.f17713a;
            r.b(obj);
            aVar = aVar4;
            list = list2;
            Z3.d dVar2 = aVar2.f17686c;
            fVar.f17713a = aVar;
            fVar.f17714b = null;
            fVar.f17715c = null;
            fVar.f17718f = 2;
            if (dVar2.c(list, fVar) != objF) {
                aVar3 = aVar;
                G g9 = G.f1419a;
                aVar3.e(null);
                return G.f1419a;
            }
            return objF;
        } catch (Throwable th3) {
            p098k7.a aVar5 = aVar;
            th = th3;
            aVar3 = aVar5;
            aVar3.e(null);
            throw th;
        }
    }

    public final Object h(b bVar, String str, G6.d dVar) {
        Object objB = this.f17687d.b(new Z3.c(bVar.b(), str), dVar);
        return objB == H6.c.f() ? objB : G.f1419a;
    }

    public final Z3.f i(k kVar) {
        String strC = kVar.c();
        String strB = kVar.b();
        r7.c.a aVar = this.f17689f;
        Map mapD = kVar.d();
        aVar.a();
        return new Z3.f(strC, strB, aVar.c(new Z(N0.f32043a, i.Companion.serializer()), mapD), kVar.e());
    }

    public final k j(Z3.f fVar) {
        String strA = fVar.a();
        r7.c.a aVar = this.f17689f;
        String strC = fVar.c();
        aVar.a();
        return new k(strA, (Map) aVar.b(new Z(N0.f32043a, i.Companion.serializer()), strC), fVar.d(), fVar.b());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
    
        if (r11.b(r12, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(int i8, G6.d dVar) {
        g gVar;
        a aVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i9 = gVar.f17723e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                gVar.f17723e = i9 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objD = gVar.f17721c;
        Object objF = H6.c.f();
        int i10 = gVar.f17723e;
        if (i10 != 0) {
            if (i10 == 1) {
                i8 = gVar.f17720b;
                aVar = (a) gVar.f17719a;
                r.b(objD);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objD);
            }
            return G.f1419a;
        }
        r.b(objD);
        Z3.d dVar2 = this.f17686c;
        gVar.f17719a = this;
        gVar.f17720b = i8;
        gVar.f17723e = 1;
        objD = dVar2.d(gVar);
        if (objD != objF) {
            aVar = this;
        }
        return objF;
        int iIntValue = (((Number) objD).intValue() + i8) - aVar.f17685b;
        if (iIntValue <= 0) {
            return G.f1419a;
        }
        j.a.h(j.f12858c, "TelemetryStore", null, new h(iIntValue, aVar), 2, null);
        Z3.d dVar3 = aVar.f17686c;
        gVar.f17719a = null;
        gVar.f17723e = 2;
    }

    public /* synthetic */ a(TelemetryDatabase telemetryDatabase, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(telemetryDatabase, (i9 & 2) != 0 ? 1000 : i8);
    }

    public /* synthetic */ a(Context context, int i8, boolean z8, int i9, AbstractC2633k abstractC2633k) {
        this(context, (i9 & 2) != 0 ? 1000 : i8, (i9 & 4) != 0 ? false : z8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, int i8, boolean z8) {
        this(TelemetryDatabase.f17679p.a(context, z8), i8);
        t.g(context, "context");
    }
}

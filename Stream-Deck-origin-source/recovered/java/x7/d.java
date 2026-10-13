package x7;

import C6.C0920i;
import C6.G;
import E7.h;
import H.FL.dCqzKmEghGTQ;
import J7.A;
import J7.C;
import J7.InterfaceC1035f;
import J7.g;
import J7.p;
import Q6.k;
import Z6.j;
import Z6.v;
import Z6.w;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import io.jentz.winter.js.HRHLwtyqJWz;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p116m7.kKPq.toqHM;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Closeable, Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D7.a f37482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f37483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37484c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37485d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f37486e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f37487f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f37488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final File f37489h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f37490i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC1035f f37491j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f37492k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f37493l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f37494m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f37495n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f37496o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f37497p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f37498q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f37499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f37500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y7.d f37501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final e f37502u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final a f37477v = new a(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f37478w = "journal";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f37479x = "journal.tmp";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f37480y = "journal.bkp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f37481z = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f37470A = "1";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final long f37471B = -1;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final j f37472C = new j("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String f37473D = toqHM.dkGsnS;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final String f37474E = HRHLwtyqJWz.ZxlxttJ;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final String f37475F = "REMOVE";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final String f37476G = "READ";

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f37503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f37504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f37505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f37506d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f37507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f37508b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, b bVar) {
                super(1);
                this.f37507a = dVar;
                this.f37508b = bVar;
            }

            public final void b(IOException it) {
                t.g(it, "it");
                d dVar = this.f37507a;
                b bVar = this.f37508b;
                synchronized (dVar) {
                    bVar.c();
                    G g8 = G.f1419a;
                }
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((IOException) obj);
                return G.f1419a;
            }
        }

        public b(d dVar, c entry) {
            t.g(entry, "entry");
            this.f37506d = dVar;
            this.f37503a = entry;
            this.f37504b = entry.g() ? null : new boolean[dVar.L0()];
        }

        public final void a() {
            d dVar = this.f37506d;
            synchronized (dVar) {
                try {
                    if (this.f37505c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (t.c(this.f37503a.b(), this)) {
                        dVar.Y(this, false);
                    }
                    this.f37505c = true;
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void b() {
            d dVar = this.f37506d;
            synchronized (dVar) {
                try {
                    if (this.f37505c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (t.c(this.f37503a.b(), this)) {
                        dVar.Y(this, true);
                    }
                    this.f37505c = true;
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void c() {
            if (t.c(this.f37503a.b(), this)) {
                if (this.f37506d.f37495n) {
                    this.f37506d.Y(this, false);
                } else {
                    this.f37503a.q(true);
                }
            }
        }

        public final c d() {
            return this.f37503a;
        }

        public final boolean[] e() {
            return this.f37504b;
        }

        public final A f(int i8) {
            d dVar = this.f37506d;
            synchronized (dVar) {
                if (this.f37505c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!t.c(this.f37503a.b(), this)) {
                    return p.b();
                }
                if (!this.f37503a.g()) {
                    boolean[] zArr = this.f37504b;
                    t.d(zArr);
                    zArr[i8] = true;
                }
                try {
                    return new x7.e(dVar.J0().b((File) this.f37503a.c().get(i8)), new a(dVar, this));
                } catch (FileNotFoundException unused) {
                    return p.b();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37509a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f37510b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f37511c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f37512d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f37513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f37514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b f37515g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f37516h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f37517i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f37518j;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends J7.k {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f37519b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ d f37520c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f37521d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C c8, d dVar, c cVar) {
                super(c8);
                this.f37520c = dVar;
                this.f37521d = cVar;
            }

            @Override // J7.k, J7.C, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f37519b) {
                    return;
                }
                this.f37519b = true;
                d dVar = this.f37520c;
                c cVar = this.f37521d;
                synchronized (dVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            dVar.o1(cVar);
                        }
                        G g8 = G.f1419a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public c(d dVar, String key) {
            t.g(key, "key");
            this.f37518j = dVar;
            this.f37509a = key;
            this.f37510b = new long[dVar.L0()];
            this.f37511c = new ArrayList();
            this.f37512d = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append(com.amazon.a.a.o.c.a.b.f16789a);
            int length = sb.length();
            int iL0 = dVar.L0();
            for (int i8 = 0; i8 < iL0; i8++) {
                sb.append(i8);
                this.f37511c.add(new File(this.f37518j.H0(), sb.toString()));
                sb.append(".tmp");
                this.f37512d.add(new File(this.f37518j.H0(), sb.toString()));
                sb.setLength(length);
            }
        }

        public final List a() {
            return this.f37511c;
        }

        public final b b() {
            return this.f37515g;
        }

        public final List c() {
            return this.f37512d;
        }

        public final String d() {
            return this.f37509a;
        }

        public final long[] e() {
            return this.f37510b;
        }

        public final int f() {
            return this.f37516h;
        }

        public final boolean g() {
            return this.f37513e;
        }

        public final long h() {
            return this.f37517i;
        }

        public final boolean i() {
            return this.f37514f;
        }

        public final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        public final C k(int i8) {
            C cA = this.f37518j.J0().a((File) this.f37511c.get(i8));
            if (this.f37518j.f37495n) {
                return cA;
            }
            this.f37516h++;
            return new a(cA, this.f37518j, this);
        }

        public final void l(b bVar) {
            this.f37515g = bVar;
        }

        public final void m(List strings) throws IOException {
            t.g(strings, "strings");
            if (strings.size() != this.f37518j.L0()) {
                j(strings);
                throw new C0920i();
            }
            try {
                int size = strings.size();
                for (int i8 = 0; i8 < size; i8++) {
                    this.f37510b[i8] = Long.parseLong((String) strings.get(i8));
                }
            } catch (NumberFormatException unused) {
                j(strings);
                throw new C0920i();
            }
        }

        public final void n(int i8) {
            this.f37516h = i8;
        }

        public final void o(boolean z8) {
            this.f37513e = z8;
        }

        public final void p(long j8) {
            this.f37517i = j8;
        }

        public final void q(boolean z8) {
            this.f37514f = z8;
        }

        public final C0844d r() {
            d dVar = this.f37518j;
            if (v7.d.f35186h && !Thread.holdsLock(dVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
            }
            if (!this.f37513e) {
                return null;
            }
            if (!this.f37518j.f37495n && (this.f37515g != null || this.f37514f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f37510b.clone();
            try {
                int iL0 = this.f37518j.L0();
                for (int i8 = 0; i8 < iL0; i8++) {
                    arrayList.add(k(i8));
                }
                return new C0844d(this.f37518j, this.f37509a, this.f37517i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    v7.d.m((C) it.next());
                }
                try {
                    this.f37518j.o1(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(InterfaceC1035f writer) {
            t.g(writer, "writer");
            for (long j8 : this.f37510b) {
                writer.writeByte(32).T1(j8);
            }
        }
    }

    /* JADX INFO: renamed from: x7.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class C0844d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f37522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f37523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f37524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f37525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f37526e;

        public C0844d(d dVar, String key, long j8, List<? extends C> sources, long[] lengths) {
            t.g(key, "key");
            t.g(sources, "sources");
            t.g(lengths, "lengths");
            this.f37526e = dVar;
            this.f37522a = key;
            this.f37523b = j8;
            this.f37524c = sources;
            this.f37525d = lengths;
        }

        public final b b() {
            return this.f37526e.j0(this.f37522a, this.f37523b);
        }

        public final C c(int i8) {
            return (C) this.f37524c.get(i8);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f37524c.iterator();
            while (it.hasNext()) {
                v7.d.m((C) it.next());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends y7.a {
        public e(String str) {
            super(str, false, 2, null);
        }

        @Override // y7.a
        public long f() {
            d dVar = d.this;
            synchronized (dVar) {
                if (!dVar.f37496o || dVar.A0()) {
                    return -1L;
                }
                try {
                    dVar.q1();
                } catch (IOException unused) {
                    dVar.f37498q = true;
                }
                try {
                    if (dVar.Q0()) {
                        dVar.i1();
                        dVar.f37493l = 0;
                    }
                } catch (IOException unused2) {
                    dVar.f37499r = true;
                    dVar.f37491j = p.c(p.b());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {
        public f() {
            super(1);
        }

        public final void b(IOException it) {
            t.g(it, "it");
            d dVar = d.this;
            if (!v7.d.f35186h || Thread.holdsLock(dVar)) {
                d.this.f37494m = true;
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + dVar);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((IOException) obj);
            return G.f1419a;
        }
    }

    public static /* synthetic */ b r0(d dVar, String str, long j8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = f37471B;
        }
        return dVar.j0(str, j8);
    }

    public final synchronized void A() {
        if (this.f37497p) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final boolean A0() {
        return this.f37497p;
    }

    public final File H0() {
        return this.f37483b;
    }

    public final D7.a J0() {
        return this.f37482a;
    }

    public final int L0() {
        return this.f37485d;
    }

    public final synchronized void O0() {
        try {
            if (v7.d.f35186h && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f37496o) {
                return;
            }
            if (this.f37482a.d(this.f37489h)) {
                if (this.f37482a.d(this.f37487f)) {
                    this.f37482a.f(this.f37489h);
                } else {
                    this.f37482a.e(this.f37489h, this.f37487f);
                }
            }
            this.f37495n = v7.d.F(this.f37482a, this.f37489h);
            if (this.f37482a.d(this.f37487f)) {
                try {
                    a1();
                    V0();
                    this.f37496o = true;
                    return;
                } catch (IOException e8) {
                    h.f2311a.g().k("DiskLruCache " + this.f37483b + " is corrupt: " + e8.getMessage() + ", removing", 5, e8);
                    try {
                        i0();
                        this.f37497p = false;
                        i1();
                        this.f37496o = true;
                    } catch (Throwable th) {
                        this.f37497p = false;
                        throw th;
                    }
                }
            }
            i1();
            this.f37496o = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean Q0() {
        int i8 = this.f37493l;
        return i8 >= 2000 && i8 >= this.f37492k.size();
    }

    public final InterfaceC1035f T0() {
        return p.c(new x7.e(this.f37482a.g(this.f37487f), new f()));
    }

    public final void V0() {
        this.f37482a.f(this.f37488g);
        Iterator it = this.f37492k.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            t.f(next, "i.next()");
            c cVar = (c) next;
            int i8 = 0;
            if (cVar.b() == null) {
                int i9 = this.f37485d;
                while (i8 < i9) {
                    this.f37490i += cVar.e()[i8];
                    i8++;
                }
            } else {
                cVar.l(null);
                int i10 = this.f37485d;
                while (i8 < i10) {
                    this.f37482a.f((File) cVar.a().get(i8));
                    this.f37482a.f((File) cVar.c().get(i8));
                    i8++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void Y(b editor, boolean z8) {
        t.g(editor, "editor");
        c cVarD = editor.d();
        if (!t.c(cVarD.b(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z8 && !cVarD.g()) {
            int i8 = this.f37485d;
            for (int i9 = 0; i9 < i8; i9++) {
                boolean[] zArrE = editor.e();
                t.d(zArrE);
                if (!zArrE[i9]) {
                    editor.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i9);
                }
                if (!this.f37482a.d((File) cVarD.c().get(i9))) {
                    editor.a();
                    return;
                }
            }
        }
        int i10 = this.f37485d;
        for (int i11 = 0; i11 < i10; i11++) {
            File file = (File) cVarD.c().get(i11);
            if (!z8 || cVarD.i()) {
                this.f37482a.f(file);
            } else if (this.f37482a.d(file)) {
                File file2 = (File) cVarD.a().get(i11);
                this.f37482a.e(file, file2);
                long j8 = cVarD.e()[i11];
                long jH = this.f37482a.h(file2);
                cVarD.e()[i11] = jH;
                this.f37490i = (this.f37490i - j8) + jH;
            }
        }
        cVarD.l(null);
        if (cVarD.i()) {
            o1(cVarD);
            return;
        }
        this.f37493l++;
        InterfaceC1035f interfaceC1035f = this.f37491j;
        t.d(interfaceC1035f);
        if (cVarD.g() || z8) {
            cVarD.o(true);
            interfaceC1035f.I0(f37473D).writeByte(32);
            interfaceC1035f.I0(cVarD.d());
            cVarD.s(interfaceC1035f);
            interfaceC1035f.writeByte(10);
            if (z8) {
                long j9 = this.f37500s;
                this.f37500s = 1 + j9;
                cVarD.p(j9);
            }
        } else {
            this.f37492k.remove(cVarD.d());
            interfaceC1035f.I0(f37475F).writeByte(32);
            interfaceC1035f.I0(cVarD.d());
            interfaceC1035f.writeByte(10);
        }
        interfaceC1035f.flush();
        if (this.f37490i > this.f37486e || Q0()) {
            y7.d.j(this.f37501t, this.f37502u, 0L, 2, null);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f37496o && !this.f37497p) {
                Collection collectionValues = this.f37492k.values();
                t.f(collectionValues, "lruEntries.values");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.c();
                    }
                }
                q1();
                InterfaceC1035f interfaceC1035f = this.f37491j;
                t.d(interfaceC1035f);
                interfaceC1035f.close();
                this.f37491j = null;
                this.f37497p = true;
                return;
            }
            this.f37497p = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f37496o) {
            A();
            q1();
            InterfaceC1035f interfaceC1035f = this.f37491j;
            t.d(interfaceC1035f);
            interfaceC1035f.flush();
        }
    }

    public final void g1(String str) throws IOException {
        String strSubstring;
        int iX = w.X(str, ' ', 0, false, 6, null);
        if (iX == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i8 = iX + 1;
        int iX2 = w.X(str, ' ', i8, false, 4, null);
        if (iX2 == -1) {
            strSubstring = str.substring(i8);
            t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
            String str2 = f37475F;
            if (iX == str2.length() && v.H(str, str2, false, 2, null)) {
                this.f37492k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i8, iX2);
            t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        c cVar = (c) this.f37492k.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f37492k.put(strSubstring, cVar);
        }
        if (iX2 != -1) {
            String str3 = f37473D;
            if (iX == str3.length() && v.H(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iX2 + 1);
                t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                List listZ0 = w.z0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listZ0);
                return;
            }
        }
        if (iX2 == -1) {
            String str4 = f37474E;
            if (iX == str4.length() && v.H(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iX2 == -1) {
            String str5 = f37476G;
            if (iX == str5.length() && v.H(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final void i0() {
        close();
        this.f37482a.c(this.f37483b);
    }

    public final synchronized void i1() {
        try {
            InterfaceC1035f interfaceC1035f = this.f37491j;
            if (interfaceC1035f != null) {
                interfaceC1035f.close();
            }
            InterfaceC1035f interfaceC1035fC = p.c(this.f37482a.b(this.f37488g));
            try {
                interfaceC1035fC.I0(f37481z).writeByte(10);
                interfaceC1035fC.I0(f37470A).writeByte(10);
                interfaceC1035fC.T1(this.f37484c).writeByte(10);
                interfaceC1035fC.T1(this.f37485d).writeByte(10);
                interfaceC1035fC.writeByte(10);
                for (c cVar : this.f37492k.values()) {
                    if (cVar.b() != null) {
                        interfaceC1035fC.I0(f37474E).writeByte(32);
                        interfaceC1035fC.I0(cVar.d());
                        interfaceC1035fC.writeByte(10);
                    } else {
                        interfaceC1035fC.I0(f37473D).writeByte(32);
                        interfaceC1035fC.I0(cVar.d());
                        cVar.s(interfaceC1035fC);
                        interfaceC1035fC.writeByte(10);
                    }
                }
                G g8 = G.f1419a;
                N6.a.a(interfaceC1035fC, null);
                if (this.f37482a.d(this.f37487f)) {
                    this.f37482a.e(this.f37487f, this.f37489h);
                }
                this.f37482a.e(this.f37488g, this.f37487f);
                this.f37482a.f(this.f37489h);
                this.f37491j = T0();
                this.f37494m = false;
                this.f37499r = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    N6.a.a(interfaceC1035fC, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized b j0(String key, long j8) {
        t.g(key, "key");
        O0();
        A();
        r1(key);
        c cVar = (c) this.f37492k.get(key);
        if (j8 != f37471B && (cVar == null || cVar.h() != j8)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f37498q && !this.f37499r) {
            InterfaceC1035f interfaceC1035f = this.f37491j;
            t.d(interfaceC1035f);
            interfaceC1035f.I0(f37474E).writeByte(32).I0(key).writeByte(10);
            interfaceC1035f.flush();
            if (this.f37494m) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f37492k.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        y7.d.j(this.f37501t, this.f37502u, 0L, 2, null);
        return null;
    }

    public final synchronized boolean k1(String key) {
        t.g(key, "key");
        O0();
        A();
        r1(key);
        c cVar = (c) this.f37492k.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zO1 = o1(cVar);
        if (zO1 && this.f37490i <= this.f37486e) {
            this.f37498q = false;
        }
        return zO1;
    }

    public final boolean o1(c entry) {
        InterfaceC1035f interfaceC1035f;
        t.g(entry, "entry");
        if (!this.f37495n) {
            if (entry.f() > 0 && (interfaceC1035f = this.f37491j) != null) {
                interfaceC1035f.I0(f37474E);
                interfaceC1035f.writeByte(32);
                interfaceC1035f.I0(entry.d());
                interfaceC1035f.writeByte(10);
                interfaceC1035f.flush();
            }
            if (entry.f() > 0 || entry.b() != null) {
                entry.q(true);
                return true;
            }
        }
        b bVarB = entry.b();
        if (bVarB != null) {
            bVarB.c();
        }
        int i8 = this.f37485d;
        for (int i9 = 0; i9 < i8; i9++) {
            this.f37482a.f((File) entry.a().get(i9));
            this.f37490i -= entry.e()[i9];
            entry.e()[i9] = 0;
        }
        this.f37493l++;
        InterfaceC1035f interfaceC1035f2 = this.f37491j;
        if (interfaceC1035f2 != null) {
            interfaceC1035f2.I0(f37475F);
            interfaceC1035f2.writeByte(32);
            interfaceC1035f2.I0(entry.d());
            interfaceC1035f2.writeByte(10);
        }
        this.f37492k.remove(entry.d());
        if (Q0()) {
            y7.d.j(this.f37501t, this.f37502u, 0L, 2, null);
        }
        return true;
    }

    public final void q1() {
        while (this.f37490i > this.f37486e) {
            if (!p1()) {
                return;
            }
        }
        this.f37498q = false;
    }

    public final void r1(String str) {
        if (f37472C.d(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public final synchronized C0844d w0(String key) {
        t.g(key, "key");
        O0();
        A();
        r1(key);
        c cVar = (c) this.f37492k.get(key);
        if (cVar == null) {
            return null;
        }
        C0844d c0844dR = cVar.r();
        if (c0844dR == null) {
            return null;
        }
        this.f37493l++;
        InterfaceC1035f interfaceC1035f = this.f37491j;
        t.d(interfaceC1035f);
        interfaceC1035f.I0(f37476G).writeByte(32).I0(key).writeByte(10);
        if (Q0()) {
            y7.d.j(this.f37501t, this.f37502u, 0L, 2, null);
        }
        return c0844dR;
    }

    public d(D7.a fileSystem, File directory, int i8, int i9, long j8, y7.e taskRunner) {
        t.g(fileSystem, "fileSystem");
        t.g(directory, "directory");
        t.g(taskRunner, "taskRunner");
        this.f37482a = fileSystem;
        this.f37483b = directory;
        this.f37484c = i8;
        this.f37485d = i9;
        this.f37486e = j8;
        this.f37492k = new LinkedHashMap(0, 0.75f, true);
        this.f37501t = taskRunner.i();
        this.f37502u = new e(v7.d.f35187i + " Cache");
        if (j8 <= 0) {
            throw new IllegalArgumentException(BpgIURjN.YLraKTDVtNXEN);
        }
        if (i9 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f37487f = new File(directory, f37478w);
        this.f37488g = new File(directory, f37479x);
        this.f37489h = new File(directory, f37480y);
    }

    public final void a1() throws IllegalAccessException, IOException, InvocationTargetException {
        String str = uYOhHhTXuF.YpdGeSaa;
        g gVarD = p.d(this.f37482a.a(this.f37487f));
        try {
            String strN1 = gVarD.n1();
            String strN2 = gVarD.n1();
            String strN3 = gVarD.n1();
            String strN4 = gVarD.n1();
            String strN5 = gVarD.n1();
            if (!t.c(f37481z, strN1) || !t.c(f37470A, strN2) || !t.c(String.valueOf(this.f37484c), strN3) || !t.c(String.valueOf(this.f37485d), strN4) || strN5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strN1 + str + strN2 + str + strN4 + str + strN5 + ']');
            }
            int i8 = 0;
            while (true) {
                try {
                    g1(gVarD.n1());
                    i8++;
                } catch (EOFException unused) {
                    this.f37493l = i8 - this.f37492k.size();
                    if (gVarD.f0()) {
                        this.f37491j = T0();
                    } else {
                        i1();
                    }
                    G g8 = G.f1419a;
                    N6.a.a(gVarD, null);
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                N6.a.a(gVarD, th);
                throw th2;
            }
        }
    }

    public final boolean p1() {
        for (c cVar : this.f37492k.values()) {
            if (!cVar.i()) {
                t.f(cVar, dCqzKmEghGTQ.ZkDjigiEWz);
                o1(cVar);
                return true;
            }
        }
        return false;
    }
}

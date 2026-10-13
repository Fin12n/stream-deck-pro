package p052f6;

import D6.r;
import D6.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p070h6.h;
import p070h6.i;
import p070h6.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f21989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f21990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f21991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final short f21992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f21993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2314e f21994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f21995g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21996a;

        static {
            int[] iArr = new int[j.values().length];
            try {
                iArr[j.SIGNATURE_ALGORITHMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f21996a = iArr;
        }
    }

    public F(H version, byte[] serverSeed, byte[] sessionId, short s8, short s9, List<i> extensions) {
        Object next;
        t.g(version, "version");
        t.g(serverSeed, "serverSeed");
        t.g(sessionId, "sessionId");
        t.g(extensions, "extensions");
        this.f21989a = version;
        this.f21990b = serverSeed;
        this.f21991c = sessionId;
        this.f21992d = s9;
        this.f21993e = extensions;
        Iterator it = C2310a.f22030a.a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((C2314e) next).c() != s8);
        C2314e c2314e = (C2314e) next;
        if (c2314e == null) {
            throw new IllegalStateException(("Server cipher suite is not supported: " + ((int) s8)).toString());
        }
        this.f21994f = c2314e;
        ArrayList arrayList = new ArrayList();
        for (i iVar : this.f21993e) {
            if (a.f21996a[iVar.b().ordinal()] == 1) {
                w.E(arrayList, h.e(iVar.a()));
            }
        }
        this.f21995g = arrayList;
    }

    public final C2314e a() {
        return this.f21994f;
    }

    public final List b() {
        return this.f21995g;
    }

    public final byte[] c() {
        return this.f21990b;
    }

    public /* synthetic */ F(H h8, byte[] bArr, byte[] bArr2, short s8, short s9, List list, int i8, AbstractC2633k abstractC2633k) {
        this(h8, bArr, bArr2, s8, s9, (i8 & 32) != 0 ? r.n() : list);
    }
}

package p166t;

import A.AbstractC0890p0;
import A.C0886n0;
import A.C0900v;
import A.C0904x;
import A.G;
import B.a;
import H.AbstractC0972c0;
import H.C0970b0;
import H.H;
import H.J;
import H.R0;
import L.m;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p174u.e;
import p174u.t;

/* JADX INFO: renamed from: t.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2990y implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f33923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f33924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC0972c0 f33925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0970b0 f33926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f33927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2963o1 f33928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f33929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f33930h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f33931i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G f33932j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final P0 f33933k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C0900v f33934l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f33935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f33936n;

    public C2990y(Context context, AbstractC0972c0 abstractC0972c0, C0900v c0900v, long j8) {
        this(context, abstractC0972c0, c0900v, j8, null, m.f4781b);
    }

    @Override // H.H
    public R0 b() {
        return this.f33933k;
    }

    @Override // H.H
    public Set c() {
        LinkedHashSet linkedHashSet;
        synchronized (this.f33935m) {
            linkedHashSet = new LinkedHashSet(this.f33936n);
        }
        return linkedHashSet;
    }

    @Override // H.H
    public J d(String str) {
        synchronized (this.f33935m) {
            if (!this.f33936n.contains(str)) {
                throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
            }
        }
        return new T(this.f33923a, this.f33927e, str, h(str), this.f33924b, this.f33926d, this.f33925c.b(), this.f33925c.c(), this.f33928f, this.f33929g, this.f33932j);
    }

    @Override // H.L
    public void e(List list) throws C0886n0 {
        try {
            List listG = g(W0.b(this, this.f33934l, new ArrayList(list)));
            synchronized (this.f33935m) {
                try {
                    if (this.f33936n.equals(listG)) {
                        return;
                    }
                    AbstractC0890p0.a("Camera2CameraFactory", "Updated available camera list: " + this.f33936n + " -> " + listG);
                    this.f33936n = listG;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (C0886n0 e8) {
            Log.e("Camera2CameraFactory", "Unable to get backward compatible camera ids", e8);
            throw e8;
        }
    }

    @Override // H.H
    public a f() {
        return this.f33924b;
    }

    public final List g(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (V0.a(this.f33927e, str)) {
                arrayList.add(str);
            } else {
                AbstractC0890p0.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public Y h(String str) throws C0904x {
        try {
            Y y8 = (Y) this.f33930h.get(str);
            if (y8 != null) {
                return y8;
            }
            Y y9 = new Y(str, this.f33927e, this.f33931i);
            this.f33930h.put(str, y9);
            return y9;
        } catch (e e8) {
            throw Y0.a(e8);
        }
    }

    @Override // H.H
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public t a() {
        return this.f33927e;
    }

    @Override // H.H
    public void shutdown() {
        this.f33924b.shutdown();
        this.f33933k.g();
    }

    public C2990y(Context context, AbstractC0972c0 abstractC0972c0, C0900v c0900v, long j8, G g8, m mVar) throws C0886n0 {
        this.f33930h = new HashMap();
        this.f33935m = new Object();
        this.f33936n = new ArrayList();
        this.f33923a = context;
        this.f33925c = abstractC0972c0;
        t tVarB = t.b(context, abstractC0972c0.c());
        this.f33927e = tVarB;
        this.f33928f = C2963o1.c(context);
        p206y.a aVar = new p206y.a(tVarB);
        this.f33924b = aVar;
        C0970b0 c0970b0 = new C0970b0(aVar, 1);
        this.f33926d = c0970b0;
        aVar.f(c0970b0);
        this.f33929g = j8;
        this.f33931i = mVar;
        this.f33932j = g8;
        this.f33934l = c0900v;
        try {
            List listAsList = Arrays.asList(tVarB.d());
            this.f33933k = new P0(listAsList, tVarB, abstractC0972c0.b());
            e(listAsList);
        } catch (e e8) {
            throw new C0886n0(Y0.a(e8));
        }
    }
}

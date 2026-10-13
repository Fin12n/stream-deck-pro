package p143q0;

import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: q0.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2823x {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f31949g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2823x f31950h = new C2823x(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f31951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f31952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f31953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f31954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f31955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f31956f;

    /* JADX INFO: renamed from: q0.x$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C2823x a() {
            return C2823x.f31950h;
        }

        public a() {
        }
    }

    public C2823x() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final k b() {
        return this.f31951a;
    }

    public final k c() {
        return this.f31952b;
    }

    public final k d() {
        return this.f31953c;
    }

    public final k e() {
        return this.f31954d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2823x)) {
            return false;
        }
        C2823x c2823x = (C2823x) obj;
        return t.c(this.f31951a, c2823x.f31951a) && t.c(this.f31952b, c2823x.f31952b) && t.c(this.f31953c, c2823x.f31953c) && t.c(this.f31954d, c2823x.f31954d) && t.c(this.f31955e, c2823x.f31955e) && t.c(this.f31956f, c2823x.f31956f);
    }

    public final k f() {
        return this.f31955e;
    }

    public final k g() {
        return this.f31956f;
    }

    public int hashCode() {
        k kVar = this.f31951a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.f31952b;
        int iHashCode2 = (iHashCode + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
        k kVar3 = this.f31953c;
        int iHashCode3 = (iHashCode2 + (kVar3 != null ? kVar3.hashCode() : 0)) * 31;
        k kVar4 = this.f31954d;
        int iHashCode4 = (iHashCode3 + (kVar4 != null ? kVar4.hashCode() : 0)) * 31;
        k kVar5 = this.f31955e;
        int iHashCode5 = (iHashCode4 + (kVar5 != null ? kVar5.hashCode() : 0)) * 31;
        k kVar6 = this.f31956f;
        return iHashCode5 + (kVar6 != null ? kVar6.hashCode() : 0);
    }

    public C2823x(k kVar, k kVar2, k kVar3, k kVar4, k kVar5, k kVar6) {
        this.f31951a = kVar;
        this.f31952b = kVar2;
        this.f31953c = kVar3;
        this.f31954d = kVar4;
        this.f31955e = kVar5;
        this.f31956f = kVar6;
    }

    public /* synthetic */ C2823x(k kVar, k kVar2, k kVar3, k kVar4, k kVar5, k kVar6, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : kVar, (i8 & 2) != 0 ? null : kVar2, (i8 & 4) != 0 ? null : kVar3, (i8 & 8) != 0 ? null : kVar4, (i8 & 16) != 0 ? null : kVar5, (i8 & 32) != 0 ? null : kVar6);
    }
}

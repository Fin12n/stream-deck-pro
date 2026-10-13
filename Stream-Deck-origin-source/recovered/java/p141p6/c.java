package p141p6;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f31322j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f31323k = p141p6.a.b(0L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f31325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f31326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f31327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f31328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f31329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f31330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f31331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f31332i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c other) {
        t.g(other, "other");
        return t.i(this.f31332i, other.f31332i);
    }

    public final long b() {
        return this.f31332i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f31324a == cVar.f31324a && this.f31325b == cVar.f31325b && this.f31326c == cVar.f31326c && this.f31327d == cVar.f31327d && this.f31328e == cVar.f31328e && this.f31329f == cVar.f31329f && this.f31330g == cVar.f31330g && this.f31331h == cVar.f31331h && this.f31332i == cVar.f31332i;
    }

    public int hashCode() {
        return (((((((((((((((Integer.hashCode(this.f31324a) * 31) + Integer.hashCode(this.f31325b)) * 31) + Integer.hashCode(this.f31326c)) * 31) + this.f31327d.hashCode()) * 31) + Integer.hashCode(this.f31328e)) * 31) + Integer.hashCode(this.f31329f)) * 31) + this.f31330g.hashCode()) * 31) + Integer.hashCode(this.f31331h)) * 31) + Long.hashCode(this.f31332i);
    }

    public String toString() {
        return "GMTDate(seconds=" + this.f31324a + ", minutes=" + this.f31325b + ", hours=" + this.f31326c + ", dayOfWeek=" + this.f31327d + ", dayOfMonth=" + this.f31328e + ", dayOfYear=" + this.f31329f + ", month=" + this.f31330g + ", year=" + this.f31331h + ", timestamp=" + this.f31332i + ')';
    }

    public c(int i8, int i9, int i10, h hVar, int i11, int i12, g month, int i13, long j8) {
        t.g(hVar, WaYxBuDSBD.pjL);
        t.g(month, "month");
        this.f31324a = i8;
        this.f31325b = i9;
        this.f31326c = i10;
        this.f31327d = hVar;
        this.f31328e = i11;
        this.f31329f = i12;
        this.f31330g = month;
        this.f31331h = i13;
        this.f31332i = j8;
    }
}

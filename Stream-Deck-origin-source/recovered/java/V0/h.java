package V0;

import Z.JTT.ryTuoS;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import io.sentry.exception.uXy.SZCvugJaXc;
import kotlin.jvm.internal.AbstractC2633k;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10346b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10347c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10348d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10349e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f10350f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f10351g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f10352h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f10353i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f10347c = f8;
            this.f10348d = f9;
            this.f10349e = f10;
            this.f10350f = z8;
            this.f10351g = z9;
            this.f10352h = f11;
            this.f10353i = f12;
        }

        public final float c() {
            return this.f10352h;
        }

        public final float d() {
            return this.f10353i;
        }

        public final float e() {
            return this.f10347c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f10347c, aVar.f10347c) == 0 && Float.compare(this.f10348d, aVar.f10348d) == 0 && Float.compare(this.f10349e, aVar.f10349e) == 0 && this.f10350f == aVar.f10350f && this.f10351g == aVar.f10351g && Float.compare(this.f10352h, aVar.f10352h) == 0 && Float.compare(this.f10353i, aVar.f10353i) == 0;
        }

        public final float f() {
            return this.f10349e;
        }

        public final float g() {
            return this.f10348d;
        }

        public final boolean h() {
            return this.f10350f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f10347c) * 31) + Float.hashCode(this.f10348d)) * 31) + Float.hashCode(this.f10349e)) * 31) + Boolean.hashCode(this.f10350f)) * 31) + Boolean.hashCode(this.f10351g)) * 31) + Float.hashCode(this.f10352h)) * 31) + Float.hashCode(this.f10353i);
        }

        public final boolean i() {
            return this.f10351g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f10347c + ", verticalEllipseRadius=" + this.f10348d + ", theta=" + this.f10349e + ", isMoreThanHalf=" + this.f10350f + ", isPositiveArc=" + this.f10351g + ", arcStartX=" + this.f10352h + ", arcStartY=" + this.f10353i + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f10354c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        public b() {
            boolean z8 = false;
            super(z8, z8, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f10359g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f10360h;

        public c(float f8, float f9, float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f10355c = f8;
            this.f10356d = f9;
            this.f10357e = f10;
            this.f10358f = f11;
            this.f10359g = f12;
            this.f10360h = f13;
        }

        public final float c() {
            return this.f10355c;
        }

        public final float d() {
            return this.f10357e;
        }

        public final float e() {
            return this.f10359g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f10355c, cVar.f10355c) == 0 && Float.compare(this.f10356d, cVar.f10356d) == 0 && Float.compare(this.f10357e, cVar.f10357e) == 0 && Float.compare(this.f10358f, cVar.f10358f) == 0 && Float.compare(this.f10359g, cVar.f10359g) == 0 && Float.compare(this.f10360h, cVar.f10360h) == 0;
        }

        public final float f() {
            return this.f10356d;
        }

        public final float g() {
            return this.f10358f;
        }

        public final float h() {
            return this.f10360h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f10355c) * 31) + Float.hashCode(this.f10356d)) * 31) + Float.hashCode(this.f10357e)) * 31) + Float.hashCode(this.f10358f)) * 31) + Float.hashCode(this.f10359g)) * 31) + Float.hashCode(this.f10360h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f10355c + ", y1=" + this.f10356d + ", x2=" + this.f10357e + ", y2=" + this.f10358f + ", x3=" + this.f10359g + ", y3=" + this.f10360h + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10361c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f8) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10361c = f8;
        }

        public final float c() {
            return this.f10361c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f10361c, ((d) obj).f10361c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f10361c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f10361c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10363d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f8, float f9) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10362c = f8;
            this.f10363d = f9;
        }

        public final float c() {
            return this.f10362c;
        }

        public final float d() {
            return this.f10363d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f10362c, eVar.f10362c) == 0 && Float.compare(this.f10363d, eVar.f10363d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10362c) * 31) + Float.hashCode(this.f10363d);
        }

        public String toString() {
            return "LineTo(x=" + this.f10362c + ", y=" + this.f10363d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10365d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f8, float f9) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10364c = f8;
            this.f10365d = f9;
        }

        public final float c() {
            return this.f10364c;
        }

        public final float d() {
            return this.f10365d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f10364c, fVar.f10364c) == 0 && Float.compare(this.f10365d, fVar.f10365d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10364c) * 31) + Float.hashCode(this.f10365d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f10364c + ", y=" + this.f10365d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10366c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10367d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10369f;

        public g(float f8, float f9, float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f10366c = f8;
            this.f10367d = f9;
            this.f10368e = f10;
            this.f10369f = f11;
        }

        public final float c() {
            return this.f10366c;
        }

        public final float d() {
            return this.f10368e;
        }

        public final float e() {
            return this.f10367d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f10366c, gVar.f10366c) == 0 && Float.compare(this.f10367d, gVar.f10367d) == 0 && Float.compare(this.f10368e, gVar.f10368e) == 0 && Float.compare(this.f10369f, gVar.f10369f) == 0;
        }

        public final float f() {
            return this.f10369f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f10366c) * 31) + Float.hashCode(this.f10367d)) * 31) + Float.hashCode(this.f10368e)) * 31) + Float.hashCode(this.f10369f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f10366c + ryTuoS.OOIaDRosjTIymq + this.f10367d + ", x2=" + this.f10368e + ", y2=" + this.f10369f + ')';
        }
    }

    /* JADX INFO: renamed from: V0.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0287h extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10370c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10372e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10373f;

        public C0287h(float f8, float f9, float f10, float f11) {
            super(true, false, 2, null);
            this.f10370c = f8;
            this.f10371d = f9;
            this.f10372e = f10;
            this.f10373f = f11;
        }

        public final float c() {
            return this.f10370c;
        }

        public final float d() {
            return this.f10372e;
        }

        public final float e() {
            return this.f10371d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0287h)) {
                return false;
            }
            C0287h c0287h = (C0287h) obj;
            return Float.compare(this.f10370c, c0287h.f10370c) == 0 && Float.compare(this.f10371d, c0287h.f10371d) == 0 && Float.compare(this.f10372e, c0287h.f10372e) == 0 && Float.compare(this.f10373f, c0287h.f10373f) == 0;
        }

        public final float f() {
            return this.f10373f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f10370c) * 31) + Float.hashCode(this.f10371d)) * 31) + Float.hashCode(this.f10372e)) * 31) + Float.hashCode(this.f10373f);
        }

        public String toString() {
            return OjEsfyJYzbPn.CkSpksyJ + this.f10370c + ", y1=" + this.f10371d + ", x2=" + this.f10372e + ", y2=" + this.f10373f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10375d;

        public i(float f8, float f9) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f10374c = f8;
            this.f10375d = f9;
        }

        public final float c() {
            return this.f10374c;
        }

        public final float d() {
            return this.f10375d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f10374c, iVar.f10374c) == 0 && Float.compare(this.f10375d, iVar.f10375d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10374c) * 31) + Float.hashCode(this.f10375d);
        }

        public String toString() {
            return SZCvugJaXc.EpLRMjLTngah + this.f10374c + ", y=" + this.f10375d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f10379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f10380g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f10381h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final float f10382i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f8, float f9, float f10, boolean z8, boolean z9, float f11, float f12) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f10376c = f8;
            this.f10377d = f9;
            this.f10378e = f10;
            this.f10379f = z8;
            this.f10380g = z9;
            this.f10381h = f11;
            this.f10382i = f12;
        }

        public final float c() {
            return this.f10381h;
        }

        public final float d() {
            return this.f10382i;
        }

        public final float e() {
            return this.f10376c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f10376c, jVar.f10376c) == 0 && Float.compare(this.f10377d, jVar.f10377d) == 0 && Float.compare(this.f10378e, jVar.f10378e) == 0 && this.f10379f == jVar.f10379f && this.f10380g == jVar.f10380g && Float.compare(this.f10381h, jVar.f10381h) == 0 && Float.compare(this.f10382i, jVar.f10382i) == 0;
        }

        public final float f() {
            return this.f10378e;
        }

        public final float g() {
            return this.f10377d;
        }

        public final boolean h() {
            return this.f10379f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f10376c) * 31) + Float.hashCode(this.f10377d)) * 31) + Float.hashCode(this.f10378e)) * 31) + Boolean.hashCode(this.f10379f)) * 31) + Boolean.hashCode(this.f10380g)) * 31) + Float.hashCode(this.f10381h)) * 31) + Float.hashCode(this.f10382i);
        }

        public final boolean i() {
            return this.f10380g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f10376c + ", verticalEllipseRadius=" + this.f10377d + ", theta=" + this.f10378e + ", isMoreThanHalf=" + this.f10379f + ", isPositiveArc=" + this.f10380g + ", arcStartDx=" + this.f10381h + ", arcStartDy=" + this.f10382i + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final float f10387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final float f10388h;

        public k(float f8, float f9, float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f10383c = f8;
            this.f10384d = f9;
            this.f10385e = f10;
            this.f10386f = f11;
            this.f10387g = f12;
            this.f10388h = f13;
        }

        public final float c() {
            return this.f10383c;
        }

        public final float d() {
            return this.f10385e;
        }

        public final float e() {
            return this.f10387g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f10383c, kVar.f10383c) == 0 && Float.compare(this.f10384d, kVar.f10384d) == 0 && Float.compare(this.f10385e, kVar.f10385e) == 0 && Float.compare(this.f10386f, kVar.f10386f) == 0 && Float.compare(this.f10387g, kVar.f10387g) == 0 && Float.compare(this.f10388h, kVar.f10388h) == 0;
        }

        public final float f() {
            return this.f10384d;
        }

        public final float g() {
            return this.f10386f;
        }

        public final float h() {
            return this.f10388h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f10383c) * 31) + Float.hashCode(this.f10384d)) * 31) + Float.hashCode(this.f10385e)) * 31) + Float.hashCode(this.f10386f)) * 31) + Float.hashCode(this.f10387g)) * 31) + Float.hashCode(this.f10388h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f10383c + ", dy1=" + this.f10384d + ", dx2=" + this.f10385e + ", dy2=" + this.f10386f + ", dx3=" + this.f10387g + ", dy3=" + this.f10388h + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10389c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f8) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10389c = f8;
        }

        public final float c() {
            return this.f10389c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f10389c, ((l) obj).f10389c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f10389c);
        }

        public String toString() {
            return cFAYKUlMj.BjisWREHtnngrlK + this.f10389c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10390c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10391d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f8, float f9) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10390c = f8;
            this.f10391d = f9;
        }

        public final float c() {
            return this.f10390c;
        }

        public final float d() {
            return this.f10391d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f10390c, mVar.f10390c) == 0 && Float.compare(this.f10391d, mVar.f10391d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10390c) * 31) + Float.hashCode(this.f10391d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f10390c + ", dy=" + this.f10391d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10393d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f8, float f9) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10392c = f8;
            this.f10393d = f9;
        }

        public final float c() {
            return this.f10392c;
        }

        public final float d() {
            return this.f10393d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f10392c, nVar.f10392c) == 0 && Float.compare(this.f10393d, nVar.f10393d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10392c) * 31) + Float.hashCode(this.f10393d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f10392c + ", dy=" + this.f10393d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10395d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10396e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10397f;

        public o(float f8, float f9, float f10, float f11) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f10394c = f8;
            this.f10395d = f9;
            this.f10396e = f10;
            this.f10397f = f11;
        }

        public final float c() {
            return this.f10394c;
        }

        public final float d() {
            return this.f10396e;
        }

        public final float e() {
            return this.f10395d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f10394c, oVar.f10394c) == 0 && Float.compare(this.f10395d, oVar.f10395d) == 0 && Float.compare(this.f10396e, oVar.f10396e) == 0 && Float.compare(this.f10397f, oVar.f10397f) == 0;
        }

        public final float f() {
            return this.f10397f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f10394c) * 31) + Float.hashCode(this.f10395d)) * 31) + Float.hashCode(this.f10396e)) * 31) + Float.hashCode(this.f10397f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f10394c + ", dy1=" + this.f10395d + ", dx2=" + this.f10396e + ", dy2=" + this.f10397f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10399d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f10400e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f10401f;

        public p(float f8, float f9, float f10, float f11) {
            super(true, false, 2, null);
            this.f10398c = f8;
            this.f10399d = f9;
            this.f10400e = f10;
            this.f10401f = f11;
        }

        public final float c() {
            return this.f10398c;
        }

        public final float d() {
            return this.f10400e;
        }

        public final float e() {
            return this.f10399d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f10398c, pVar.f10398c) == 0 && Float.compare(this.f10399d, pVar.f10399d) == 0 && Float.compare(this.f10400e, pVar.f10400e) == 0 && Float.compare(this.f10401f, pVar.f10401f) == 0;
        }

        public final float f() {
            return this.f10401f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f10398c) * 31) + Float.hashCode(this.f10399d)) * 31) + Float.hashCode(this.f10400e)) * 31) + Float.hashCode(this.f10401f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f10398c + ", dy1=" + this.f10399d + ", dx2=" + this.f10400e + cFAYKUlMj.OIIIrB + this.f10401f + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f10403d;

        public q(float f8, float f9) {
            super(false, true, 1 == true ? 1 : 0, null);
            this.f10402c = f8;
            this.f10403d = f9;
        }

        public final float c() {
            return this.f10402c;
        }

        public final float d() {
            return this.f10403d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f10402c, qVar.f10402c) == 0 && Float.compare(this.f10403d, qVar.f10403d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f10402c) * 31) + Float.hashCode(this.f10403d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f10402c + ", dy=" + this.f10403d + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10404c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f8) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10404c = f8;
        }

        public final float c() {
            return this.f10404c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f10404c, ((r) obj).f10404c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f10404c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f10404c + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f10405c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f8) {
            boolean z8 = false;
            super(z8, z8, 3, null);
            this.f10405c = f8;
        }

        public final float c() {
            return this.f10405c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f10405c, ((s) obj).f10405c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f10405c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f10405c + ')';
        }
    }

    public /* synthetic */ h(boolean z8, boolean z9, AbstractC2633k abstractC2633k) {
        this(z8, z9);
    }

    public final boolean a() {
        return this.f10345a;
    }

    public final boolean b() {
        return this.f10346b;
    }

    public h(boolean z8, boolean z9) {
        this.f10345a = z8;
        this.f10346b = z9;
    }

    public /* synthetic */ h(boolean z8, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9, null);
    }
}

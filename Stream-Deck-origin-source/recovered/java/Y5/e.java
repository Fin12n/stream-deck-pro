package Y5;

import M6.eLZq.eGwOBWCdOTaKus;
import Y6.l;
import Y6.n;
import java.io.IOException;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z5.b f12482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f12484c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.k {
        public a() {
            super(1);
        }

        public final Integer b(int i8) {
            int i9 = i8 + 1;
            if (i9 >= e.this.e()) {
                return null;
            }
            return Integer.valueOf(i9);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12486a = new b();

        public b() {
            super(1);
        }

        public final Integer b(int i8) {
            return Integer.valueOf(i8 * 8);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f12488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i8) {
            super(1);
            this.f12488b = i8;
        }

        public final Boolean b(int i8) {
            return Boolean.valueOf(e.this.f12484c[i8] == this.f12488b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {
        public d() {
            super(1);
        }

        public final CharSequence b(int i8) {
            return e.this.f12482a.subSequence(e.this.f12484c[i8 + 4], e.this.f12484c[i8 + 5]);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).intValue());
        }
    }

    public final CharSequence c(String name) {
        t.g(name, "name");
        int iD = Z5.e.d(name, 0, 0, 3, null);
        int i8 = this.f12483b;
        for (int i9 = 0; i9 < i8; i9++) {
            int i10 = i9 * 8;
            int[] iArr = this.f12484c;
            if (iArr[i10] == iD) {
                return this.f12482a.subSequence(iArr[i10 + 4], iArr[i10 + 5]);
            }
        }
        return null;
    }

    public final Y6.g d(String name) {
        t.g(name, "name");
        return n.s(n.k(n.s(l.f(0, new a()), b.f12486a), new c(Z5.e.d(name, 0, 0, 3, null))), new d());
    }

    public final int e() {
        return this.f12483b;
    }

    public final CharSequence f(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 >= this.f12483b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i9 = i8 * 8;
        int[] iArr = this.f12484c;
        return this.f12482a.subSequence(iArr[i9 + 2], iArr[i9 + 3]);
    }

    public final void g(int i8, int i9, int i10, int i11, int i12, int i13) {
        int i14 = this.f12483b;
        int i15 = i14 * 8;
        int[] iArr = this.f12484c;
        if (i15 >= iArr.length) {
            throw new C6.n("An operation is not implemented: Implement headers overflow");
        }
        iArr[i15] = i8;
        iArr[i15 + 1] = i9;
        iArr[i15 + 2] = i10;
        iArr[i15 + 3] = i11;
        iArr[i15 + 4] = i12;
        iArr[i15 + 5] = i13;
        iArr[i15 + 6] = -1;
        iArr[i15 + 7] = -1;
        this.f12483b = i14 + 1;
    }

    public final void h() {
        this.f12483b = 0;
        int[] iArr = this.f12484c;
        this.f12484c = f.f12490a;
        if (iArr != f.f12490a) {
            f.f12491b.H1(iArr);
        }
    }

    public final CharSequence i(int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i8 >= this.f12483b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i9 = i8 * 8;
        int[] iArr = this.f12484c;
        return this.f12482a.subSequence(iArr[i9 + 4], iArr[i9 + 5]);
    }

    public String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        f.c(this, "", sb);
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public e(Z5.b bVar) {
        t.g(bVar, eGwOBWCdOTaKus.ssWXRtQV);
        this.f12482a = bVar;
        this.f12484c = (int[]) f.f12491b.b0();
    }
}

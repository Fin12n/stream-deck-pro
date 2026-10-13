package Z6;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements Y6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f12947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q6.o f12950d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements Iterator, R6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12951a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f12953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public W6.i f12954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f12955e;

        public a() {
            int iK = W6.n.k(d.this.f12948b, 0, d.this.f12947a.length());
            this.f12952b = iK;
            this.f12953c = iK;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:12:0x0030 A[ADDED_TO_REGION, REMOVE] */
        /* JADX WARN: Code duplicated, block: B:18:0x0097  */
        private final void b() {
            C6.o oVar;
            if (this.f12953c < 0) {
                this.f12951a = 0;
                this.f12954d = null;
                return;
            }
            if (d.this.f12949c > 0) {
                int i8 = this.f12955e + 1;
                this.f12955e = i8;
                if (i8 >= d.this.f12949c) {
                    this.f12954d = new W6.i(this.f12952b, w.S(d.this.f12947a));
                    this.f12953c = -1;
                } else if (this.f12953c > d.this.f12947a.length() && (oVar = (C6.o) d.this.f12950d.invoke(d.this.f12947a, Integer.valueOf(this.f12953c))) != null) {
                    int iIntValue = ((Number) oVar.a()).intValue();
                    int iIntValue2 = ((Number) oVar.b()).intValue();
                    this.f12954d = W6.n.v(this.f12952b, iIntValue);
                    int i9 = iIntValue + iIntValue2;
                    this.f12952b = i9;
                    this.f12953c = i9 + (iIntValue2 == 0 ? 1 : 0);
                } else {
                    this.f12954d = new W6.i(this.f12952b, w.S(d.this.f12947a));
                    this.f12953c = -1;
                }
            } else if (this.f12953c > d.this.f12947a.length()) {
                this.f12954d = new W6.i(this.f12952b, w.S(d.this.f12947a));
                this.f12953c = -1;
            } else {
                int iIntValue3 = ((Number) oVar.a()).intValue();
                int iIntValue4 = ((Number) oVar.b()).intValue();
                this.f12954d = W6.n.v(this.f12952b, iIntValue3);
                int i10 = iIntValue3 + iIntValue4;
                this.f12952b = i10;
                this.f12953c = i10 + (iIntValue4 == 0 ? 1 : 0);
            }
            this.f12951a = 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public W6.i next() {
            if (this.f12951a == -1) {
                b();
            }
            if (this.f12951a == 0) {
                throw new NoSuchElementException();
            }
            W6.i iVar = this.f12954d;
            kotlin.jvm.internal.t.e(iVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f12954d = null;
            this.f12951a = -1;
            return iVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f12951a == -1) {
                b();
            }
            return this.f12951a == 1;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public d(CharSequence input, int i8, int i9, Q6.o getNextMatch) {
        kotlin.jvm.internal.t.g(input, "input");
        kotlin.jvm.internal.t.g(getNextMatch, "getNextMatch");
        this.f12947a = input;
        this.f12948b = i8;
        this.f12949c = i9;
        this.f12950d = getNextMatch;
    }

    @Override // Y6.g
    public Iterator iterator() {
        return new a();
    }
}

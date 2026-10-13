package u7;

import J7.InterfaceC1035f;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34507a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: u7.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0781a extends A {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f34508b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ int f34509c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ byte[] f34510d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f34511e;

            public C0781a(w wVar, int i8, byte[] bArr, int i9) {
                this.f34508b = wVar;
                this.f34509c = i8;
                this.f34510d = bArr;
                this.f34511e = i9;
            }

            @Override // u7.A
            public long a() {
                return this.f34509c;
            }

            @Override // u7.A
            public w b() {
                return this.f34508b;
            }

            @Override // u7.A
            public void e(InterfaceC1035f sink) {
                kotlin.jvm.internal.t.g(sink, "sink");
                sink.write(this.f34510d, this.f34511e, this.f34509c);
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public static /* synthetic */ A b(a aVar, byte[] bArr, w wVar, int i8, int i9, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                wVar = null;
            }
            if ((i10 & 2) != 0) {
                i8 = 0;
            }
            if ((i10 & 4) != 0) {
                i9 = bArr.length;
            }
            return aVar.a(bArr, wVar, i8, i9);
        }

        public final A a(byte[] bArr, w wVar, int i8, int i9) {
            kotlin.jvm.internal.t.g(bArr, "<this>");
            v7.d.l(bArr.length, i8, i9);
            return new C0781a(wVar, i9, bArr, i8);
        }

        public a() {
        }
    }

    public long a() {
        return -1L;
    }

    public abstract w b();

    public boolean c() {
        return false;
    }

    public boolean d() {
        return false;
    }

    public abstract void e(InterfaceC1035f interfaceC1035f);
}

package L3;

import C6.InterfaceC0916e;
import Z6.w;
import android.os.Build;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p116m7.p;
import q7.AbstractC2872x0;
import q7.C2874y0;
import q7.I0;
import q7.K;
import q7.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@p116m7.i
public final class i implements Comparable<i> {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5037c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5038a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f5039b;

        static {
            a aVar = new a();
            f5038a = aVar;
            C2874y0 c2874y0 = new C2874y0("com.elgato.streamdeck.updateInfo.Version", aVar, 3);
            c2874y0.l("major", false);
            c2874y0.l("minor", false);
            c2874y0.l("patch", false);
            f5039b = c2874y0;
        }

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i deserialize(p7.e decoder) {
            int iN;
            int iN2;
            int i8;
            int i9;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            if (cVarB.x()) {
                iN = cVarB.n(descriptor, 0);
                int iN3 = cVarB.n(descriptor, 1);
                iN2 = cVarB.n(descriptor, 2);
                i8 = iN3;
                i9 = 7;
            } else {
                boolean z8 = true;
                iN = 0;
                int iN4 = 0;
                int iN5 = 0;
                int i10 = 0;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    if (iE == -1) {
                        z8 = false;
                    } else if (iE == 0) {
                        iN = cVarB.n(descriptor, 0);
                        i10 |= 1;
                    } else if (iE == 1) {
                        iN5 = cVarB.n(descriptor, 1);
                        i10 |= 2;
                    } else {
                        if (iE != 2) {
                            throw new p(iE);
                        }
                        iN4 = cVarB.n(descriptor, 2);
                        i10 |= 4;
                    }
                }
                iN2 = iN4;
                i8 = iN5;
                i9 = i10;
            }
            int i11 = iN;
            cVarB.c(descriptor);
            return new i(i9, i11, i8, iN2, null);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f encoder, i value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = encoder.b(descriptor);
            i.b(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            U u8 = U.f32069a;
            return new p116m7.b[]{u8, u8, u8};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f5039b;
        }

        @Override // q7.K
        public p116m7.b[] typeParametersSerializers() {
            return K.a.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final i a() {
            return c("2.1.2");
        }

        public final int b() {
            return Build.VERSION.SDK_INT;
        }

        public final i c(String str) {
            List listA0 = w.A0(str, new String[]{"."}, false, 0, 6, null);
            int size = listA0.size();
            if (size == 1) {
                return new i(Integer.parseInt((String) listA0.get(0)), 0, 0);
            }
            if (size == 2) {
                return new i(Integer.parseInt((String) listA0.get(0)), Integer.parseInt((String) listA0.get(1)), 0);
            }
            if (size == 3) {
                return new i(Integer.parseInt((String) listA0.get(0)), Integer.parseInt((String) listA0.get(1)), Integer.parseInt((String) listA0.get(2)));
            }
            throw new IllegalArgumentException("Version string is not in the correct format: " + str);
        }

        public final p116m7.b serializer() {
            return a.f5038a;
        }

        public b() {
        }
    }

    public i(int i8, int i9, int i10) {
        this.f5035a = i8;
        this.f5036b = i9;
        this.f5037c = i10;
    }

    public static final /* synthetic */ void b(i iVar, p7.d dVar, o7.f fVar) {
        dVar.u(fVar, 0, iVar.f5035a);
        dVar.u(fVar, 1, iVar.f5036b);
        dVar.u(fVar, 2, iVar.f5037c);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i other) {
        t.g(other, "other");
        int i8 = this.f5035a;
        int i9 = other.f5035a;
        if (i8 != i9) {
            return t.h(i8, i9);
        }
        int i10 = this.f5036b;
        int i11 = other.f5036b;
        return i10 != i11 ? t.h(i10, i11) : t.h(this.f5037c, other.f5037c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f5035a == iVar.f5035a && this.f5036b == iVar.f5036b && this.f5037c == iVar.f5037c;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f5035a) * 31) + Integer.hashCode(this.f5036b)) * 31) + Integer.hashCode(this.f5037c);
    }

    public String toString() {
        return this.f5035a + "." + this.f5036b + "." + this.f5037c;
    }

    @InterfaceC0916e
    public /* synthetic */ i(int i8, int i9, int i10, int i11, I0 i12) {
        if (7 != (i8 & 7)) {
            AbstractC2872x0.a(i8, 7, a.f5038a.getDescriptor());
        }
        this.f5035a = i9;
        this.f5036b = i10;
        this.f5037c = i11;
    }
}

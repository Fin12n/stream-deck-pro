package L3;

import C6.InterfaceC0916e;
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
public final class g {
    public static final b Companion = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f5015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5017c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements K {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f5018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ C2874y0 f5019b;

        static {
            a aVar = new a();
            f5018a = aVar;
            C2874y0 c2874y0 = new C2874y0("com.elgato.streamdeck.updateInfo.MobileUpdaterResponse", aVar, 3);
            c2874y0.l("minimumAppVersion", false);
            c2874y0.l("maximumAppVersion", false);
            c2874y0.l("minimumSDKVersion", false);
            f5019b = c2874y0;
        }

        @Override // p116m7.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public g deserialize(p7.e decoder) {
            int iN;
            int i8;
            i iVar;
            i iVar2;
            t.g(decoder, "decoder");
            o7.f descriptor = getDescriptor();
            p7.c cVarB = decoder.b(descriptor);
            if (cVarB.x()) {
                i.a aVar = i.a.f5038a;
                i iVar3 = (i) cVarB.u(descriptor, 0, aVar, null);
                iVar2 = (i) cVarB.u(descriptor, 1, aVar, null);
                iN = cVarB.n(descriptor, 2);
                i8 = 7;
                iVar = iVar3;
            } else {
                boolean z8 = true;
                int iN2 = 0;
                i iVar4 = null;
                i iVar5 = null;
                int i9 = 0;
                while (z8) {
                    int iE = cVarB.E(descriptor);
                    if (iE == -1) {
                        z8 = false;
                    } else if (iE == 0) {
                        iVar4 = (i) cVarB.u(descriptor, 0, i.a.f5038a, iVar4);
                        i9 |= 1;
                    } else if (iE == 1) {
                        iVar5 = (i) cVarB.u(descriptor, 1, i.a.f5038a, iVar5);
                        i9 |= 2;
                    } else {
                        if (iE != 2) {
                            throw new p(iE);
                        }
                        iN2 = cVarB.n(descriptor, 2);
                        i9 |= 4;
                    }
                }
                iN = iN2;
                i8 = i9;
                iVar = iVar4;
                iVar2 = iVar5;
            }
            cVarB.c(descriptor);
            return new g(i8, iVar, iVar2, iN, null);
        }

        @Override // p116m7.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void serialize(p7.f encoder, g value) {
            t.g(encoder, "encoder");
            t.g(value, "value");
            o7.f descriptor = getDescriptor();
            p7.d dVarB = encoder.b(descriptor);
            g.d(value, dVarB, descriptor);
            dVarB.c(descriptor);
        }

        @Override // q7.K
        public p116m7.b[] childSerializers() {
            i.a aVar = i.a.f5038a;
            return new p116m7.b[]{aVar, aVar, U.f32069a};
        }

        @Override // p116m7.b, p116m7.k, p116m7.a
        public o7.f getDescriptor() {
            return f5019b;
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

        public final p116m7.b serializer() {
            return a.f5018a;
        }

        public b() {
        }
    }

    @InterfaceC0916e
    public /* synthetic */ g(int i8, i iVar, i iVar2, int i9, I0 i10) {
        if (7 != (i8 & 7)) {
            AbstractC2872x0.a(i8, 7, a.f5018a.getDescriptor());
        }
        this.f5015a = iVar;
        this.f5016b = iVar2;
        this.f5017c = i9;
    }

    public static final /* synthetic */ void d(g gVar, p7.d dVar, o7.f fVar) {
        i.a aVar = i.a.f5038a;
        dVar.i(fVar, 0, aVar, gVar.f5015a);
        dVar.i(fVar, 1, aVar, gVar.f5016b);
        dVar.u(fVar, 2, gVar.f5017c);
    }

    public final i a() {
        return this.f5016b;
    }

    public final i b() {
        return this.f5015a;
    }

    public final int c() {
        return this.f5017c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return t.c(this.f5015a, gVar.f5015a) && t.c(this.f5016b, gVar.f5016b) && this.f5017c == gVar.f5017c;
    }

    public int hashCode() {
        return (((this.f5015a.hashCode() * 31) + this.f5016b.hashCode()) * 31) + Integer.hashCode(this.f5017c);
    }

    public String toString() {
        return "MobileUpdaterResponse(minimumAppVersion=" + this.f5015a + ", maximumAppVersion=" + this.f5016b + ", minimumSDKVersion=" + this.f5017c + ")";
    }

    public g(i minimumAppVersion, i maximumAppVersion, int i8) {
        t.g(minimumAppVersion, "minimumAppVersion");
        t.g(maximumAppVersion, "maximumAppVersion");
        this.f5015a = minimumAppVersion;
        this.f5016b = maximumAppVersion;
        this.f5017c = i8;
    }
}

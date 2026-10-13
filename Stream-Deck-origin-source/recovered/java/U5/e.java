package U5;

import C6.r;
import X5.AbstractC1691u;
import X6.m;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p205x6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10217b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10218c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f10217b = obj;
            this.f10218c |= Integer.MIN_VALUE;
            return e.a(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(c cVar, Charset charset, G6.d dVar) {
        a aVar;
        CharsetDecoder decoder;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f10218c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f10218c = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object objA = aVar.f10217b;
        Object objF = H6.c.f();
        int i9 = aVar.f10218c;
        if (i9 == 0) {
            r.b(objA);
            Charset charsetB = AbstractC1691u.b(cVar);
            if (charsetB != null) {
                charset = charsetB;
            }
            CharsetDecoder charsetDecoderNewDecoder = charset.newDecoder();
            H5.b bVarG1 = cVar.g1();
            m mVarI = K.i(k.class);
            p181u6.a aVarC = p181u6.b.c(X6.r.e(mVarI), K.b(k.class), mVarI);
            aVar.f10216a = charsetDecoderNewDecoder;
            aVar.f10218c = 1;
            objA = bVarG1.a(aVarC, aVar);
            if (objA == objF) {
                return objF;
            }
            decoder = charsetDecoderNewDecoder;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            decoder = (CharsetDecoder) aVar.f10216a;
            r.b(objA);
        }
        if (objA == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.core.ByteReadPacket");
        }
        t.f(decoder, "decoder");
        return p197w6.b.b(decoder, (k) objA, 0, 2, null);
    }

    public static /* synthetic */ Object b(c cVar, Charset charset, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            charset = Z6.c.f12941b;
        }
        return a(cVar, charset, dVar);
    }

    public static final void c(c cVar) {
        t.g(cVar, "<this>");
        G6.g.b bVarA = cVar.getCoroutineContext().A(InterfaceC1815v0.f15985O);
        t.d(bVarA);
        ((InterfaceC1818x) bVarA).i1();
    }

    public static final T5.c d(c cVar) {
        t.g(cVar, "<this>");
        return cVar.g1().f();
    }
}

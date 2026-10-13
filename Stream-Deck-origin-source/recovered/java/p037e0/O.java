package p037e0;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p010b0.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f20055a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends P {
        public b() {
            super(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a f(Object obj, int i8) {
            a aVar = new a(obj, null, 2, 0 == true ? 1 : 0);
            c().m(i8, aVar);
            return aVar;
        }
    }

    public O(b bVar) {
        this.f20055a = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x001a->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x001a->B:15:0x005f], SYNTHETIC] */
    @Override // p037e0.A, p037e0.InterfaceC2213i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public u0 a(j0 j0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        q qVarC = this.f20055a.c();
        int[] iArr = qVarC.f15602b;
        Object[] objArr = qVarC.f15603c;
        long[] jArr = qVarC.f15601a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i8 != length) {
                        break;
                        break;
                    }
                    i8++;
                } else {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            linkedHashMap.put(Integer.valueOf(iArr[i11]), ((a) objArr[i11]).d(j0Var.a()));
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i8 != length) {
                        break;
                    }
                    i8++;
                }
            }
        }
        return new u0(linkedHashMap, this.f20055a.b(), this.f20055a.a());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends N {
        public /* synthetic */ a(Object obj, B b8, int i8, AbstractC2633k abstractC2633k) {
            this(obj, (i8 & 2) != 0 ? D.e() : b8);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return t.c(aVar.b(), b()) && t.c(aVar.a(), a());
        }

        public int hashCode() {
            Object objB = b();
            return ((objB != null ? objB.hashCode() : 0) * 31) + a().hashCode();
        }

        public a(Object obj, B b8) {
            super(obj, b8, null);
        }
    }
}

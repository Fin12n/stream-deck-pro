package p053f7;

import G6.g;
import Q6.o;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.InterfaceC1815v0;
import p062g7.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f22351a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(2);
            this.f22351a = uVar;
        }

        public final Integer b(int i8, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVarA = this.f22351a.f22344b.A(key);
            if (key != InterfaceC1815v0.f15985O) {
                return Integer.valueOf(bVar != bVarA ? Integer.MIN_VALUE : i8 + 1);
            }
            InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) bVarA;
            t.e(bVar, "null cannot be cast to non-null type kotlinx.coroutines.Job");
            InterfaceC1815v0 interfaceC1815v0B = w.b((InterfaceC1815v0) bVar, interfaceC1815v0);
            if (interfaceC1815v0B == interfaceC1815v0) {
                if (interfaceC1815v0 != null) {
                    i8++;
                }
                return Integer.valueOf(i8);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC1815v0B + ", expected child of " + interfaceC1815v0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(u uVar, g gVar) {
        if (((Number) gVar.t(0, new a(uVar))).intValue() == uVar.f22345c) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + uVar.f22344b + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC1815v0 b(InterfaceC1815v0 interfaceC1815v0, InterfaceC1815v0 interfaceC1815v1) {
        while (interfaceC1815v0 != null) {
            if (interfaceC1815v0 == interfaceC1815v1 || !(interfaceC1815v0 instanceof C)) {
                return interfaceC1815v0;
            }
            interfaceC1815v0 = interfaceC1815v0.getParent();
        }
        return null;
    }
}

package com.elgato.streamdeck;

import A5.h;
import C6.G;
import F5.i;
import Q6.k;
import Q6.o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.F;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.S0;
import p017b7.Z;
import p215z0.AbstractC3182v;
import p215z0.B0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class DiKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f17507a = AbstractC3182v.e(a.f17509a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A5.c f17508b = A5.b.b(null, DiKt$applicationComponent$1.f17510a, 1, null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17509a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            return A5.b.c();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f17649a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F f8) {
            super(1);
            this.f17649a = f8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J invoke(h singleton) {
            t.g(singleton, "$this$singleton");
            return K.a(this.f17649a.P1(S0.b(null, 1, null)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f17650a = new c();

        public c() {
            super(2);
        }

        public final void b(h onClose, J it) {
            t.g(onClose, "$this$onClose");
            t.g(it, "it");
            InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) it.getCoroutineContext().A(InterfaceC1815v0.f15985O);
            if (interfaceC1815v0 != null) {
                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((h) obj, (J) obj2);
            return G.f1419a;
        }
    }

    public static final void a(A5.c.a aVar, F dispatcher) {
        t.g(aVar, "<this>");
        t.g(dispatcher, "dispatcher");
        ((i) aVar.m(new i(new A5.a(J.class, false, null, null), new b(dispatcher)))).g(c.f17650a);
    }

    public static /* synthetic */ void b(A5.c.a aVar, F f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = Z.a();
        }
        a(aVar, f8);
    }

    public static final A5.c c() {
        return f17508b;
    }

    public static final B0 d() {
        return f17507a;
    }
}

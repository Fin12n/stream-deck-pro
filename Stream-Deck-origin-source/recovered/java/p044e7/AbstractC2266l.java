package p044e7;

import G6.g;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p035d7.d;
import p053f7.h;
import p053f7.q;

/* JADX INFO: renamed from: e7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2266l {
    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f, int i8, d dVar) {
        if (i8 < 0 && i8 != -2 && i8 != -1) {
            throw new IllegalArgumentException(("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was " + i8).toString());
        }
        if (i8 == -1 && dVar != d.SUSPEND) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        }
        if (i8 == -1) {
            dVar = d.DROP_OLDEST;
            i8 = 0;
        }
        int i9 = i8;
        d dVar2 = dVar;
        if (interfaceC2260f instanceof q) {
            return q.a.a((q) interfaceC2260f, null, i9, dVar2, 1, null);
        }
        return new h(interfaceC2260f, null, i9, dVar2, 2, null);
    }

    public static /* synthetic */ InterfaceC2260f b(InterfaceC2260f interfaceC2260f, int i8, d dVar, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = -2;
        }
        if ((i9 & 2) != 0) {
            dVar = d.SUSPEND;
        }
        return AbstractC2262h.c(interfaceC2260f, i8, dVar);
    }

    public static final void c(g gVar) {
        if (gVar.A(InterfaceC1815v0.f15985O) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + gVar).toString());
    }

    public static final InterfaceC2260f d(InterfaceC2260f interfaceC2260f) {
        return b(interfaceC2260f, -1, null, 2, null);
    }

    public static final InterfaceC2260f e(InterfaceC2260f interfaceC2260f, g gVar) {
        c(gVar);
        if (t.c(gVar, G6.h.f2820a)) {
            return interfaceC2260f;
        }
        if (interfaceC2260f instanceof q) {
            return q.a.a((q) interfaceC2260f, gVar, 0, null, 6, null);
        }
        return new h(interfaceC2260f, gVar, 0, null, 12, null);
    }
}

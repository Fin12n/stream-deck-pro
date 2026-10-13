package com.amazon.device.iap.internal.a.g;

import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a {
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // com.amazon.a.a.n.a.h
    public void l() {
        Object objA = j().a().a(com.amazon.a.a.o.b.ao);
        if (objA != null) {
            Boolean bool = Boolean.TRUE;
            if (bool.equals(objA)) {
                a(com.amazon.a.a.o.b.ab, bool);
            } else {
                a(com.amazon.a.a.o.b.ab, Boolean.FALSE);
            }
        } else {
            a(com.amazon.a.a.o.b.ab, Boolean.FALSE);
        }
        super.l();
    }

    public c(com.amazon.device.iap.internal.a.c cVar, boolean z8) {
        super(cVar, QhsKALGiniuQ.aCn);
        a(com.amazon.a.a.o.b.aa, Boolean.valueOf(z8));
    }
}

package com.revenuecat.purchases.paywalls;

import Z6.w;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;
import o7.e;
import o7.f;
import o7.i;
import p116m7.b;
import p125n7.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class EmptyStringToNullSerializer implements b {
    public static final EmptyStringToNullSerializer INSTANCE = new EmptyStringToNullSerializer();
    private static final b delegate = a.u(a.J(O.f28784a));
    private static final f descriptor = i.a("EmptyStringToNullSerializer", e.i.f30979a);

    private EmptyStringToNullSerializer() {
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.a
    public String deserialize(p7.e decoder) {
        t.g(decoder, "decoder");
        String str = (String) delegate.deserialize(decoder);
        if (str == null || w.b0(str)) {
            return null;
        }
        return str;
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, String str) {
        t.g(encoder, "encoder");
        if (str == null) {
            encoder.F("");
        } else {
            encoder.F(str);
        }
    }
}

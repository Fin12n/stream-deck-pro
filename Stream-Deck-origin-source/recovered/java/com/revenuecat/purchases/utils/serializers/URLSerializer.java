package com.revenuecat.purchases.utils.serializers;

import java.net.URL;
import kotlin.jvm.internal.t;
import o7.e;
import o7.f;
import o7.i;
import p116m7.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class URLSerializer implements b {
    public static final URLSerializer INSTANCE = new URLSerializer();
    private static final f descriptor = i.a("URL", e.i.f30979a);

    private URLSerializer() {
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.a
    public URL deserialize(p7.e decoder) {
        t.g(decoder, "decoder");
        return new URL(decoder.s());
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, URL value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        String string = value.toString();
        t.f(string, "value.toString()");
        encoder.F(string);
    }
}

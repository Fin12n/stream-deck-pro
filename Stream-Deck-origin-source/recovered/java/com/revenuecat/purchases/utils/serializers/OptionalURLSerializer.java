package com.revenuecat.purchases.utils.serializers;

import java.net.MalformedURLException;
import java.net.URL;
import kotlin.jvm.internal.t;
import o7.e;
import o7.f;
import o7.i;
import p116m7.b;
import p125n7.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class OptionalURLSerializer implements b {
    public static final OptionalURLSerializer INSTANCE = new OptionalURLSerializer();
    private static final b delegate = a.u(URLSerializer.INSTANCE);
    private static final f descriptor = i.a("URL?", e.i.f30979a);

    private OptionalURLSerializer() {
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // p116m7.a
    public URL deserialize(p7.e decoder) {
        t.g(decoder, "decoder");
        try {
            return (URL) delegate.deserialize(decoder);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, URL url) {
        t.g(encoder, "encoder");
        if (url == null) {
            encoder.F("");
        } else {
            delegate.serialize(encoder, url);
        }
    }
}

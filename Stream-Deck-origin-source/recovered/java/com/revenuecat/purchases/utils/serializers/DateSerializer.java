package com.revenuecat.purchases.utils.serializers;

import java.util.Date;
import kotlin.jvm.internal.t;
import o7.e;
import o7.f;
import o7.i;
import p116m7.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DateSerializer implements b {
    public static final DateSerializer INSTANCE = new DateSerializer();

    private DateSerializer() {
    }

    @Override // p116m7.b, p116m7.k, p116m7.a
    public f getDescriptor() {
        return i.a("Date", e.g.f30977a);
    }

    @Override // p116m7.a
    public Date deserialize(p7.e decoder) {
        t.g(decoder, "decoder");
        return new Date(decoder.t());
    }

    @Override // p116m7.k
    public void serialize(p7.f encoder, Date value) {
        t.g(encoder, "encoder");
        t.g(value, "value");
        encoder.D(value.getTime());
    }
}

package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public interface T extends U {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a extends U, Cloneable {
        T build();

        T buildPartial();

        a mergeFrom(T t8);

        a mergeFrom(AbstractC2097h abstractC2097h, C2106q c2106q);

        a mergeFrom(AbstractC2098i abstractC2098i, C2106q c2106q);
    }

    g0 getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    AbstractC2097h toByteString();

    void writeTo(AbstractC2100k abstractC2100k);
}

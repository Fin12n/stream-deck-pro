package com.revenuecat.purchases.common;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(s sVar, byte[] bArr) {
        t.g(sVar, "<this>");
        t.g(bArr, WaYxBuDSBD.YTZKkw);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}

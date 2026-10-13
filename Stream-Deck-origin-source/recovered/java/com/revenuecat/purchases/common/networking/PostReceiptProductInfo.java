package com.revenuecat.purchases.common.networking;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class PostReceiptProductInfo {
    private final Boolean shouldConsume;

    public PostReceiptProductInfo(Boolean bool) {
        this.shouldConsume = bool;
    }

    public static /* synthetic */ PostReceiptProductInfo copy$default(PostReceiptProductInfo postReceiptProductInfo, Boolean bool, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bool = postReceiptProductInfo.shouldConsume;
        }
        return postReceiptProductInfo.copy(bool);
    }

    public final Boolean component1() {
        return this.shouldConsume;
    }

    public final PostReceiptProductInfo copy(Boolean bool) {
        return new PostReceiptProductInfo(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PostReceiptProductInfo) && t.c(this.shouldConsume, ((PostReceiptProductInfo) obj).shouldConsume);
    }

    public final Boolean getShouldConsume() {
        return this.shouldConsume;
    }

    public int hashCode() {
        Boolean bool = this.shouldConsume;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "PostReceiptProductInfo(shouldConsume=" + this.shouldConsume + ')';
    }
}

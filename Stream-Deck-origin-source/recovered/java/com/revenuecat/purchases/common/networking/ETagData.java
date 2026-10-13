package com.revenuecat.purchases.common.networking;

import java.util.Date;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ETagData {
    private final String eTag;
    private final Date lastRefreshTime;

    public ETagData(String eTag, Date date) {
        t.g(eTag, "eTag");
        this.eTag = eTag;
        this.lastRefreshTime = date;
    }

    public static /* synthetic */ ETagData copy$default(ETagData eTagData, String str, Date date, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = eTagData.eTag;
        }
        if ((i8 & 2) != 0) {
            date = eTagData.lastRefreshTime;
        }
        return eTagData.copy(str, date);
    }

    public final String component1() {
        return this.eTag;
    }

    public final Date component2() {
        return this.lastRefreshTime;
    }

    public final ETagData copy(String eTag, Date date) {
        t.g(eTag, "eTag");
        return new ETagData(eTag, date);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETagData)) {
            return false;
        }
        ETagData eTagData = (ETagData) obj;
        return t.c(this.eTag, eTagData.eTag) && t.c(this.lastRefreshTime, eTagData.lastRefreshTime);
    }

    public final String getETag() {
        return this.eTag;
    }

    public final Date getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    public int hashCode() {
        int iHashCode = this.eTag.hashCode() * 31;
        Date date = this.lastRefreshTime;
        return iHashCode + (date == null ? 0 : date.hashCode());
    }

    public String toString() {
        return "ETagData(eTag=" + this.eTag + ", lastRefreshTime=" + this.lastRefreshTime + ')';
    }
}

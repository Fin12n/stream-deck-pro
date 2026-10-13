package com.google.android.gms.internal.play_billing;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class I implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        S s8 = (S) obj;
        S s9 = (S) obj2;
        H h8 = new H(s8);
        H h9 = new H(s9);
        while (h8.hasNext() && h9.hasNext()) {
            int iCompareTo = Integer.valueOf(h8.zza() & 255).compareTo(Integer.valueOf(h9.zza() & 255));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(s8.t()).compareTo(Integer.valueOf(s9.t()));
    }
}

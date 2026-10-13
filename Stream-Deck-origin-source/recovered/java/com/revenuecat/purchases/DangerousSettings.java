package com.revenuecat.purchases;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class DangerousSettings {
    private final boolean autoSyncPurchases;
    private final boolean customEntitlementComputation;

    /* JADX WARN: Illegal instructions before constructor call */
    public DangerousSettings() {
        boolean z8 = false;
        this(z8, z8, 3, null);
    }

    public static /* synthetic */ DangerousSettings copy$default(DangerousSettings dangerousSettings, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = dangerousSettings.autoSyncPurchases;
        }
        if ((i8 & 2) != 0) {
            z9 = dangerousSettings.customEntitlementComputation;
        }
        return dangerousSettings.copy(z8, z9);
    }

    public final boolean component1() {
        return this.autoSyncPurchases;
    }

    public final boolean component2$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    public final DangerousSettings copy(boolean z8, boolean z9) {
        return new DangerousSettings(z8, z9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DangerousSettings)) {
            return false;
        }
        DangerousSettings dangerousSettings = (DangerousSettings) obj;
        return this.autoSyncPurchases == dangerousSettings.autoSyncPurchases && this.customEntitlementComputation == dangerousSettings.customEntitlementComputation;
    }

    public final boolean getAutoSyncPurchases() {
        return this.autoSyncPurchases;
    }

    public final boolean getCustomEntitlementComputation$purchases_defaultsRelease() {
        return this.customEntitlementComputation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public int hashCode() {
        boolean z8 = this.autoSyncPurchases;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i8 = r8 * 31;
        boolean z9 = this.customEntitlementComputation;
        return i8 + (z9 ? 1 : z9);
    }

    public String toString() {
        return "DangerousSettings(autoSyncPurchases=" + this.autoSyncPurchases + ", customEntitlementComputation=" + this.customEntitlementComputation + ')';
    }

    public DangerousSettings(boolean z8, boolean z9) {
        this.autoSyncPurchases = z8;
        this.customEntitlementComputation = z9;
    }

    public /* synthetic */ DangerousSettings(boolean z8, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? false : z9);
    }

    public DangerousSettings(boolean z8) {
        this(z8, false);
    }

    public /* synthetic */ DangerousSettings(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? true : z8);
    }
}

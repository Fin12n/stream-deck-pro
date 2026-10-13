package V1;

import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AccessibilityRecord f10514a;

    @Deprecated
    public n(Object obj) {
        this.f10514a = (AccessibilityRecord) obj;
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollX(i8);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i8) {
        accessibilityRecord.setMaxScrollY(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        AccessibilityRecord accessibilityRecord = this.f10514a;
        if (accessibilityRecord == null) {
            return nVar.f10514a == null;
        }
        return accessibilityRecord.equals(nVar.f10514a);
    }

    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f10514a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}

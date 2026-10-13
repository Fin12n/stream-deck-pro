package p098k7;

import p062g7.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G f28755a = new G("NO_OWNER");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final G f28756b = new G("ALREADY_LOCKED_BY_OWNER");

    public static final a a(boolean z8) {
        return new b(z8);
    }

    public static /* synthetic */ a b(boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return a(z8);
    }
}

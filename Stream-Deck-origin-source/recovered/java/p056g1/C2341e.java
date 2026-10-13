package p056g1;

import androidx.compose.ui.focus.e;

/* JADX INFO: renamed from: g1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2341e implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2341e f23584a = new C2341e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f23585b;

    public final boolean b() {
        return f23585b != null;
    }

    @Override // androidx.compose.ui.focus.e
    public boolean e() {
        Boolean bool = f23585b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw new IllegalStateException("canFocus is read before it is written");
    }

    @Override // androidx.compose.ui.focus.e
    public void l(boolean z8) {
        f23585b = Boolean.valueOf(z8);
    }

    public final void n() {
        f23585b = null;
    }
}

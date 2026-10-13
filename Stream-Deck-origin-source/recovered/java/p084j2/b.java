package p084j2;

import android.text.Editable;
import p066h2.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f28134a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile Editable.Factory f28135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f28136c;

    public b() {
        try {
            f28136c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f28135b == null) {
            synchronized (f28134a) {
                try {
                    if (f28135b == null) {
                        f28135b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f28135b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class cls = f28136c;
        return cls != null ? i.c(cls, charSequence) : super.newEditable(charSequence);
    }
}

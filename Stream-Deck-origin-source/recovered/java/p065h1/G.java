package p065h1;

import android.content.Context;
import android.graphics.Typeface;
import p168t1.InterfaceC3008m;
import p168t1.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class G implements InterfaceC3008m.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24102a;

    public G(Context context) {
        this.f24102a = context;
    }

    @Override // p168t1.InterfaceC3008m.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Typeface a(InterfaceC3008m interfaceC3008m) {
        if (interfaceC3008m instanceof M) {
            return H.f24103a.a(this.f24102a, ((M) interfaceC3008m).d());
        }
        throw new IllegalArgumentException("Unknown font type: " + interfaceC3008m);
    }
}

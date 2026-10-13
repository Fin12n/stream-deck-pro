package p178u3;

import android.content.res.Resources;
import java.util.Arrays;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements O3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f34499a;

    public d(Resources resources) {
        t.g(resources, "resources");
        this.f34499a = resources;
    }

    @Override // O3.d
    public String a(int i8, String... formatArgs) {
        t.g(formatArgs, "formatArgs");
        String string = this.f34499a.getString(i8, Arrays.copyOf(formatArgs, formatArgs.length));
        t.f(string, "getString(...)");
        return string;
    }
}

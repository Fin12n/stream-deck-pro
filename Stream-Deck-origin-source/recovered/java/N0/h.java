package N0;

import android.content.ClipData;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClipData f5816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5818c;

    public h(ClipData clipData, Object obj, int i8) {
        this.f5816a = clipData;
        this.f5817b = obj;
        this.f5818c = i8;
    }

    public final ClipData a() {
        return this.f5816a;
    }

    public final int b() {
        return this.f5818c;
    }

    public final Object c() {
        return this.f5817b;
    }

    public /* synthetic */ h(ClipData clipData, Object obj, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(clipData, (i9 & 2) != 0 ? null : obj, (i9 & 4) != 0 ? 0 : i8);
    }
}

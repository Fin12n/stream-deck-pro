package p203x4;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Status f37382a;

    public b(Status status) {
        super(status.b() + ": " + (status.c() != null ? status.c() : ""));
        this.f37382a = status;
    }

    public Status a() {
        return this.f37382a;
    }
}

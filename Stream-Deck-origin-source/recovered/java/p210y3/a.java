package p210y3;

import java.util.UUID;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements T2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38265a;

    public a() {
        String string = UUID.randomUUID().toString();
        t.f(string, "toString(...)");
        this.f38265a = string;
    }

    @Override // T2.a
    public String getKey() {
        return this.f38265a;
    }
}

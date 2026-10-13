package p078i5;

import p024c5.B;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f24735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24736b;

    public a(Class<Object> cls, Object obj) {
        this.f24735a = (Class) B.b(cls);
        this.f24736b = B.b(obj);
    }

    public Class a() {
        return this.f24735a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f24735a, this.f24736b);
    }
}

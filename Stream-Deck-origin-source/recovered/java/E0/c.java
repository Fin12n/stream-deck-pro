package E0;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b implements Map.Entry, R6.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f1989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1990d;

    public c(i iVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.f1989c = iVar;
        this.f1990d = obj2;
    }

    public void a(Object obj) {
        this.f1990d = obj;
    }

    @Override // E0.b, java.util.Map.Entry
    public Object getValue() {
        return this.f1990d;
    }

    @Override // E0.b, java.util.Map.Entry
    public Object setValue(Object obj) {
        Object value = getValue();
        a(obj);
        this.f1989c.c(getKey(), obj);
        return value;
    }
}

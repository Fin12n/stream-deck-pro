package p031d3;

import java.util.ArrayList;
import java.util.List;
import p076i3.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19771c;

    public h(List<i> list) {
        this.f19771c = list;
        this.f19769a = new ArrayList(list.size());
        this.f19770b = new ArrayList(list.size());
        for (int i8 = 0; i8 < list.size(); i8++) {
            this.f19769a.add(list.get(i8).b().a());
            this.f19770b.add(list.get(i8).c().a());
        }
    }

    public List a() {
        return this.f19769a;
    }

    public List b() {
        return this.f19771c;
    }

    public List c() {
        return this.f19770b;
    }
}

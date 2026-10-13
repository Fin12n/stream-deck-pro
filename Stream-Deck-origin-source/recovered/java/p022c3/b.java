package p022c3;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16075a = new ArrayList();

    public void a(u uVar) {
        this.f16075a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f16075a.size() - 1; size >= 0; size--) {
            j.b(path, (u) this.f16075a.get(size));
        }
    }
}

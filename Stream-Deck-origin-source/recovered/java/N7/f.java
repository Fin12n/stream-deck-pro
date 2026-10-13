package N7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f implements ILoggerFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7526a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7527b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedBlockingQueue f7528c = new LinkedBlockingQueue();

    @Override // org.slf4j.ILoggerFactory
    public synchronized L7.a a(String str) {
        e eVar;
        eVar = (e) this.f7527b.get(str);
        if (eVar == null) {
            eVar = new e(str, this.f7528c, this.f7526a);
            this.f7527b.put(str, eVar);
        }
        return eVar;
    }

    public void b() {
        this.f7527b.clear();
        this.f7528c.clear();
    }

    public LinkedBlockingQueue c() {
        return this.f7528c;
    }

    public List d() {
        return new ArrayList(this.f7527b.values());
    }

    public void e() {
        this.f7526a = true;
    }
}

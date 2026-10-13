package p184v1;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;
import p192w1.p;
import p192w1.q;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocaleList f35056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f35057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f35058c = p.a();

    @Override // p184v1.g
    public e b() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.f35058c) {
            e eVar = this.f35057b;
            if (eVar != null && localeList == this.f35056a) {
                return eVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i8 = 0; i8 < size; i8++) {
                arrayList.add(new d(new a(localeList.get(i8))));
            }
            e eVar2 = new e(arrayList);
            this.f35056a = localeList;
            this.f35057b = eVar2;
            return eVar2;
        }
    }

    @Override // p184v1.g
    public f c(String str) {
        return new a(Locale.forLanguageTag(str));
    }
}

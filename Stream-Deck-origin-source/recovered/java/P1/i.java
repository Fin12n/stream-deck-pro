package P1;

import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f8871a;

    public i(Object obj) {
        this.f8871a = (LocaleList) obj;
    }

    @Override // P1.h
    public String a() {
        return this.f8871a.toLanguageTags();
    }

    @Override // P1.h
    public Object b() {
        return this.f8871a;
    }

    public boolean equals(Object obj) {
        return this.f8871a.equals(((h) obj).b());
    }

    @Override // P1.h
    public Locale get(int i8) {
        return this.f8871a.get(i8);
    }

    public int hashCode() {
        return this.f8871a.hashCode();
    }

    @Override // P1.h
    public boolean isEmpty() {
        return this.f8871a.isEmpty();
    }

    @Override // P1.h
    public int size() {
        return this.f8871a.size();
    }

    public String toString() {
        return this.f8871a.toString();
    }
}

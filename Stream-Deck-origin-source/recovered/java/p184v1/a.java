package p184v1;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale f35055a;

    public a(Locale locale) {
        this.f35055a = locale;
    }

    @Override // p184v1.f
    public String a() {
        return this.f35055a.toLanguageTag();
    }

    public final Locale b() {
        return this.f35055a;
    }
}

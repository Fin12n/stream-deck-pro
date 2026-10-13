package p063h;

import P1.g;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static g a(g gVar, g gVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i8 = 0;
        while (i8 < gVar.g() + gVar2.g()) {
            Locale localeC = i8 < gVar.g() ? gVar.c(i8) : gVar2.c(i8 - gVar.g());
            if (localeC != null) {
                linkedHashSet.add(localeC);
            }
            i8++;
        }
        return g.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static g b(g gVar, g gVar2) {
        return (gVar == null || gVar.f()) ? g.e() : a(gVar, gVar2);
    }
}

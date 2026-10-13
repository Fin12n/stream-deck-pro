package A6;

import T0.Vl.PCRzgdeK;
import Z6.u;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {
    public static final int a(String name, int i8) {
        String property;
        Integer numM;
        t.g(name, "name");
        try {
            property = System.getProperty(PCRzgdeK.VJLElSRfmk + name);
        } catch (SecurityException unused) {
            property = null;
        }
        return (property == null || (numM = u.m(property)) == null) ? i8 : numM.intValue();
    }
}

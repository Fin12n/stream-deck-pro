package p037e0;

/* JADX INFO: renamed from: e0.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2224u {
    public static final C2223t a(double d8) {
        return d8 < 0.0d ? new C2223t(0.0d, Math.sqrt(Math.abs(d8))) : new C2223t(Math.sqrt(d8), 0.0d);
    }
}

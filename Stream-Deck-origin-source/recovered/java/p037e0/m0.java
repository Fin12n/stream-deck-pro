package p037e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface m0 {
    boolean a();

    long b(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3);

    AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3);

    default AbstractC2221q d(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return g(b(abstractC2221q, abstractC2221q2, abstractC2221q3), abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    AbstractC2221q g(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3);
}

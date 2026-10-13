package p200x1;

import C6.m;
import android.text.style.TtsSpan;
import p128o1.K;
import p128o1.M;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final TtsSpan a(K k8) {
        if (k8 instanceof M) {
            return b((M) k8);
        }
        throw new m();
    }

    public static final TtsSpan b(M m8) {
        return new TtsSpan.VerbatimBuilder(m8.a()).build();
    }
}

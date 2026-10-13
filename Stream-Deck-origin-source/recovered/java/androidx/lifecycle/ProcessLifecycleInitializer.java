package androidx.lifecycle;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements D2.b {
    @Override // D2.b
    public List a() {
        return D6.r.n();
    }

    @Override // D2.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceC1733p b(Context context) {
        kotlin.jvm.internal.t.g(context, "context");
        D2.a aVarE = D2.a.e(context);
        kotlin.jvm.internal.t.f(aVarE, "getInstance(context)");
        if (!aVarE.g(ProcessLifecycleInitializer.class)) {
            throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
        }
        C1729l.a(context);
        ProcessLifecycleOwner.b bVar = ProcessLifecycleOwner.f15256i;
        bVar.b(context);
        return bVar.a();
    }
}

package M0;

import android.view.View;
import android.view.autofill.AutofillManager;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f5066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f5067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AutofillManager f5068c;

    public a(View view, i iVar) {
        this.f5066a = view;
        this.f5067b = iVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f5068c = autofillManager;
        view.setImportantForAutofill(1);
    }

    public final AutofillManager a() {
        return this.f5068c;
    }

    public final i b() {
        return this.f5067b;
    }

    public final View c() {
        return this.f5066a;
    }
}

package B5;

import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1730m;
import androidx.lifecycle.InterfaceC1733p;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements InterfaceC1730m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1726i.a f1203a;

    public a(AbstractC1726i.a closeEvent) {
        t.g(closeEvent, "closeEvent");
        this.f1203a = closeEvent;
        if (closeEvent != AbstractC1726i.a.ON_PAUSE && closeEvent != AbstractC1726i.a.ON_STOP && closeEvent != AbstractC1726i.a.ON_DESTROY) {
            throw new IllegalArgumentException("closeEvent must be ON_PAUSE, ON_STOP or ON_DESTROY");
        }
    }

    public abstract void close();

    @Override // androidx.lifecycle.InterfaceC1730m
    public void j(InterfaceC1733p source, AbstractC1726i.a event) {
        t.g(source, "source");
        t.g(event, "event");
        if (event == this.f1203a) {
            close();
            source.w().d(this);
        }
    }
}

package p143q0;

import L0.i;
import P0.f;
import Q6.k;
import Z0.b;
import Z0.c;
import Z0.d;
import Z0.g;
import android.view.InputDevice;
import android.view.KeyEvent;
import kotlin.jvm.internal.u;
import p065h1.H0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f31425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ V f31426b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, V v8) {
            super(1);
            this.f31425a = fVar;
            this.f31426b = v8;
        }

        public final Boolean b(KeyEvent keyEvent) {
            InputDevice device = keyEvent.getDevice();
            boolean zI = false;
            if (device != null && device.supportsSource(513) && !device.isVirtual() && c.e(d.b(keyEvent), c.f12836a.a())) {
                if (K.c(keyEvent, 19)) {
                    zI = this.f31425a.i(androidx.compose.ui.focus.c.f14597b.h());
                } else if (K.c(keyEvent, 20)) {
                    zI = this.f31425a.i(androidx.compose.ui.focus.c.f14597b.a());
                } else if (K.c(keyEvent, 21)) {
                    zI = this.f31425a.i(androidx.compose.ui.focus.c.f14597b.d());
                } else if (K.c(keyEvent, 22)) {
                    zI = this.f31425a.i(androidx.compose.ui.focus.c.f14597b.g());
                } else if (K.c(keyEvent, 23)) {
                    H0 h0F = this.f31426b.f();
                    if (h0F != null) {
                        h0F.b();
                    }
                    zI = true;
                }
            }
            return Boolean.valueOf(zI);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((b) obj).f());
        }
    }

    public static final i b(i iVar, V v8, f fVar) {
        return androidx.compose.ui.input.key.a.b(iVar, new a(fVar, v8));
    }

    public static final boolean c(KeyEvent keyEvent, int i8) {
        return g.b(d.a(keyEvent)) == i8;
    }
}

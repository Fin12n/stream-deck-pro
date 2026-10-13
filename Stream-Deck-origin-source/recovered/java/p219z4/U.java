package p219z4;

import L4.e;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import p195w4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class U extends e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3194c f39111b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(AbstractC3194c abstractC3194c, Looper looper) {
        super(looper);
        this.f39111b = abstractC3194c;
    }

    public static final void a(Message message) {
        V v8 = (V) message.obj;
        v8.b();
        v8.e();
    }

    public static final boolean b(Message message) {
        int i8 = message.what;
        return i8 == 2 || i8 == 1 || i8 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f39111b.f39130C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i8 = message.what;
        if ((i8 == 1 || i8 == 7 || ((i8 == 4 && !this.f39111b.s()) || message.what == 5)) && !this.f39111b.g()) {
            a(message);
            return;
        }
        int i9 = message.what;
        if (i9 == 4) {
            this.f39111b.f39156z = new b(message.arg2);
            if (AbstractC3194c.f0(this.f39111b)) {
                AbstractC3194c abstractC3194c = this.f39111b;
                if (!abstractC3194c.f39128A) {
                    abstractC3194c.g0(3, null);
                    return;
                }
            }
            AbstractC3194c abstractC3194c2 = this.f39111b;
            b bVar = abstractC3194c2.f39156z != null ? abstractC3194c2.f39156z : new b(8);
            this.f39111b.f39146p.b(bVar);
            this.f39111b.K(bVar);
            return;
        }
        if (i9 == 5) {
            AbstractC3194c abstractC3194c3 = this.f39111b;
            b bVar2 = abstractC3194c3.f39156z != null ? abstractC3194c3.f39156z : new b(8);
            this.f39111b.f39146p.b(bVar2);
            this.f39111b.K(bVar2);
            return;
        }
        if (i9 == 3) {
            Object obj = message.obj;
            b bVar3 = new b(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f39111b.f39146p.b(bVar3);
            this.f39111b.K(bVar3);
            return;
        }
        if (i9 == 6) {
            this.f39111b.g0(5, null);
            AbstractC3194c abstractC3194c4 = this.f39111b;
            if (abstractC3194c4.f39151u != null) {
                abstractC3194c4.f39151u.a(message.arg2);
            }
            this.f39111b.L(message.arg2);
            AbstractC3194c.e0(this.f39111b, 5, 1, null);
            return;
        }
        if (i9 == 2 && !this.f39111b.a()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((V) message.obj).c();
            return;
        }
        Log.wtf("GmsClient", "Don't know how to handle message: " + message.what, new Exception());
    }
}

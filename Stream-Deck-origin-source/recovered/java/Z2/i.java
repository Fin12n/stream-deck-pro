package Z2;

import android.util.Log;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f12855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f12856b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12857a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.Verbose.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.Debug.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.Error.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.Assert.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f12857a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // Z2.h
    public void b(p severity, String message, String tag, Throwable th) {
        t.g(severity, "severity");
        t.g(message, "message");
        t.g(tag, "tag");
        String strC = this.f12855a.c(null, null, l.a(message));
        try {
            if (th == null) {
                switch (a.f12857a[severity.ordinal()]) {
                    case 1:
                        Log.v(tag, strC);
                        break;
                    case 2:
                        Log.d(tag, strC);
                        break;
                    case 3:
                        Log.i(tag, strC);
                        break;
                    case 4:
                        Log.w(tag, strC);
                        break;
                    case 5:
                        Log.e(tag, strC);
                        break;
                    case 6:
                        Log.wtf(tag, strC);
                        break;
                }
            }
            switch (a.f12857a[severity.ordinal()]) {
                case 1:
                    Log.v(tag, strC, th);
                    break;
                case 2:
                    Log.d(tag, strC, th);
                    break;
                case 3:
                    Log.i(tag, strC, th);
                    break;
                case 4:
                    Log.w(tag, strC, th);
                    break;
                case 5:
                    Log.e(tag, strC, th);
                    break;
                case 6:
                    Log.wtf(tag, strC, th);
                    break;
            }
        } catch (Exception unused) {
            this.f12856b.b(severity, message, tag, th);
        }
    }

    public i(m messageStringFormatter) {
        t.g(messageStringFormatter, "messageStringFormatter");
        this.f12855a = messageStringFormatter;
        this.f12856b = new c(messageStringFormatter);
    }

    public /* synthetic */ i(m mVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? d.f12850a : mVar);
    }
}

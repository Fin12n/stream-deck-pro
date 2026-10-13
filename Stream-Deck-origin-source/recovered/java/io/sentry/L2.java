package io.sentry;

import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Double f25930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Double f25931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f25932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f25933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f25934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f25935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f25936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f25937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f25938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f25939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f25940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public io.sentry.protocol.o f25942m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        LOW(0.8f, 50000, 10),
        MEDIUM(1.0f, 75000, 30),
        HIGH(1.0f, 100000, 50);

        public final int bitRate;
        public final int screenshotQuality;
        public final float sizeScale;

        a(float f8, int i8, int i9) {
            this.sizeScale = f8;
            this.bitRate = i8;
            this.screenshotQuality = i9;
        }

        public String serializedName() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public L2(boolean z8, io.sentry.protocol.o oVar) {
        this.f25932c = new CopyOnWriteArraySet();
        this.f25933d = new CopyOnWriteArraySet();
        this.f25934e = null;
        this.f25935f = null;
        this.f25936g = a.MEDIUM;
        this.f25937h = 1;
        this.f25938i = 30000L;
        this.f25939j = 5000L;
        this.f25940k = 3600000L;
        this.f25941l = true;
        if (z8) {
            return;
        }
        s(true);
        r(true);
        this.f25932c.add("android.webkit.WebView");
        this.f25932c.add("android.widget.VideoView");
        this.f25932c.add("androidx.media3.ui.PlayerView");
        this.f25932c.add("com.google.android.exoplayer2.ui.PlayerView");
        this.f25932c.add("com.google.android.exoplayer2.ui.StyledPlayerView");
        this.f25942m = oVar;
    }

    public void a(String str) {
        this.f25932c.add(str);
    }

    public void b(String str) {
        this.f25933d.add(str);
    }

    public long c() {
        return this.f25938i;
    }

    public int d() {
        return this.f25937h;
    }

    public Set e() {
        return this.f25932c;
    }

    public String f() {
        return this.f25934e;
    }

    public Double g() {
        return this.f25931b;
    }

    public a h() {
        return this.f25936g;
    }

    public io.sentry.protocol.o i() {
        return this.f25942m;
    }

    public long j() {
        return this.f25940k;
    }

    public Double k() {
        return this.f25930a;
    }

    public long l() {
        return this.f25939j;
    }

    public Set m() {
        return this.f25933d;
    }

    public String n() {
        return this.f25935f;
    }

    public boolean o() {
        return k() != null && k().doubleValue() > 0.0d;
    }

    public boolean p() {
        return g() != null && g().doubleValue() > 0.0d;
    }

    public boolean q() {
        return this.f25941l;
    }

    public void r(boolean z8) {
        if (z8) {
            a("android.widget.ImageView");
            this.f25933d.remove("android.widget.ImageView");
        } else {
            b("android.widget.ImageView");
            this.f25932c.remove("android.widget.ImageView");
        }
    }

    public void s(boolean z8) {
        if (z8) {
            a("android.widget.TextView");
            this.f25933d.remove("android.widget.TextView");
        } else {
            b("android.widget.TextView");
            this.f25932c.remove("android.widget.TextView");
        }
    }

    public void t(Double d8) {
        if (io.sentry.util.y.e(d8)) {
            this.f25931b = d8;
            return;
        }
        throw new IllegalArgumentException("The value " + d8 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    public void u(io.sentry.protocol.o oVar) {
        this.f25942m = oVar;
    }

    public void v(Double d8) {
        if (io.sentry.util.y.e(d8)) {
            this.f25930a = d8;
            return;
        }
        throw new IllegalArgumentException("The value " + d8 + jULK.GeCNeob);
    }

    public L2(Double d8, Double d9, io.sentry.protocol.o oVar) {
        this(false, oVar);
        this.f25930a = d8;
        this.f25931b = d9;
        this.f25942m = oVar;
    }
}

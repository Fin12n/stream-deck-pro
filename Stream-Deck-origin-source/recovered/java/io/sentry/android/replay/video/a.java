package io.sentry.android.replay.video;

import java.io.File;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f26901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f26902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f26904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f26905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f26906f;

    public a(File file, int i8, int i9, int i10, int i11, String mimeType) {
        t.g(file, "file");
        t.g(mimeType, "mimeType");
        this.f26901a = file;
        this.f26902b = i8;
        this.f26903c = i9;
        this.f26904d = i10;
        this.f26905e = i11;
        this.f26906f = mimeType;
    }

    public final int a() {
        return this.f26905e;
    }

    public final File b() {
        return this.f26901a;
    }

    public final int c() {
        return this.f26904d;
    }

    public final String d() {
        return this.f26906f;
    }

    public final int e() {
        return this.f26903c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f26901a, aVar.f26901a) && this.f26902b == aVar.f26902b && this.f26903c == aVar.f26903c && this.f26904d == aVar.f26904d && this.f26905e == aVar.f26905e && t.c(this.f26906f, aVar.f26906f);
    }

    public final int f() {
        return this.f26902b;
    }

    public int hashCode() {
        return (((((((((this.f26901a.hashCode() * 31) + Integer.hashCode(this.f26902b)) * 31) + Integer.hashCode(this.f26903c)) * 31) + Integer.hashCode(this.f26904d)) * 31) + Integer.hashCode(this.f26905e)) * 31) + this.f26906f.hashCode();
    }

    public String toString() {
        return "MuxerConfig(file=" + this.f26901a + ", recordingWidth=" + this.f26902b + ", recordingHeight=" + this.f26903c + ", frameRate=" + this.f26904d + ", bitRate=" + this.f26905e + ", mimeType=" + this.f26906f + ')';
    }

    public /* synthetic */ a(File file, int i8, int i9, int i10, int i11, String str, int i12, AbstractC2633k abstractC2633k) {
        this(file, i8, i9, i10, i11, (i12 & 32) != 0 ? "video/avc" : str);
    }
}

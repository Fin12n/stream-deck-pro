package io.sentry;

import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import java.io.File;

/* JADX INFO: renamed from: io.sentry.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2479b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f26975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2582w0 f26976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f26978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f26979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f26980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f26981g;

    public C2479b(byte[] bArr, String str) {
        this(bArr, str, (String) null);
    }

    public static C2479b b(byte[] bArr) {
        return new C2479b(bArr, "thread-dump.txt", "text/plain", false);
    }

    public static C2479b c(io.sentry.protocol.G g8) {
        return new C2479b((InterfaceC2582w0) g8, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public String d() {
        return this.f26981g;
    }

    public byte[] e() {
        return this.f26975a;
    }

    public String f() {
        return this.f26979e;
    }

    public String g() {
        return this.f26978d;
    }

    public String h() {
        return this.f26977c;
    }

    public InterfaceC2582w0 i() {
        return this.f26976b;
    }

    public boolean j() {
        return this.f26980f;
    }

    public C2479b(byte[] bArr, String str, String str2) {
        this(bArr, str, str2, false);
    }

    public static C2479b a(byte[] bArr) {
        return new C2479b(bArr, LYdqVGvOGMNr.cWWGLdbhcW, "image/png", false);
    }

    public C2479b(byte[] bArr, String str, String str2, boolean z8) {
        this(bArr, str, str2, "event.attachment", z8);
    }

    public C2479b(byte[] bArr, String str, String str2, String str3, boolean z8) {
        this.f26975a = bArr;
        this.f26976b = null;
        this.f26978d = str;
        this.f26979e = str2;
        this.f26981g = str3;
        this.f26980f = z8;
    }

    public C2479b(InterfaceC2582w0 interfaceC2582w0, String str, String str2, String str3, boolean z8) {
        this.f26975a = null;
        this.f26976b = interfaceC2582w0;
        this.f26978d = str;
        this.f26979e = str2;
        this.f26981g = str3;
        this.f26980f = z8;
    }

    public C2479b(String str) {
        this(str, new File(str).getName());
    }

    public C2479b(String str, String str2) {
        this(str, str2, (String) null);
    }

    public C2479b(String str, String str2, String str3) {
        this(str, str2, str3, "event.attachment", false);
    }

    public C2479b(String str, String str2, String str3, String str4, boolean z8) {
        this.f26977c = str;
        this.f26978d = str2;
        this.f26976b = null;
        this.f26979e = str3;
        this.f26981g = str4;
        this.f26980f = z8;
    }

    public C2479b(String str, String str2, String str3, boolean z8) {
        this.f26981g = "event.attachment";
        this.f26977c = str;
        this.f26978d = str2;
        this.f26976b = null;
        this.f26979e = str3;
        this.f26980f = z8;
    }

    public C2479b(String str, String str2, String str3, boolean z8, String str4) {
        this.f26977c = str;
        this.f26978d = str2;
        this.f26976b = null;
        this.f26979e = str3;
        this.f26980f = z8;
        this.f26981g = str4;
    }
}

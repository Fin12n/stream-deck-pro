package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class A0 extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V0 f18727a;

    public A0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f18727a = null;
    }

    public static C2084z0 a() {
        return new C2084z0("Protocol message tag had invalid wire type.");
    }

    public static A0 b() {
        return new A0("Protocol message contained an invalid tag (zero).");
    }

    public static A0 c() {
        return new A0("Protocol message had invalid UTF-8.");
    }

    public static A0 d() {
        return new A0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static A0 e() {
        return new A0("Failed to parse the message.");
    }

    public static A0 g() {
        return new A0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final A0 f(V0 v8) {
        this.f18727a = v8;
        return this;
    }

    public A0(String str) {
        super(str);
        this.f18727a = null;
    }
}

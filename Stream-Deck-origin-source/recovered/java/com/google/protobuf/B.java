package com.google.protobuf;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class B extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public T f19058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19059b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends B {
        public a(String str) {
            super(str);
        }
    }

    public B(String str) {
        super(str);
        this.f19058a = null;
    }

    public static B b() {
        return new B("Protocol message end-group tag did not match expected tag.");
    }

    public static B c() {
        return new B("Protocol message contained an invalid tag (zero).");
    }

    public static B d() {
        return new B("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static B f() {
        return new B("CodedInputStream encountered a malformed varint.");
    }

    public static B g() {
        return new B("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static B h() {
        return new B("Failed to parse the message.");
    }

    public static B i() {
        return new B("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static B l() {
        return new B("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static B n() {
        return new B("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f19059b;
    }

    public void j() {
        this.f19059b = true;
    }

    public B k(T t8) {
        this.f19058a = t8;
        return this;
    }

    public B(Exception exc) {
        super(exc.getMessage(), exc);
        this.f19058a = null;
    }

    public B(String str, Exception exc) {
        super(str, exc);
        this.f19058a = null;
    }

    public B(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f19058a = null;
    }

    public B(String str, IOException iOException) {
        super(str, iOException);
        this.f19058a = null;
    }
}

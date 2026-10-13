package p062g7;

import C6.C0920i;
import G6.g;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.F;
import p017b7.H0;
import p017b7.InterfaceC1776b0;
import p017b7.InterfaceC1795l;
import p017b7.T;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x extends H0 implements T {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f23876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23877d;

    public /* synthetic */ x(Throwable th, String str, int i8, AbstractC2633k abstractC2633k) {
        this(th, (i8 & 2) != 0 ? null : str);
    }

    @Override // p017b7.F
    /* JADX INFO: renamed from: D1, reason: merged with bridge method [inline-methods] */
    public Void L0(g gVar, Runnable runnable) {
        M1();
        throw new C0920i();
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    public final Void M1() {
        String str;
        if (this.f23876c == null) {
            w.d();
            throw new C0920i();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Module with the Main dispatcher had failed to initialize");
        String str2 = this.f23877d;
        if (str2 != null) {
            str = ". " + str2;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString(), this.f23876c);
    }

    @Override // p017b7.T
    /* JADX INFO: renamed from: X1, reason: merged with bridge method [inline-methods] */
    public Void w0(long j8, InterfaceC1795l interfaceC1795l) {
        M1();
        throw new C0920i();
    }

    @Override // p017b7.F
    public boolean g1(g gVar) {
        M1();
        throw new C0920i();
    }

    @Override // p017b7.H0, p017b7.F
    public F k1(int i8) {
        M1();
        throw new C0920i();
    }

    @Override // p017b7.T
    public InterfaceC1776b0 o(long j8, Runnable runnable, g gVar) {
        M1();
        throw new C0920i();
    }

    @Override // p017b7.H0, p017b7.F
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        if (this.f23876c != null) {
            str = ", cause=" + this.f23876c;
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }

    public x(Throwable th, String str) {
        this.f23876c = th;
        this.f23877d = str;
    }

    @Override // p017b7.H0
    public H0 o1() {
        return this;
    }
}
